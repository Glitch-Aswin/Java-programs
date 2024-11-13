import java.io.*;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Tokenizer3 {
    static boolean checkEven(int len){
        return len%2==0;
        
    }
    public static void main(String[] args) {
        File inFile = new File("D://Dev//java2//input.txt");
        File outFile = new File("D://Dev//java2//output.txt");

        FileReader ins = null;
        FileWriter outs = null;

        ArrayList<String> palindromes = new ArrayList<>();
        
        try {
            ins = new FileReader(inFile);
            try (BufferedReader b = new BufferedReader(ins)) {
                outs = new FileWriter(outFile);
                String s ;
                StringBuilder strbldr = new StringBuilder();
                while((s=b.readLine()) !=null){
                    strbldr.append(s) ;
                }
                // while ((ch = ins.read()) != -1) {
                //     strbldr.append((char) ch);
                // }
                
                StringTokenizer tokens = new StringTokenizer(strbldr.toString());
                while (tokens.hasMoreTokens()) {
                    String str = tokens.nextToken();
                    StringBuilder reversedStr = new StringBuilder(str).reverse();
                    
                    if (str.equalsIgnoreCase(reversedStr.toString())) {
                        palindromes.add(str);
                        System.out.println(str + " is a palindrome");
                    }
                }
            }
            if (palindromes.isEmpty()) {
                System.out.println("No palindrome was found");
            } else {
                String highestPalindrome = palindromes.get(0);
                for (String palindrome : palindromes) {
                    if ((palindrome.length()>highestPalindrome.length())) {
                        highestPalindrome = palindrome;
                    }
                }
                outs.write(highestPalindrome);
                System.out.println("Highest palindrome written to output: " + highestPalindrome);
                if(checkEven(highestPalindrome.length())){
                    throw new EvenException("Palindrome is even lengthd");
                }else{
                    throw new OddException("Palindrome has odd length");
                }
            }
        } catch (IOException e) {
            System.err.println("File error: " + e.getMessage());
        }catch(EvenException | OddException e){
            System.err.println(e);
        }
        finally {
            try {
                if (ins != null) ins.close();
                if (outs != null) outs.close();
            } catch (IOException e) {
                System.err.println("Error closing file: " + e.getMessage());
            }
        }
    }
}

class EvenException extends Exception{
    EvenException(String s){
        super(s);
    }
}
class OddException extends Exception{
    OddException(String s){
        super(s);
    }
}