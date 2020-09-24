package Class11;

import java.util.Date;

public class ConstructorExample {
    double d;
    Date date = new Date();
    String s;
    
    /*
    This class contains more than one constructor and this is called constructor overloading.
    */

    public ConstructorExample() {
    }

    public ConstructorExample(double d) {
        this.d = d;
    }
    
    public static void main(String[]args){
        ConstructorExample obj = new ConstructorExample();
        
    }
}
