package threads;

import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CompletableFutureTaskMultipleServicesJoin {
	public static void main(String[] args) {

		CompletableFutureTaskMultipleServicesJoin multipleServices = new CompletableFutureTaskMultipleServicesJoin();
		long startTime = System.currentTimeMillis();
		multipleServices.getResponse();
		long endTime = System.currentTimeMillis();
		System.out.println("time elapsed in print method " + (endTime - startTime) + " milliseconds");
	}

	private String getResponse() {
		CompletableFuture<String> completableFuture1 = CompletableFuture.supplyAsync(() -> service1());
		CompletableFuture<String> completableFuture2 = CompletableFuture.supplyAsync(() -> service2());
		CompletableFuture<String> completableFuture3 = CompletableFuture.supplyAsync(() -> service3());
		//CompletableFuture<Void> combinedFuture 
		  //= CompletableFuture.allOf(completableFuture1, completableFuture2, completableFuture3);
		
		//try {
			//System.out.println(combinedFuture.get()); // returns void not useful instead use join
		//} catch (Exception e) {
			//e.printStackTrace();
		//}

		List<String> combined = Stream.of(completableFuture1, completableFuture2, completableFuture3)
				  .map(CompletableFuture::join)
				  //.collect(Collectors.joining(" "));
				  .collect(Collectors.toList());
		System.out.println(combined);
		
		return combined.toString();
	}

	private String service1() {
		System.out.println("service 1 invoked");
		delay(1000);
		return "response1";
	}

	private String service2() {
		System.out.println("service 2 invoked");
		delay(2000);
		return "response2";
	}
	
	private String service3() {
		System.out.println("service 3 invoked");
		delay(3000);
		return "response3";
	}

	private void delay(long duration) {
		try {
			Thread.sleep(duration);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
