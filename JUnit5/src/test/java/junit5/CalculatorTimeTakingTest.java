package junit5;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("timetakingtests")
public class CalculatorTimeTakingTest {


	@Test
	public void testFactorialWithTimeout() {
		Calculator calculator = new Calculator();
		System.out.println("Calling factorial");
		System.out.println(calculator.factorial(30));
	}

	

}
