package java8;

import java.util.Arrays;
import java.util.List;
import java.util.Spliterator;

public class SpliteratorExample {
	public static void main(String[] args) {
		/*List<String> list = Arrays.asList("Mark", "John", "Andrew");
		Spliterator<String> s = list.spliterator();
		s.tryAdvance(System.out::println);
		s.tryAdvance(System.out::println);
		boolean b = s.tryAdvance(System.out::println);
		System.out.println("Element exists: " + b);

		b = s.tryAdvance(System.out::println);
		System.out.println("Element exists: " + b);*/
		
		List<String> list = Arrays.asList("Mark", "John", "Andrew");
		Spliterator<String> s = list.spliterator();
		System.out.println("Processing using forEachRemaining");
		s.forEachRemaining(System.out::println);

		/*
		 * List<String> list = Arrays.asList("Mark", "John", "Andrew");
		 * 
		 * Spliterator<String> s2 = list.spliterator(); Spliterator<String> s1 =
		 * s2.trySplit(); System.out.println("Iterating using first iterator");
		 * s2.forEachRemaining(System.out::println);
		 * System.out.println("Iterating using second iterator");
		 * s1.forEachRemaining(System.out::println);
		 */
	}
}
