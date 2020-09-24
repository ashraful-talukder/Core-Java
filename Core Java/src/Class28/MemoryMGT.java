package Class28;

public class MemoryMGT {
    
    public static void main(String[] args) {
        int i = 1;
        Object obj = new Object();
        MemoryMGT mmgt = new MemoryMGT();
        mmgt.print(obj);
    }
    
    private void print(Object param){
        String str = param.toString();
        System.out.println(str);
    }
}
  