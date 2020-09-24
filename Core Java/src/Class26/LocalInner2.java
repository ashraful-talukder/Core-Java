package Class26;

public class LocalInner2 {
    private int data = 30;
    
    void display(){
        int value = 50;
        
        class Local{
            
            void msg(){
                System.out.println(value);
            }
        }
        Local l = new Local();
        l.msg();
    }
    
    public static void main(String[] args) {
        LocalInner2 obj = new LocalInner2();
        obj.display();
    }
}
