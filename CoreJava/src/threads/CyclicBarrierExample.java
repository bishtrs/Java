package threads;

import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;
import java.util.stream.Collectors;

public class CyclicBarrierExample {

	private CyclicBarrier cyclicBarrier;
	private Set<String> finalNames = new HashSet<>();
	private Set<String> names1 = new HashSet<>();
	private Set<String> names2 = new HashSet<>();

	public CyclicBarrierExample() {
		cyclicBarrier = new CyclicBarrier(2, () -> {
			finalNames.addAll(names1);
			finalNames.addAll(names2);
			System.out.println(Thread.currentThread().getName() + " done");
			System.out.println(finalNames);
		});
		names1.add("John");
		Thread t1 = new Thread(new NameProcessor(names1));
		names2.add("Mark");
		Thread t2 = new Thread(new NameProcessor(names2));
		t1.start();
		t2.start();
		System.out.println(Thread.currentThread().getName() + " done");
	}

	public static void main(String[] args) {
		new CyclicBarrierExample();
	}

	class NameProcessor implements Runnable {
		private Set<String> names;

		NameProcessor(Set<String> names) {
			this.names = names;
		}

		@Override
		public void run() {
			System.out.println(Thread.currentThread().getName() + " running");
			names = names.stream().map(name -> name.toUpperCase()).collect(Collectors.toSet());
			System.out.println(Thread.currentThread().getName() + " calling await on CB");
			try {
				cyclicBarrier.await();
			} catch (InterruptedException | BrokenBarrierException e) {
				e.printStackTrace();
			}
		}

	}

}
