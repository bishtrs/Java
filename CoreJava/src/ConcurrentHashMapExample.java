import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
	
public class ConcurrentHashMapExample {
    public static void main(String[] args) {
        Map<String, Integer> map = new ConcurrentHashMap<>();
        map.put("hello world", "hello world".length());
        map.put("this is a ConcurrentHashMap", "this is a ConcurrentHashMap".length());
        System.out.println("map " + map);
		
        map.computeIfAbsent("computeIfAbsent example", (k) -> k.length());

        System.out.println("updated map " + map);
    }
}