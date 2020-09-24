package Class27;

abstract class A{
    
    abstract void callMe();
    void callMeToo(){
        System.out.println("This is a concrete Method.");
    }
}

class B extends A{
    
    @Override
    void callMe(){
        System.out.println("B's implementation of callme");
    }
}

public class AbstractDem {
    public static void main(String[] args) {
        B b = new B();
        b.callMe();
        b.callMeToo();
    }
}
