import java.io.*;

class MyClass implements Serializable {
    String s;
    int n;

    MyClass(String s, int n) {
        this.s = s;
        this.n = n;
    }
}

class SerializationDemo {
    public static void main(String args[]) {
        PrintWriter pw = new PrintWriter(System.out, true);
        ObjectOutputStream fout = null;
        ObjectInputStream fin = null;

        if (args.length != 2)
            return;

        MyClass m1 = new MyClass("Hello", 9);

        // Writing the object to a file
        try {
            fout = new ObjectOutputStream(new FileOutputStream(args[0]));
            fout.writeObject(m1);
            fout.close();  // Close the output stream before reading
        } catch (IOException e) {
            pw.println("IO Exception during writing: " + e.getMessage());
        }

        // Reading the object from the file
        try {
            fin = new ObjectInputStream(new FileInputStream(args[0]));
            MyClass m2 = (MyClass) fin.readObject();
            pw.println("Read object: " + m2.s + " " + m2.n);

            ObjectOutputStream fout2 = new ObjectOutputStream(new FileOutputStream(args[1]));
            fout2.writeObject(m2);
            fout2.close();
            fin.close();  // Close the input stream after reading
        } catch (IOException | ClassNotFoundException e) {
            pw.println("IO Exception during reading: " + e.getMessage());
        }
    }
}
