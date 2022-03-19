package threads;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public class FutureTaskExample {
    public static void main(String[] args) {
    	ExecutorService es = Executors.newSingleThreadExecutor();
        Factorial task = new Factorial(10);
        Future<Long> future = es.submit(task);
        System.out.println("task submitted");
        
        long result = 0;
        try {
        	Thread.sleep(10000);
            result = future.get(20, TimeUnit.SECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e) {
            e.printStackTrace();
        }
    
        System.out.printf("factorial of 10 is %d", result);
        es.shutdown();
    }
}

class Factorial implements Callable<Long> {
    private long number;

    public Factorial(long number) {
        this.number = number;
    }

    @Override
    public Long call() throws Exception {
    	System.out.println("calculating factorial");
        long fact = 1;
        for (long cnt = 1; cnt <= number; cnt++) {
            fact *= cnt;
            Thread.sleep(500);
        }
        return fact;
    }
}