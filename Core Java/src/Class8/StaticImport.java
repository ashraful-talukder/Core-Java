package Class8;

import static java.lang.Math.PI;
import java.util.Date;

public class StaticImport {
    
    public static void main(String[]args){
        System.out.println(PI);
        System.out.println(Math.E);
        System.out.println(Math.sqrt(9));
        System.out.println(Integer.parseInt("30"));
        Date dt = new Date();
    }
}
