import static org.hamcrest.CoreMatchers.anyOf;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.contains;
import static org.hamcrest.Matchers.hasItem;
import static org.hamcrest.Matchers.hasItems;
import static org.hamcrest.Matchers.hasSize;
import static org.hamcrest.Matchers.not;

import java.util.List;

import org.hamcrest.collection.IsEmptyCollection;
import org.junit.Test;


public class FruitTest {
	
	
	@Test
    public void testGetFruits() {
		Fruit fruit = new Fruit();
		fruit.addFruit("Apple");
		fruit.addFruit("Banana");
		fruit.addFruit("Mango");
		List<String> fruits = fruit.getFruits();
        
		assertThat(fruits, not(IsEmptyCollection.<String>empty()));
        assertThat(fruits, hasSize(3));

        assertThat(fruits, hasItems("Apple", "Mango", "Banana")); // any order is fine
        assertThat(fruits, contains("Apple", "Banana", "Mango")); // strict order
        
        assertThat(fruits, not(hasItem("Pineapple")));
        
        assertThat(fruits, hasItems(anyOf(equalTo("Apple"), equalTo("two"),	equalTo("three"))));
    }

}
