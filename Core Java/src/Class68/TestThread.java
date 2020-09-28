package Class68;

public class TestThread extends Thread {
    
    @Override
    public void run(){
        System.out.println("running...");
    }
    
    public static void main(String[] args) {
        TestThread t = new TestThread();
        t.start();
        //t.start();  //this will produce an IllegalThreadStateException
        /*
        this is because we can't start twice an object's thread. 
        Reason behind this is, when the first thread finishes it's work then the object goes in dead state
        */
        
        /*
        this will work because this is an another object
        */
        TestThread t1 = new TestThread();
        t1.start();
    }
}
