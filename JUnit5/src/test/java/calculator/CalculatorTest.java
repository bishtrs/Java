package calculator;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import calculator.Calculator;

public class CalculatorTest {

	@Test
	public void testMultiply() {
		Calculator calculator = new Calculator();
		double result = calculator.multiply(11, 12);
		assertEquals(132, result, 0);
	}

	@Disabled(value = "skipping this test for now")
	public void testDivide() {
		Calculator calculator = new Calculator();
		calculator.divide(12, 4);
	}

	@Test
	public void testThrowsArithmeticException() {
		Calculator calculator = new Calculator();
		Throwable throwable = assertThrows(ArithmeticException.class,
				() -> calculator.divide(12, 0));
				assertEquals("/ by zero", throwable.getMessage());
	}
	
	@Test
	public void testThrowsIllegalArgumentException() {
		Calculator calculator = new Calculator();
		Throwable throwable = assertThrows(IllegalArgumentException.class,
				() -> calculator.divideWithValidation(12, 0));
				assertEquals("denominator can't be 0", throwable.getMessage());
	}

}
