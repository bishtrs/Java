import java.util.ArrayList;
import java.util.List;

public class Fruit {
	
	private String name;
	private List<String> fruits = new ArrayList<>();
	
	public Fruit() {
	}
	
	public Fruit(String name) {
		this.name = name;
	}
	
	public void addFruit(String fruit) {
		fruits.add(fruit);
	}
	
	public List<String> getFruits() {
		return fruits;
	}

}
