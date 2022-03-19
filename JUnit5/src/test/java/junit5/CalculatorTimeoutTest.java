package junit5;

import static java.time.Duration.ofMillis;
import static java.time.Duration.ofNanos;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTimeout;

import java.util.concurrent.TimeUnit;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

public class CalculatorTimeoutTest {

	@BeforeEach
	@Timeout(2)
	void setUp() {
		System.out.println("Sleeping for 1 sec");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// throws exception if time taken is more than 1 sec
			e.printStackTrace();
		}
	}

	@Test
	@Timeout(5)
	public void testFactorialWithTimeout() {
		Calculator calculator = new Calculator();
		System.out.println("Calling factorial");
		System.out.println(calculator.factorial(30));
	}

	// fails if time taken is more than 1 ns
	@Test
	@Timeout(value = 1, unit = TimeUnit.NANOSECONDS)
	public void testFactorialWithLessTimeout() {
		Calculator calculator = new Calculator();
		System.out.println("Calling factorial");
		System.out.println(calculator.factorial(1000));
	}

	@Test
	public void testFactorialTimeout() {
		Calculator calculator = new Calculator();
		System.out.println("Calling factorial");
		// throws exception if time taken is more than 1 ns
		long actualResult = assertTimeout(ofNanos(1), () -> {
			return calculator.factorial(10);
		});
		assertEquals(3628800, actualResult);

	}

	@Test
	public void testTimeout() {
		assertTimeout(ofMillis(10), () -> {
			Thread.sleep(100);
		});
	}

}
