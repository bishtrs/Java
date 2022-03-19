import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import calculator.Calculator;

@RunWith(value=Parameterized.class)
public class ParameterizedTest {
	
	private double expected;
	private double valueOne;
	private double valueTwo;
	
	@Parameters
	public static Collection<Integer[]> getTestParameters() {
		return Arrays.asList(new Integer[][] {
			{2, 1, 2}, //expected, valueOne, valueTwo
			{6, 2, 3}, //expected, valueOne, valueTwo
			{15, 3, 5}, //expected, valueOne, valueTwo
		});
	}
	
	public ParameterizedTest(double expected, double valueOne, double valueTwo) {
		this.expected = expected;
		this.valueOne = valueOne;
		this.valueTwo = valueTwo;
	}
			
	@Test
	public void testMultiply() {
		Calculator calc = new Calculator();
		assertEquals(expected, calc.multiply(valueOne, valueTwo), 0);
	}
}
