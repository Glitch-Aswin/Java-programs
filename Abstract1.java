public class Abstract1 {
    public static void main(String[] args) {
        FirstClass f1 = new FirstClass();
        GeneralClass g1 = new GeneralClass();

        f1.notice();
        f1.bookSeat();

        f1.notice();
        f1.bookSeat();
        
        g1.notice();
        g1.bookSeat();
        
        g1.notice();
        g1.bookSeat();
        
        f1.notice();
        f1.bookSeat();
        g1.notice();
        g1.bookSeat();
        f1.notice();
        f1.bookSeat();
        g1.notice();
        g1.bookSeat();
        f1.notice();
        f1.bookSeat();
        g1.notice();
        g1.bookSeat();
        f1.notice();
        f1.bookSeat();
    }
}

abstract class Compartment{
    abstract void notice();
}

class FirstClass extends Compartment{
    int seats = 50 ;
    void bookSeat(){
        seats--;
        System.out.println("A seat has been booked for first class");
    }
    @Override
    void notice(){
        System.out.println("Number of seats availabe in first class are "+seats);
    }

}

class GeneralClass extends Compartment{
    int seats = 100 ;
    void bookSeat(){
        seats--;
        System.out.println("A seat has been booked for general");
    }
    @Override
    void notice(){
        System.out.println("Number of seats availabe in general are "+seats);
    }
}