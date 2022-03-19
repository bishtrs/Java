import java.util.function.Supplier;

public class TestSupplier {

    public static void main(String args[]) {
        Supplier<Person> simpleSupplier = () -> new Person("John");
        System.out.println(simpleSupplier.get().getName()); // prints "John"
    }
}

class Person {
    
    private String name;
    
    public Person(String name) {
        this.name = name;
    }
    
    public String getName() {
        return this.name;
    }

}
	