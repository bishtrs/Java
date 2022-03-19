// Java 8 Optional filter() example
import java.util.Optional;

public class TestOptional {

	public static void main(String[] args) {

		 Optional<String> fruit = Optional.of("APPLE");
	        
	        if (fruit.isPresent()) {
	            System.out.println(fruit);
	        } else {
	            System.out.println("fruit is not available.");
	        }

	        Optional<String> string = Optional.of(" the quick fox ");
	        string.map(String::trim).ifPresent(System.out::println);
	        
	        Optional<String> emptyFruit = Optional.empty();
	        emptyFruit.ifPresent(f -> System.out.println("fruit is not available."));
    }


}
	