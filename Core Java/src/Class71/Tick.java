package Class71;

public class Tick implements Runnable {
    
    @Override
    public void run(){
        try{
            for (int i = 0; i < 20; i++){
                System.out.print("Tick ");
                Thread.sleep(500);
                synchronized (Core.LOCK) {
                    Core.LOCK.notify(); //notify tock, it's his turn
                    Core.LOCK.wait(); //and wait until tock notify you for your turn
                }
            }
        } catch (InterruptedException ie){
            ie.printStackTrace();
        }
    }
}
