package Class44;

import java.io.IOException;

public class ExceptionOverridden {
    //Rule-1: Super class method does not declare an exception
     void msg(){
         System.out.println("parent");
     }
     
     //Rule-2: Super class method declare an exception
     public void someMethod() throws IOException{
         //method body
     }
}

class TestA extends ExceptionOverridden{
    /**
     * Rule-1
     */
    
    /*
    sub-class can override method without declaring exception
    */
//    @Override
//    void msg(){
//        System.out.println("child");
//    }
    
    /*
    sub-class can override method with unchecked exception throwing
    But it can't throw checked exception 
    */
    @Override
    void msg() throws ArithmeticException{
        System.out.println("child");
    }
    
    /**
     * Rule-2
     */
    
    /*
    Override method without any exception
    */
//    @Override
//    public void someMethod(){
//        //method body
//    }
    
    /*
    Can throw exception of the superclass's exception's sub class but can't exception's sub class
    */
    @Override
    public void someMethod() throws IOException{
        //method body
    }
    
    /*
    It will produce an error because it throws exception's superclass of superclass's exception
    */
//    @Override
//    public void someMethod() throws Exception{
//       //method body 
//    }
}