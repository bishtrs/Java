import java.util.function.Predicate;

public class TestPredicate {

    public static void main(String args[]) {
        Predicate<Integer> greaterThan = i -> (i > 10);  
        Predicate<Integer> lessThan = i -> (i < 20);  
  
        System.out.println(greaterThan.equals(lessThan));  
        System.out.println(greaterThan.equals(greaterThan));  
    }
}	