package Class26;

public class LocalInner {
    
    private int data = 30;
    
    void display(){
        
        /*
        Local Inner Class
        */
        class Local{
            
            void msg(){
                System.out.println(data);
            }
        }
        Local l = new Local();
        l.msg();
    }
    
    public static void main(String[] args) {
        
    }
}
