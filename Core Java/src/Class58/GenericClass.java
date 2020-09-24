package Class58;

public class GenericClass<T> {
    private T t;
    
    public void add(T t){
        this.t = t;
    }
    
    public T get(){
        return t;
    }
    
    public static void main(String[] args) {
        GenericClass<Integer> integerBox = new GenericClass();
        GenericClass<String> StringBox = new GenericClass();
        
        integerBox.add(new Integer(10));
        StringBox.add("Hello World");
        
        System.out.printf("Integer value: %d\n", integerBox.get());
        System.out.printf("String value: %s\n", StringBox.get());
    }
}
