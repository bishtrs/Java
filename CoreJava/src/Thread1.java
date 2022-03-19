public class Thread1 extends Thread {
    Calculator calculator;
	
    public Thread1(Calculator calculator) {
        this.calculator = calculator;
    }
	
    public void  run() {
        synchronized (calculator) {
            System.out.println("Waiting for calculator to complete..."); 
            try {
                calculator.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Got notification, wait over");
    }
	
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        new Thread1(calculator).start();
        new Thread1(calculator).start();
        new Thread1(calculator).start();
        new Thread1(calculator).start();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }   
        calculator.start();
    }
	   
}

class Calculator extends Thread {
    private int sum;

    public void run() {
        synchronized(this) {
            for (int i=0; i<5; i++) {
               sum += i; 
            }  
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }   
            System.out.println("Notifying waiting threads...");            
            notifyAll();
        }
    }
}