package Class55;

import java.util.ArrayList;
import java.util.List;

public class WildCards {
    /*
    Unboud Wildcard:
    List<?> means a list typed to an unknown type
    Its same as using <? extends object>
    */
    public static void processElements(List<?> elements){
        for (Object o: elements){
            System.out.println(o);
        }
    }
    
    public static void main(String[] args) {
        List<Integer> ints = new ArrayList<>();
        ints.add(new Integer(3));
        ints.add(new Integer(5));
        ints.add(new Integer(10));
        processElements(ints);
        
        List<Double> dts = new ArrayList<>();
        dts.add(new Double(3.3));
        dts.add(new Double(5.5));
        dts.add(new Double(10.2));
        processElements(dts);
        
    }
}
