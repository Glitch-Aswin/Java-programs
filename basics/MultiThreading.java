class A extends Thread{
    int i = 0;
    public void run(){
        for(i = 0;i<100;i++){
            if(i%2 == 0 )
            System.out.println(i);
            try{
                A.sleep(500);
            }
            catch(InterruptedException e){
                    System.err.println(e);
                }
        }
    }
}
class B extends Thread{
    int i = 1;
    public void run(){
        for(i = 0;i<100;i++){
            if(i%2 != 0 )
            System.out.print(i+" ");
            try{
            B.sleep(500);
            }catch(InterruptedException e){
                System.err.println(e);
            }
        }
    }

}

public class MultiThreading {
    public static void main(String[] args) {
        A ob1 = new A();
        B ob2 = new B();
        ob1.start();
        ob2.start();
    }
}
