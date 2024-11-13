
import java.util.Scanner;


public class StringBuffer1 {
    Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuffer strbfr = new StringBuffer("");
        String str ;
        System.out.println("Enter the string");
        str = sc.nextLine();
        strbfr.append(str);
        StringBuffer rvrse = strbfr.reverse();
        if(rvrse.toString().toLowerCase().equals(str.toLowerCase())){
            System.out.println("Its palindromee");
        }
        

    }
}
