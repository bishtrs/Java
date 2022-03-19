package java8;
import java.util.Optional;

public class TestOptional {

    public static void main(String[] args) {

        Optional<String> fruit = Optional.of("APPLE");
        Optional<String> emptyFruit = Optional.empty();

        System.out.println("Non-Empty Optional:: " + fruit.map(String::toUpperCase));
        System.out.println("Empty Optional    :: " + emptyFruit.map(String::toUpperCase));

    }

}	