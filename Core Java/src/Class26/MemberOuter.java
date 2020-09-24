package Class26;

public class MemberOuter {
    
    private int data = 30;
    
    /*
    Nested Member Inner Class
    */
    class Inner{
        
        void msg(){
            System.out.println("data is " + data);
        }
    }
    
    void display(){
        Inner in = new Inner();
        /*
        This is also a way to create object of the inner class
        */
        //MemberOuter.Inner another = new MemberOuter.Inner();
        in.msg();
    }
    
    public static void main(String[] args) {
        MemberOuter obj = new MemberOuter();
        obj.display();
    }
}
