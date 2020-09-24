package Class52;

import java.util.*;

public class Simple {
    
    public static void main(String[] args) {
        ArrayList al = new ArrayList();
        al.add(new Student(101, "Rafi", 23));
        al.add(new Student(104, "Muhit", 12));
        al.add(new Student(103, "Khairul", 14));
        
        System.out.println("Sorting by name...");
        
        Collections.sort(al, new NameComparator());
        Iterator itr = al.iterator();
        while(itr.hasNext()){
            Student st = (Student) itr.next();
            System.out.println(st.rollno + " " + st.name + " " +st.age);
        }
        
        System.out.println("\nSorting by age...");
        
        Collections.sort(al, new AgeComparator());
        Iterator itr2 = al.iterator();
        while (itr2.hasNext()){
            Student st = (Student) itr2.next();
            System.out.println(st.rollno + " " + st.name + " " + st.age);
        }
    }
}
