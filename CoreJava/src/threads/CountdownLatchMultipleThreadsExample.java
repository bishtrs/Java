package threads;

import java.util.concurrent.CountDownLatch;

public class CountdownLatchMultipleThreadsExample {

	private int counter;
	final CountDownLatch endSignal = new CountDownLatch(2);

	public CountdownLatchMultipleThreadsExample(int counter) {
		this.counter = counter;
	}

	public static void main(String[] args) {
		CountdownLatchMultipleThreadsExample countdownLatchExample = new CountdownLatchMultipleThreadsExample(5);
		countdownLatchExample.test();
	}

	public void test() {
		for (int i = 0; i < counter; i++) {
			Thread t = new Thread() {
				public void run() {
					try {
						System.out.println(Thread.currentThread().getName() + " running");
						Thread.sleep(2000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					endSignal.countDown();
				}
			};
			t.start();
		}

		System.out.println("Waiting for all threads to complete");
		try {
			endSignal.await();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("All threads completed completed their task");
	}

}