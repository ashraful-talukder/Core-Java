package Class70;

public class ThreadPriority extends Thread {
    
    @Override
    public void run(){
        System.out.println("running thread name: " + Thread.currentThread().getName());
        System.out.println("running thread priority: " + Thread.currentThread().getPriority());
    }
    
    /*
    priority of main thread is 5 and it's called optimal priority(NORM_PRIORITY)
    when we create an object to a thread it's default priority sets as 5
    */
    public static void main(String[] args) { 
        ThreadPriority m = new ThreadPriority();
        m.setName("A1");
        ThreadPriority m1 = new ThreadPriority();
        m1.setName("A2");
        ThreadPriority m2 = new ThreadPriority();
        m2.setName("A3");
        m.setPriority(Thread.MIN_PRIORITY); //MIN_PRIORITY = 1
        m2.setPriority(Thread.MAX_PRIORITY); //MAX_PRIORITY = 10
        m.start();
        m1.start();  //NORM_PRIORITY by default
        m2.start();
    }
}
