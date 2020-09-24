package Class39;

public class Test {
    
    public static void main(String[] args) {
        try{
            int x = 0;
            int y = 34 / x; //ArithmeticException
            int z[] = new int[2]; //ArrayIndexOutOfBoundsException
            System.out.println(z[3]);
        } catch (ArithmeticException e){
            System.err.println("You have a problem at calculation");
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println(e);
        }
        finally{
            System.out.println("Finish");
        }
    }
}
