package Class55;

import java.util.ArrayList;
import java.util.List;

public class GenericsNotCovarient {
    
    public static void main(String[] args) {
        /*
        valid because an Integer is a Number. 
        therefore, we can use the followings.
        */
        Integer[] intArray = new Integer[10];
        Number[] numberArray = intArray;
        
        /*
        the same of above is not possible whether it is generic
        because generic is not covariant.
        */
        List<Integer> intList = new ArrayList();
        //List<Number> numberlist = intList;  //Invalid
    }
}
