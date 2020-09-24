package Class54;

import java.util.ArrayList;
import java.util.List;

public class ExampleOne {
    
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add(new Integer(2));
        list.add("a String");
        /*
        we need to cast explicitly whether we want to use!
        */
        System.out.println((Integer) list.get(0));
        System.out.println((String) list.get(1));
        
        List<String> myStrList = new ArrayList();
        myStrList.add("a String");
        //myStrList.add(new Integer(2));  //this is how generics gives type safety
        System.out.println(myStrList.get(0));
        for (String s: myStrList){
            System.out.println(s); //no need to cast explicitly
        }
    }
}
