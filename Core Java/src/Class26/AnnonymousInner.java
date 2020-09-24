package Class26;

abstract class Person{
    
    abstract void eat();
}

public class AnnonymousInner {
    
    public static void main(String[] args) {
        
        /*
        Annonymous Inner Class
        */
        Person p = new Person() {
            @Override
            void eat() {
                System.out.println("nice fruits");
            }
        };
        p.eat();
    }
}
