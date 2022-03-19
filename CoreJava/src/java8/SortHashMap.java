package java8;

import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SortHashMap {

	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<>();
		map.put("John", 22);
		map.put("Mark", 12);
		map.put("Thomas", 43);
		map.put("James", 34);
		map.put("Edwin", 53);
		map.put("Vinod", 68);
		System.out.println(map);
		Stream<Entry<String, Integer>> stream = map.entrySet().stream().sorted(Map.Entry.comparingByKey());
		LinkedHashMap<String, Integer> sortedMap = stream
				.collect(Collectors.toMap(e -> e.getKey(), e -> e.getValue(), (e1, e2) -> e2, LinkedHashMap::new));
		System.out.println(sortedMap);


		// sort by value
		stream = map.entrySet().stream().sorted(Map.Entry.comparingByValue());
		sortedMap = stream
				.collect(Collectors.toMap(e -> e.getKey(), e -> e.getValue(), (e1, e2) -> e2, LinkedHashMap::new));
		System.out.println(sortedMap);

		Map<Integer, Book> bookMap = new HashMap<>();
		bookMap.put(1, new Book("Lord of the Rings", "J. R. R. Tolkien"));
		bookMap.put(2, new Book("Silence of the Lambs", "Thomas Harris"));
		bookMap.put(3, new Book("The Bourne Identity", "Robert Ludlum"));
		bookMap.put(4, new Book("Day of the Jackal", "Frederick Forsyth"));
		System.out.println(bookMap);

		Stream<Entry<Integer, Book>> stream2 = bookMap.entrySet().stream()
				.sorted(Map.Entry.comparingByValue(Comparator.comparing(Book::getTitle)));

		LinkedHashMap<Integer, Book> sortedMap2 = stream2
				.collect(Collectors.toMap(e -> e.getKey(), e -> e.getValue(), (e1, e2) -> e2, LinkedHashMap::new));
		System.out.println(sortedMap2);

	}

}

class Book {
	private final String title;
	private final String author;

	public Book(String title, String author) {
		this.title = title;
		this.author = author;
	}

	public String getTitle() {
		return title;
	}

	public String getAuthor() {
		return author;
	}

	@Override
	public String toString() {
		return "Book [title=" + title + ", author=" + author + "]";
	}

}
