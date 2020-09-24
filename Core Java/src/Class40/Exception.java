package Class40;

public class Exception {
    
    public static void main(String[] args) {
        int d = 0;
        int x = 42;
        try{
            int y = x / 0;
            int a[] = new int[2];
            System.out.println("Accessing element three: " + a[3]);
        } catch (ArithmeticException e){
            //System.out.println("Exception thrown: " + e);
            //System.err.println("Excetion thrown: " + e);
            e.printStackTrace();
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception thrown:  " + e);
        } finally {
            System.out.println("Out of the block");
        }
    }
}
