package threads;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class MyThread1 implements Runnable {
    private Producer producer;
    private Lock lock = new ReentrantLock();
    
    public MyThread1(Producer producer) {
        this.producer = producer;
    }
	
    public void run() { 
        try {
            lock.lock(); // blocks until acquired
            System.out.println(Thread.currentThread().getName()  + " running");
            producer.setData("data");
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }
    
    public static void main(String[] args) {
        MyThread1 myThread = new MyThread1(new Producer());
        Thread threadOne = new Thread(myThread);
        Thread threadTwo = new Thread(myThread);
        Thread threadThree = new Thread(myThread);
        threadOne.start();
        threadTwo.start();
        threadThree.start();
    }
}

class Producer {
    private String data;
			
    public void setData(String data) {
        this.data = data;
    }
}

