package Class42;

public class ExceptionThrow {
    
    static void validate(int age){
        if(age<18){
            throw new ArithmeticException("not allowed");
        } else{
            System.out.println("welcome to vote");
        }
    }
    
    public static void main(String[] args) {
        try{
            validate(13);
        } catch(ArithmeticException e){
            System.out.println(e);
        }
        System.out.println("Rest of the code!");
    }
}
