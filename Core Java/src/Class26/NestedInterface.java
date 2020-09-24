package Class26;

public class NestedInterface implements Displayable.Message{
    
    @Override
    public void msg(){
        System.out.println("Hello nested interface");
    }
    
    public static void main(String[] args) {
        Displayable.Message message = new NestedInterface();
        message.msg();
    }
}
