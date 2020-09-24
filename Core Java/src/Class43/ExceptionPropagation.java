package Class43;

public class ExceptionPropagation {
    
    void m(){
//        try{
            int data = 50 / 0;
//        } catch (Exception e){
//            
//        }
    }
    
    void n(){
        m();
    }
    
    void p(){
        try{
            n();
        } catch(Exception e){
            System.out.println("Exception Handled.");
        }
    }
    
    public static void main(String[] args) {
        ExceptionPropagation ep = new ExceptionPropagation();
        ep.p();
        System.out.println("Normal flow..");
    }
}
