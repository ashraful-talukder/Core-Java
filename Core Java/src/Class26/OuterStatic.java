package Class26;

public class OuterStatic {
    //int data = 30; //it can't be accessible from the inner class because it is non-static
    static int data = 30;
    
    static class Inner{
        
        void msg(){
            System.out.println("data is " + data);
        }
        
        static void msg2(){
            System.out.println("data is " + data);
        }
    }
    public static void main(String[] args) {
        Inner obj = new Inner();
        obj.msg();
        Inner.msg2();
    }
}
