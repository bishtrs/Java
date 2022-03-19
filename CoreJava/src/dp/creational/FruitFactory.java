package dp.creational;

import java.util.HashMap;
import java.util.Map;

public class FruitFactory {

	private static final Map<String, Fruit> prototypes = new HashMap<>();

	static {
		prototypes.put("apple", new Apple("Apple"));
		prototypes.put("mango", new Mango("Mango"));
		prototypes.put("banana", new Mango("Banana"));
	}

	public static Fruit getPrototype(String type) {
		try {
			return prototypes.get(type).clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return null;
	}

}
