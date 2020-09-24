package Class10;

import java.util.Date;

public class FieldInitialize {
    //Field variable declaration
    double d; //Initialization using default value
    Date date = new Date(); //Initialization using explicit value
    String s;  //Initialization using constructor

    public FieldInitialize(String s) {
        this.s = s;
    }
    
    public static void main(String[]args){
        FieldInitialize obj = new FieldInitialize("Ashraful");
        
        System.out.println(obj.d);
        System.out.println(obj.date);
        System.out.println(obj.s);
    }
}
