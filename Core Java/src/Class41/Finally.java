package Class41;

public class Finally {
    
    static void procB(){
        try{
            System.out.println("inside procB");
            return;
        } finally{
            System.out.println("procB's finally");
        }
    }
    
    static int processA(int x, int y){
        try{
            return x / y;
        } catch (ArithmeticException e){
            System.out.println("Exception thrown: " + e);
            return 0;
        } finally{
            System.out.println("finally block is always executed");
        }
    }
    
    public static void main(String[] args) {
        processA(25, 0);
    }
}
