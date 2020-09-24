package Class38;

class StaticCons{
    
    /*
    constructor can't be static
    */
    public StaticCons(){
        System.out.println("Super");
    }
}

public class StaticConstructor extends StaticCons {
    
    void someMethod(){
        System.out.println("method in sub");
    }
    
    public static void main(String[] args) {
        StaticConstructor staticConstructor = new StaticConstructor();
        staticConstructor.someMethod();
    }
}
