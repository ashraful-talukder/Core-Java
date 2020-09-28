package Class69;

/**
 * The join() method causes the currently running threads to stop executing 
 * until the thread it joins with complete its task
 */
public class TestJoin implements Runnable {
    
    public static void main(String[] args) {
        /*
        we can see the change if we commented "t.join();" and that time catch should be just Exception
        when we add join() it holds the main thread and ensures that while start() is called that needs to finish
        when run() thread executes completely then the main thread will resume
        */
        try{
            Thread t = new Thread(new TestJoin());
            t.start();
            System.out.println("started");
            t.join();
            System.out.println("complete");
        } catch (InterruptedException ie){
            System.err.println(ie);
        }
    }
    
    @Override
    public void run(){
        System.out.println("Running...");
    }
}
