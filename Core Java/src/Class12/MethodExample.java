package Class12;

public class MethodExample {
    int x,y;
    double d;
    String s;
    
    /*
    method name = dispSum
    method Signature = dispSum(int x, int y) [name and parameters hence parameters are optional]
    method  interface = int dispSum(int x, int y)
    method body = which remains inside curly braces [this part is optional]
    */
    
    int dispSum(int x, int y){
        return x+y;
    }
    
    
    /*
    Mutator method
    */
    void setX(int x){
        this.x = x;
    }
    
    public static void main(String[]args){
        MethodExample m = new MethodExample();
        m.setX(10); 
    }
}
