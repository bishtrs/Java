class Counter {

    private int count;
    
    public void increaseCount() {
        try {
            Thread.sleep(300); // Added sleep to mimic time consuming operation
        } catch (InterruptedException e) {
            e.printStackTrace();
        }    
    
        this.count++;
        System.out.println("count value is " + this.count);
    }

}    

public class CounterThread implements Runnable {
    private Counter counter;
    
    public CounterThread(Counter counter) {
        this.counter = counter;
    }

    public void run() { 
    	for (int i=0; i< 5; i++) {
            counter.increaseCount();
    	}

    }
    
    public static void main(String[] args) {
        Counter counter = new Counter();
        CounterThread counterThread = new CounterThread(counter);
        Thread thread1 = new Thread(counterThread); 
        Thread thread2 = new Thread(counterThread); 
        Thread thread3 = new Thread(counterThread); 
        thread1.start();
        thread2.start();
        thread3.start();
    }

}