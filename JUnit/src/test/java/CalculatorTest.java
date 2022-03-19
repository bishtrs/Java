import static org.junit.Assert.assertEquals;

import org.junit.Test;

import calculator.Calculator;


public class CalculatorTest {

	@Test
	public void testMultiply() {
		Calculator calculator = new Calculator();
		double result = calculator.multiply(11, 12);
		assertEquals(132, result, 0);
	}
	
	@Test (expected = ArithmeticException.class)
	public void testException() {
		Calculator calculator = new Calculator();
		calculator.divide(12, 0);
	}
	
	@Test (timeout = 100)
	public void testFactorial() {
		Calculator calculator = new Calculator();
		System.out.println(calculator.factorial(20));
	}

}
