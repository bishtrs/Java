package threads;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class CompletableFutureTaskMultipleServices {
	public static void main(String[] args) {

		CompletableFutureTaskMultipleServices multipleServices = new CompletableFutureTaskMultipleServices();
		long startTime = System.currentTimeMillis();
		multipleServices.getResponse();
		long endTime = System.currentTimeMillis();
		System.out.println("time elapsed in print method " + (endTime - startTime) + " milliseconds");
	}

	private String getResponse() {
		CompletableFuture<String> completableFuture1 = CompletableFuture.supplyAsync(() -> service1());
		CompletableFuture<String> completableFuture2 = CompletableFuture.supplyAsync(() -> service2());
		CompletableFuture<String> completableFuture3 = CompletableFuture.supplyAsync(() -> service3());
		
		try {
			String res = completableFuture2.thenCombine(completableFuture1, (response1, response2) -> response1 + response2).get();
			System.out.println(res);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (ExecutionException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		try {
			String response1 = completableFuture1.get();
			String response2 = completableFuture2.get();
			String response3 = completableFuture3.get();
			System.out.println(response1 + response2);
			return response1 + response2;
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ExecutionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return "";
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
