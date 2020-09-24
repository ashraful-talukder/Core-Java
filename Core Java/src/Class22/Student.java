package Class22;

public class Student {
    /*
    State
    */
    int x;
    public static final String DAY = "SATURDAY";
    
    /*
    Behaviour
    */
    int sum(){
        return 0; 
    }
    
    public static void main(String[] args) {
        /*
        Here "student" is the identity of that object.
        */
        Student student = new Student();
        String s = "D";
        System.out.println(s.toString());
    }
}
