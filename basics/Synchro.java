

class Print{
    public static synchronized void printDoc(String s){
        System.out.println("printing official "+s);
        System.out.println("printing unofficial "+s);
        System.out.println();
        
    }
}

class Doc extends Thread{
    String s;
    Doc(String str){
        this.s = str;
    }
    public void run(){
        Print.printDoc(s);
        try {
            Thread.sleep(1000); 
         } catch (Exception e) {
             System.err.println(e.getMessage());
         }
    }
}

public class Synchro {
    public static void main(String[] args) {
        Doc doc1 = new Doc("doc1");
        Doc doc2 = new Doc("doc2");
        Doc doc3 = new Doc("doc3");
        doc1.start();
        doc2.start();
        doc3.start();
    }
}
