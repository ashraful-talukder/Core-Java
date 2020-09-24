package Class51;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Sample {
    
    public static void main(String[] args) {
        ArrayList<Students> al = new ArrayList();
        al.add(new Students(101, "Ashraful", 23));
        al.add(new Students(105, "Bulbul", 27));
        al.add(new Students(107, "Litan", 21));
        
        Collections.sort(al);
        Iterator<Students> itr = al.iterator();
        while(itr.hasNext()){
            Students st = itr.next();
            System.out.println(st.rollno + " " + st.name + " " + st.age);
        }
    }
}
