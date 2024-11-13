import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

abstract class Employee {
    String name;
    int age;
    double bonus;
    double basicPay;
    double salary;
    String address;
    static int empCount = 0;

    public Employee(String name, int age, double bonus, double basicPay, String address) {
        this.name = name;
        this.age = age;
        this.bonus = bonus;
        this.basicPay = basicPay;
        this.address = address;
        empCount++;
    }

    public abstract void calculateSalary();

    public abstract String jobDescription();
}

class Developer extends Employee {
    public Developer(String name, int age, double bonus, double basicPay, String address) {
        super(name, age, bonus, basicPay, address);
    }

    @Override
    public void calculateSalary() {
        salary = bonus + basicPay;
    }

    @Override
    public String jobDescription() {
        return "Developer";
    }
}

class Manager extends Employee {
    public Manager(String name, int age, double bonus, double basicPay, String address) {
        super(name, age, bonus, basicPay, address);
    }

    @Override
    public void calculateSalary() {
        salary = bonus + basicPay;
    }

    @Override
    public String jobDescription() {
        return "Manager";
    }
}

public class EmployeeData {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Please provide the output file name as a command-line argument.");
            return;
        }

        String fileName = args[0];
        Scanner scanner = new Scanner(System.in);
        List<Employee> employees = new ArrayList<>();

        while (true) {
            System.out.println("Enter employee type (Developer/Manager) or 'exit' to finish:");
            String type = scanner.nextLine();

            if (type.equalsIgnoreCase("exit")) {
                break;
            }

            System.out.println("Enter name:");
            String name = scanner.nextLine();
            System.out.println("Enter age:");
            int age = Integer.parseInt(scanner.nextLine());
            System.out.println("Enter bonus:");
            double bonus = Double.parseDouble(scanner.nextLine());
            System.out.println("Enter basic pay:");
            double basicPay = Double.parseDouble(scanner.nextLine());
            System.out.println("Enter address:");
            String address = scanner.nextLine();

            Employee employee = null;
            if (type.equalsIgnoreCase("Developer")) {
                employee = new Developer(name, age, bonus, basicPay, address);
            } else if (type.equalsIgnoreCase("Manager")) {
                employee = new Manager(name, age, bonus, basicPay, address);
            } else {
                System.out.println("Invalid employee type! Please enter either 'Developer' or 'Manager'.");
                continue;
            }

            employee.calculateSalary();
            employees.add(employee);
        }

        writeToFile(employees, fileName);
        System.out.println("Employee data written to " + fileName);
    }

    private static void writeToFile(List<Employee> employees, String fileName) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
            writer.write("============\n");
            writer.write("Total employees: " + Employee.empCount + "\n");

            // Group employees by job description
            employees.stream()
                .map(Employee::jobDescription)
                .distinct()
                .forEach(description -> {
                    try {
                        long count = employees.stream()
                            .filter(e -> e.jobDescription().equals(description))
                            .count();
                        writer.write("Job description: " + description + "\n");
                        writer.write("Total number of Employees in the description: " + count + "\n");

                        int index = 1;
                        for (Employee e : employees) {
                            if (e.jobDescription().equals(description)) {
                                writer.write(index++ + ". " + e.name + "," + e.age + "," + e.salary + "," + description + "\n");
                            }
                        }
                        writer.write("\n");
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                });
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
