package Class14;

public class ThisRefEx {
    int x;
    String y;
    
    /*
    Enhancement by Rakib vai
    */
    ThisRefEx(){
        System.out.print("Constructor Called!");
    }
    
    public ThisRefEx(int x, String y){
        this.x = x;
        this.y = y;
    }
    
    void sum(int x, int y){
        System.out.println(x+y);
    }
    
    void doYYY(String[]args){
        RecRef recref = new RecRef();
        recref.doXX(this);
        recref.doMM(x);
    }
}

class RecRef{
    void doXX(ThisRefEx rr){
        rr.sum(rr.x, 10);
    }
    
    void doMM(int s){
        
    }
    
    /*
    Enhancement by Rakib Vai
    */
    public static void main(String args[]){
        RecRef r = new RecRef();
        ThisRefEx rr = new ThisRefEx();
        rr.x = 10;
        rr.y = "Some Thing";
       // int x1 = 5, y1 = 50;
        r.doXX(rr);
        
        RecRef r1 = new RecRef();
        ThisRefEx rr1 = new ThisRefEx();
        rr1.x = 170;
        rr1.y = "Some Thing";
       // int x1 = 5, y1 = 50;
        r.doXX(rr1);
    
    }
}
