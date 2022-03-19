package threads;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class ExecutorServiceExample {

	public static void main(String[] args) {
		// fixed thread pool with four threads
		ExecutorService service = Executors.newFixedThreadPool(4);
		service.submit(() -> System.out.println("Thread started"));
		service.shutdown();

		// cached thread pool
		service = Executors.newCachedThreadPool();
		service.submit(() -> System.out.println("Thread started"));
		service.shutdown();

		// single thread pool
		service = Executors.newSingleThreadExecutor();
		service.submit(() -> System.out.println("Thread started"));
		service.shutdown();

		// ScheduledExecutorService scheduledExecutorService =
		// Executors.newSingleThreadScheduledExecutor();
		// scheduledExecutorService.schedule(() -> System.out.println("Thread scheduled
		// started"), 2000, TimeUnit.MILLISECONDS);
		// scheduledExecutorService.scheduleAtFixedRate(() -> System.out.println("Thread
		// scheduleAtFixedRate started"), 1000, 2000, TimeUnit.MILLISECONDS);

		List<Callable<String>> tasks = new ArrayList<>();
		tasks.add(() -> "task1");
		tasks.add(() -> "task2");
		service = Executors.newFixedThreadPool(2);
		try {
			service.invokeAll(tasks);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		tasks.forEach(task -> {
			try {
				System.out.println(task.call());
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		});
		service.shutdown();

		service = Executors.newFixedThreadPool(2);
		try {
			System.out.println(service.invokeAny(tasks));
		} catch (InterruptedException | ExecutionException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		service.shutdown();
	}

}
