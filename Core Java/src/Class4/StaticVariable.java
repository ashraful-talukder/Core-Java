package Class4;

public class StaticVariable {
    
    private static double salary;
    int x;
    public static final String DEPARTMENT = "DEVELOPMENT";
    
    void test(){
        x = 0;
        salary = 345;
        /*
        Here, test method is non-static. Hence it can access both static and non-static instances without
        creating class object.
        */
    }
    
    public static void main(String[]args){
        //x = 100;
        /*
        Here, main method is static. Hence it can't access a non-static member like x.
        To acess that non-static member we need to use an object like below.
        But a static method can acess a static member.
        */
        StaticVariable sv = new StaticVariable();
        sv.x = 100;
        salary = 1000;
        System.out.println(DEPARTMENT+" average salary: "+salary);
    }
}
