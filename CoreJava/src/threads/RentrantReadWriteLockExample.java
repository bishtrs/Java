package threads;

import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;


public class RentrantReadWriteLockExample implements Runnable {
    private Producer producer;
    private ReadWriteLock lock = new ReentrantReadWriteLock();
    
    public RentrantReadWriteLockExample(Producer producer) {
        this.producer = producer;
    }
	
    public void run() { 
        try {
            lock.readLock().lock(); // blocks until acquired
            System.out.println(Thread.currentThread().getName()  + " running");
            //producer.produce();
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
           // lock.unlock();
        }
    }
    
    public static void main(String[] args) {
        RentrantReadWriteLockExample myThread = new RentrantReadWriteLockExample(new Producer());
        Thread threadOne = new Thread(myThread);
        Thread threadTwo = new Thread(myThread);
        Thread threadThree = new Thread(myThread);
        threadOne.start();
        threadTwo.start();
        threadThree.start();
    }
}
