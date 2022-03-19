package junit5;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import calculator.Calculator;

@Tag("fasttests")
public class CalculatorFastTests {

	@Test
	public void testMultiply() {
		Calculator calculator = new Calculator();
		double result = calculator.multiply(11, 12);
		assertEquals(132, result, 0);
	}
	
	@Test
	public void testSubtract() {
		Calculator calculator = new Calculator();
		double result = calculator.subtract(15, 12);
		assertEquals(3, result, 0);
	}

}
