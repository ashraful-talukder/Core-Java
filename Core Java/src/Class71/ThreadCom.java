package Class71;

public class ThreadCom {
    
    int amount = 10000;
    
    synchronized void withdraw(int amount){
        System.out.println("withdraw...");
        
        if (this.amount < amount){
            System.out.println("Less balance, waiting for deposite...");
            try{
                wait();
            } catch (InterruptedException e){
                e.printStackTrace();
            }
        }
        this.amount -= amount;
        System.out.println("withdraw completed...");
        System.out.println("Current Balance: " + this.amount);
    }
    
    synchronized void deposit (int amount) {
        System.out.println("deposit....");
        this.amount += amount;
        System.out.println("deposit completed...");
        System.out.println("Current Balance: " + this.amount);
        notify();
    }
    
    public static void main(String[] args) {
        final ThreadCom C = new ThreadCom();
        new Thread(){
            @Override
            public void run(){
                C.withdraw(15000);
            }
        }.start();
        
        new Thread(){
            @Override
            public void run(){
                C.deposit(10000);
            }
        }.start();
    }
}
