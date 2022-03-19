package junit5;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.HashMap;
import java.util.Map;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.RepetitionInfo;

import calculator.Calculator;

public class RepeatedTests {
	
	private Map<Integer, Double> map = new HashMap<>();
	
	@BeforeEach
	public void setup() {
		map.put(1, 3.0);
		map.put(2, 1.0);
		map.put(3, 1.0);
	}

	@RepeatedTest(value = 3)
	@DisplayName("Test divide operation")
	public void testDivideNumber() {
		Calculator calculator = new Calculator();
		assertEquals(3, calculator.divide(6, 2));
	}

	@RepeatedTest(value = 3, name = "{displayName} - repetition number {currentRepetition}/{totalRepetitions}")
	@DisplayName("Test subtract operation")
	public void testSubtractNumber() {
		Calculator calculator = new Calculator();
		assertEquals(3, calculator.subtract(5, 2));
	}

	@RepeatedTest(value = 3)
	@DisplayName("Test divide operation")
	public void testDivideNumber(RepetitionInfo repetitionInfo) {
		System.out.format("current repetition %s, total repetetions %s \n", repetitionInfo.getCurrentRepetition(),
				repetitionInfo.getTotalRepetitions());
		Calculator calculator = new Calculator();
		assertEquals(map.get(repetitionInfo.getCurrentRepetition()), calculator.divide(repetitionInfo.getTotalRepetitions(),
				repetitionInfo.getCurrentRepetition()));
	}

}
