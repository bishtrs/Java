package junit5;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import calculator.Calculator;

@Tag("tests")
public class CalculatorTagTests {

    @Test
    @Tag("fasttests")
    public void testMultiply() {
        Calculator calculator = new Calculator();
        double result = calculator.multiply(11, 12);
        assertEquals(132, result, 0);
    }
    
    @Test
    @Tag("timetakingtests")
    public void testFactorialimeout() {
        Calculator calculator = new Calculator();
        System.out.println(calculator.factorial(30));
    }

} 
