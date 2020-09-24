package Class42;

public class ExceptionThrows {
    
    /*
    here InvalidAgeException is a custom exception 
    */
    static void validate(int age)throws InvalidAgeException{
        if(age<18){
            throw new InvalidAgeException("not valid");
        } else{
            System.out.println("welcome to vote");
        }
    }
    
    public static void main(String[] args) {
        try{
            validate(13);
        } catch(InvalidAgeException e){
            System.out.println(e);
        }
        
        System.out.println("rest of the code");
    }
}
