package Class24;

public class TestImplement implements TestB{
    
    public static void main(String[]args){
        TestImplement ti = new TestImplement();
        ti.print();
    }
    
    @Override
    public void print(){
        System.out.println("Printing.....");
        System.out.println(X);
    }
    
    @Override
    public void printX(){
        
    }
}
