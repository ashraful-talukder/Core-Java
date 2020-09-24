package Class51;

public class Students implements Comparable{
    
    int rollno;
    String name;
    int age;  
    
    Students(int rollno, String name, int age){
        this.rollno = rollno;
        this.name = name;
        this.age = age;
    }
    
    @Override
    public int compareTo(Object obj){
        Students st = (Students) obj;
//        if (age == st.age){
//            return 0;
//        } else if (age > st.age){
//            return 1;
//        } else{
//            return -1;
//        }
        System.out.println("========" + this.age + "compare with " + st.age+ "========");
        return this.age-st.age;
        //return st.age-this.age;  //decending order
    }
}
