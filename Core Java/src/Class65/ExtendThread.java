package Class65;

class NewThread2 extends Thread{

    NewThread2() {
        super("Demo Thread");
        System.out.println("Child thread: " + this);
        this.start();
    }
    
    @Override
    public void run(){
        try{
            for (int i = 5 ; i > 0 ; i--){
                System.out.println("Child Thread: " + i);
                sleep(500);
            }
        } catch (InterruptedException ie){
            System.out.println("Child Interrupted");
        }
        System.out.println("Exiting child thread");
    }
}

public class ExtendThread {
    
    public static void main(String[] args) {
        new NewThread2();
        try{
            for (int i = 5; i > 0; i--){
                System.out.println("Main Thread: " + i);
                Thread.sleep(1000);
            }
        } catch (InterruptedException ie){
            System.out.println("Main Thread Interrupted");
        }
        
        System.out.println("Main Thread exiting");
    }
}
