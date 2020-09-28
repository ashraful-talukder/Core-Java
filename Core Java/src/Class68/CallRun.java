package Class68;

public class CallRun extends Thread {
    
    @Override
    public void run(){
        for (int i = 1; i < 5; i++){
            try{
                Thread.sleep(500);
            } catch (InterruptedException ie){
                System.out.println(ie);
            }
            System.out.println(i);
        }
    }
    
    public static void main(String[] args) {
        CallRun t = new CallRun();
        CallRun t1 = new CallRun();
        
        /*
        if we call run() it will call just like another method
        but if we call start() then it will call as a thread
        */
        t.run();
        t1.run();
        
        System.out.println("\nthe difference between run and start will shown in output: \n");
        
        t.start();
        t.start();
    }
}
