package Class57;

import java.util.ArrayList;
import java.util.List;

public class LowerBound {
    /*
    Lower bound Wild Card
    <List ? super Integer> means that the list is typed to either the
    Integer class or a superclass of Integer such as Number.
    */
    public static void add(List<? super Integer> list){
        list.add(new Integer(50));
    }
    
    public static void main(String[] args) {
        List<Number> inList = new ArrayList<>();
        inList.add(new Integer(5));
        inList.add(new Integer(3));
        inList.add(new Integer(6));
        add(inList);
        for (int i = 0; i < inList.size(); i++){
            System.out.println(inList.get(i));
        }
    }
}
