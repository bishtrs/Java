package threads;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class CompletableFutureTaskSupplyAsync {
	
	public static void main(String[] args) {
        CompletableFuture completableFuture =
            CompletableFuture.supplyAsync(()-> "CompletableFuture example");
        try {
            System.out.println(completableFuture.get());
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        }
            
        CompletableFuture completableFuture2 = CompletableFuture.supplyAsync(()-> 50);
        try {
            System.out.println(completableFuture2.get());
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        }
    }

}
