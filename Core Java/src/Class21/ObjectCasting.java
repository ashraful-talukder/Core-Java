package Class21;

class Animal{
    int health = 100;
}
/*
Inheritance relation also called "IS-A" relationship
*/
class Cat extends Animal{
    
}

public class ObjectCasting {
    
    public static void main(String[]args){
        Animal aml= new Animal();
        Cat c = new Cat();
        //upcasting is implicit and safe
        aml = c;
        c = (Cat) aml; //must cast explicitly for downcasting
        System.out.println(c.health);
    }
}
