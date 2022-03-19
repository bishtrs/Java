package threads;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class CompletableFutureTaskExample {
    public static void main(String[] args) {
        CompletableFuture<Long> completableFuture = new CompletableFuture<>();
        Factorial1 task = new Factorial1(10, completableFuture);
        Thread th = new Thread(task);
        th.start();

        long result = 0;
        System.out.println("Waiting to calculate factorial");
        try {
            result = completableFuture.get(); // blocking call
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        }

        System.out.printf("Wait over, factorial of 10 is %d", result);
    }
}

class Factorial1 implements Runnable {
    private long number;
    private CompletableFuture<Long> completableFuture;

    public Factorial1(long number, CompletableFuture<Long> completableFuture) {
        this.number = number;
        this.completableFuture = completableFuture;
    }

    @Override
    public void run() {
        long fact = 1;
        for (long cnt = 1; cnt <= number; cnt++) {
            fact *= cnt;
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        completableFuture.complete(fact);
    }
}
	