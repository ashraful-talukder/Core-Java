package Class16;

/*
Super class or Parent Class
*/
class Parent{
    int pi, pj;
    
     void showPiPj(){
         System.out.println("pi = " + pi + "\tpj = " + pj);
     }
}

/*
Sub class or Child class or Inherited class
*/
class Child extends Parent{
    int pk;
    
    void showPk(){
        System.out.println("pk = " + pk);
    }
    
    void sum(){
        System.out.println("Total = " + (pi + pj + pk));
    }
}


public class InheritanceExample {
    
    public static void main(String[]args){
        Parent p = new Parent();
        Child c = new Child();
        
        p.pi = 2;
        p.pj = 5;
        
        System.out.println("Contents of parent class:");
        p.showPiPj();
        System.out.println();
        
        c.pi = 10;
        c.pj = 15;
        c.pk = 20;
        
        System.out.println("Contents of child class:");
        c.showPiPj();
        c.showPk();
        c.sum();
        System.out.println();
        
        System.out.println("Contents of parent class after assigning values of child class:");
        p.showPiPj();
    }
    
}
