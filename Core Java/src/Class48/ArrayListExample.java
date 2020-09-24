package Class48;

import java.util.ArrayList;

public class ArrayListExample {
    
    public static void main(String[] args) {
        /*
        "<String>" -this portion is called diamond head. This is used to make a
        generic ArrayList or something which is predefined data type with this 
        diamond head.
        
        The main task of generic is type safety.
        */
        ArrayList<String> list = new ArrayList();
        System.out.println("Size:: " + list.size() + " and, Element inside the ArrayList:: " + list);
        
        /*
        Add value directly
        */
        list.add("A");
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        list.add("E");
        list.add("F");
        list.add("G");
        /*
        Add value with position
        */
        list.add(2, "s");
        
        System.out.println("Size:: " + list.size() + " and, Element inside the Arraylist:: " + list);
        
        list.remove("A");
        list.remove(2);
        
        System.out.println("Size:: " + list.size() + " and, Element inside the Arraylist:: " + list);
        
        list.remove("C");
        list.add(2, "Z");
        
        System.out.println("Size:: " + list.size() + " and, Element inside the Arraylist:: " + list);
        
        for (int i = 0; i < list.size(); i++){
            String s = list.get(i);
            System.out.print(s);
        }
        System.out.println();
    }
}
