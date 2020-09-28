package Class71;

public class Tock implements Runnable {
    
    @Override
    public void run(){
        try{
            for (int i = 0; i < 20; i++){
                synchronized (Core.LOCK){
                    Core.LOCK.wait();
                }
                System.out.println("Tock (" + (i+1) + ")\n");
                Thread.sleep(500);
                synchronized (Core.LOCK){
                    Core.LOCK.notify();
                }
            }
        } catch (InterruptedException ie){
            ie.printStackTrace();
        }
    }
}
