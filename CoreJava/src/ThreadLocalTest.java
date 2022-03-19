

import java.text.SimpleDateFormat;

public class ThreadLocalTest extends Thread {
	 
    // SimpleDateFormat is not thread-safe, so give one to each thread
    private static final ThreadLocal<SimpleDateFormat> formatter
        = new ThreadLocal<SimpleDateFormat>(){
        @Override
        protected SimpleDateFormat initialValue()
        {
            return new SimpleDateFormat("yyyyMMdd HHmm");
        }
    };


    public static void main(String[] args) {
    	ThreadLocalTest t1 = new ThreadLocalTest();
    	t1.setName("Thread 1");
    	t1.start();
    	
    	ThreadLocalTest t2 = new ThreadLocalTest();
    	t2.setName("Thread 2");
    	t2.start();
    	
    	ThreadLocalTest t3 = new ThreadLocalTest();
    	t3.setName("Thread 3");
    	t3.start();
    	
    	ThreadLocalTest t4 = new ThreadLocalTest();
    	t4.setName("Thread 4");
    	t4.start();
    	
    	ThreadLocalTest t5 = new ThreadLocalTest();
    	t5.setName("Thread 5");
    	t5.start();

    }
     
    public void run() {
    	System.out.println(Thread.currentThread().getName() + " Date Format = " 
            + formatter.get().toPattern());
        if (Thread.currentThread().getName().equalsIgnoreCase("Thread 2") 
            || Thread.currentThread().getName().equalsIgnoreCase("Thread 4")) {
        	formatter.set(new SimpleDateFormat("yyyyMMdd"));
        } else {
        	formatter.set(new SimpleDateFormat("ddMMyyyy"));
        }
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName() + " Date Format = "
            + formatter.get().toPattern());        
    }
     
}
	

