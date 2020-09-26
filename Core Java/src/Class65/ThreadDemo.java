package Class65;

class NewThread implements Runnable{
    Thread t;
    
    NewThread(){
        t = new Thread(this, "Demo Thread");
        System.out.println("Child thread: " + t);
        t.start();
    }
    
    @Override
    public void run(){
        try{
            for (int i = 5; i > 0; i--){
                System.out.println("Child Thread: " + i);
                Thread.sleep(500);
            }
        } catch (InterruptedException ie){
            System.out.println("Child Interrupted");
        }
        System.out.println("Exiting child thread");
    }
}

public class ThreadDemo {
    public static void main(String[] args) {
        new NewThread();
        try{
            for (int i = 5; i > 0; i--){
                System.out.println("Main Thread: " + i);
                Thread.sleep(1000);
            }
        } catch (InterruptedException ie){
            System.out.println("Main Thread Interrupted");
        }
        System.out.println("Main Thread Exiting");
    }
}
