package Class31;

public class ToString {
    String s1, s2;
    
    public ToString(String s1, String s2){
        this.s1 = s1;
        this.s2 = s2;
    }
    
    @Override
    public String toString(){
        return "[" + s1 + " " + s2 + "]";
    }   
    
    public static void main(String[] args) {
        ToString tdf = new ToString("Hello", "World!");
        System.out.println(tdf); //compiler internally call this to tdf.toString()
    }
}
