package Class15;

public class NullPointer {
    static String s;
    
    /*
    This will produce a null pointer exception because the default value of s is null
    and java can't change null into string.
    */
    public static void main(String[]args){
        System.out.println(s.toString());
    }
}
