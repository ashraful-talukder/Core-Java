package Class26;

interface Eatable{
    
    void eat();
}

public class AnnonymousInner2 {
    
    public static void main(String[]args){
        
        /*
        Annonymous Inner Class
        */
        Eatable e = new Eatable(){
            
            @Override
            public void eat(){
                System.out.println("nice fruits");
            }
        };
        e.eat();
        
        /*
        new Eatable(){
            
            @Override  //this an another way to declare
            public void eat(){
                System.out.println("nice fruits");
            }
        }.eat();
        */
    }
}
