package java8;
// Converts List elements (of Strng type) to lowercase using Stream map
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamMap {

	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
		List<Integer> stream = numbers.stream() // convert list to stream
				.map(n -> n * n) // convert each number to its square
				.collect(Collectors.toList());

		stream.forEach(System.out::println);
		
	}

	
}
