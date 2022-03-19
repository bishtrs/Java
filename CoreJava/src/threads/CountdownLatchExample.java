package threads;

import java.util.concurrent.CountDownLatch;

public class CountdownLatchExample {

	final CountDownLatch endSignal = new CountDownLatch(2);

	public static void main(String[] args) {
		CountdownLatchExample countdownLatchExample = new CountdownLatchExample();
		countdownLatchExample.test();
	}

	public void test() {
		Thread t1 = new Thread() {
			public void run() {
				delay(2000);
				System.out.println("Thread t1 running");
				endSignal.countDown();
			}
		};
		t1.start();

		Thread t2 = new Thread() {
			public void run() {
				delay(2000);
				System.out.println("Thread t2 running");
				endSignal.countDown();
			}
		};
		t2.start();

		System.out.println("Waiting for all threads to complete");
		try {
			endSignal.await(); // waits for two threads
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("All threads completed completed their task");
	}

	private void delay(long duration) {
		try {
			Thread.sleep(duration);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}