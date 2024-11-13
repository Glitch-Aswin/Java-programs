import java.util.Scanner;
import java.util.StringTokenizer;

public class Tokenizer2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str;
        
        System.out.println("Enter the string to be tokenized");

        str = sc.nextLine();
        StringTokenizer strtkns = new StringTokenizer(str);

        StringBuffer output = new StringBuffer("");

        while(strtkns.hasMoreElements()){
            String str1 = strtkns.nextToken().toLowerCase();
            StringBuffer strbfr = new StringBuffer(str1).reverse();
            if(str1.equals(strbfr.toString())){
                for(int i = 0;i<str1.length();i++){
                    output.append("*");
                }
                output.append(" ");
                System.out.println(">>>"+str1 + " is a palindrome");
                System.out.println();

            }else{
                output.append(str1).append(" ");
                System.out.println(str1 + " -> is not a palindrome");
                System.out.println();
            }
        }
        System.out.println("Output is: "+ output.toString());
        sc.close();
    }
}
