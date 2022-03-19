package junit5;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.EnumSource;
import org.junit.jupiter.params.provider.EnumSource.Mode;
import org.junit.jupiter.params.provider.ValueSource;

public class JUnit5ParameterizedTest {

	@ParameterizedTest
	@ValueSource(ints = { 2, 1, 5 })
	public void testArraySize(int num) {
		assertTrue(num > 0);
	}

	@ParameterizedTest
	@ValueSource(strings = { "i love junit5", "test using junit5" })
	void testWordsInSentence(String str) {
		assertNotNull(str);
		assertEquals(3, str.split(" ").length);
	}

	@ParameterizedTest
	@EnumSource(value = Colors.class)
	void testAllColorsLength(Colors colors) {
		assertTrue(colors.value().length() > 0);
	}

	@ParameterizedTest
	@EnumSource(value = Colors.class, names = { "GREEN", "BLUE" })
	void testFewColorsLength(Colors colors) {
		assertTrue(colors.value().length() > 0);
	}

	@ParameterizedTest
	@EnumSource(value = Colors.class, mode = Mode.EXCLUDE, names = { "GREEN", "BLUE" })
	void testYellowColorLength(Colors colors) {
		assertEquals("Yellow", colors.value());
	}

	@ParameterizedTest
	@CsvSource({ "3, i love junit5", "2, junit5 tests" })
	void testWordsInASentence(int expected, String str) {
		assertNotNull(str);
		assertEquals(expected, str.split(" ").length);
	}

	@ParameterizedTest
	@CsvFileSource(resources = "/test.csv")
	void testNumberOfWordsInASentence(int expected, String str) {
		assertNotNull(str);
		assertEquals(expected, str.split(" ").length);
	}

}
