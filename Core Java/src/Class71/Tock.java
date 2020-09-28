package Class71;

public class Tock implements Runnable {
    
    @Override
    public void run(){
        try{
            for (int i = 0; i < 20; i++){
                synchronized (Core.LOCK){
                    Core.LOCK.wait(); //wait for tick completes its turn
                }
                System.out.println("Tock (" + (i+1) + ")\n");
                Thread.sleep(500);
                synchronized (Core.LOCK){
                    Core.LOCK.notify();  //my turn completed, signal for tick
                }
            }
        } catch (InterruptedException ie){
            ie.printStackTrace();
        }
    }
}
