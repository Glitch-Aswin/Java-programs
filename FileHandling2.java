import java.io.*;

public class FileHandling2 {
    public static void main(String args[]) {
        File inFile = new File("D:\\Dev\\java2\\input.txt")  ;   
        FileReader ins = null;
        int sum =0;
        try{
            ins = new FileReader(inFile);
            int ch ;
            while((ch = ins.read())!=-1){
                if(ch>=48 && ch<=57){
                    System.out.println(ch-48);
                    sum += (ch-48);
                }
            }
            System.out.println("Sum is "+sum);

        } catch(IOException e){
            System.out.println(e);
            System.exit(-1);
        }
        finally{
            try {
                ins.close();
            } catch (IOException e) {
            }
        }
    }
}
