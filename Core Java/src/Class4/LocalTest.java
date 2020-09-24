package Class4;

public class LocalTest {
    
    int y;
    
    public void calAge(){
        int age = 0;  //If it is not initialized then it'll produce an error
        age = age + 7;
        y = y + 3;
        System.out.println("Age is: "+age);
    }
    
    public static void main(String[]args){
        LocalTest test = new LocalTest();
        test.calAge();
    }
}
