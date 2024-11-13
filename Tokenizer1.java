import java.util.Scanner;
import java.util.StringTokenizer;

public class Tokenizer1 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            String str;
            
            System.out.println("Enter the string to be tokenized");
            
            str = sc.nextLine();
            StringTokenizer strtkns = new StringTokenizer(str);
            
            
            while(strtkns.hasMoreElements()){
                System.out.println(strtkns.nextToken());
            }
        }
    }
}
