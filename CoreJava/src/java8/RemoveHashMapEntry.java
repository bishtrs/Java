package java8;

import java.util.HashMap;
import java.util.Map;

public class RemoveHashMapEntry {

	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<>();
		map.put("John", 2);
		map.put("Mark", 1);
		map.put("Thomas", 4);
		map.put("James", 3);
		map.put("Edwin", 5);
		map.put("Vinod", 6);
		System.out.println(map);
		map.entrySet().removeIf(e -> e.getKey().equals("Mark"));
		map.entrySet().removeIf(e -> e.getValue().equals(6));
		System.out.println(map);
		map.clear();
		System.out.println(map);
	}

}

