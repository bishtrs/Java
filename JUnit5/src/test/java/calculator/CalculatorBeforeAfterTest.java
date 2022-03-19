package calculator;


import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import calculator.Calculator;

public class CalculatorBeforeAfterTest {

	private Calculator calculator;

    @BeforeEach
    public void initiate() {
        calculator = new Calculator();
    }
    
    @Test
    public void testDivide() {
        double result = calculator.divide(12, 4);
        assertEquals(3, result);
    }
    
    @Test
    public void testMultiply() {
    	double result = calculator.multiply(3, 4);
    	assertEquals(12, result);
    }
    
    @AfterEach
    public void end() {
        calculator = null;
    }

}
