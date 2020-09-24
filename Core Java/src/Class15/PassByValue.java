package Class15;

public class PassByValue {
    int data = 50;
    
    //primmitive types are pass by value
    void change(int data){
        data = data + 100;
        System.out.println("Data in method: " + data);
        return;
    }
    
    //objects are pass by reference
    void changeByObj(PassByValue e){
        e.data = 200;
    }
    
    /*
    To better understand the concept see the output.
    */
    public static void main(String[]args){
        PassByValue ex = new PassByValue();
        System.out.println("Before change: " + ex.data);
        ex.change(55);
        System.out.println("After change by passing value: " + ex.data);
        ex.changeByObj(ex);
        System.out.println("After change by passing reference: "+ex.data);
    }
}
