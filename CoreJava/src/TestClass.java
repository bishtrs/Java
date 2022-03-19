// Refers a static method to it's functional method add().    
import java.util.function.BiFunction;
	
public class TestClass { 
    public static void main(String[] args) {
        BiFunction<Integer, Integer, Integer> output = TestClass::add;
        int out = output.apply(11, 5);
        System.out.println(out); // prints 16
    }
	
    public static int add(int a, int b){  
        return a + b;
    }
}  