package Class13;

public class MethodExample {
    int x,y;
    double d;
    String s;
    
    int dispSum(){
        return x+y;
    }
    
    void setXY(int x, int y){
        this.x = x;
        this.y = y;
    }
    
    public static void main(String[]args){
        MethodExample m = new MethodExample();
        m.setXY(50, 60);
        int sum = m.dispSum();
        System.out.println(sum);
    }
}
