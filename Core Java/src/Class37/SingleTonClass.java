package Class37;

public class SingleTonClass {
    private static SingleTonClass obj = null;
    
    private SingleTonClass(){
        
    }
    
    /**
     * Factory method
     * @return 
     */
    public static SingleTonClass getInstance(){
        if(obj ==null){
            obj = new SingleTonClass();
        }
        return obj;
    }
    
    public void display(){
        System.out.println("Sinleton class Example");
    }
    
    public static void main(String[] args) {
        SingleTonClass object = SingleTonClass.getInstance();
        object.display();
    }
}
