package json;

//Converts Java JSON to Map    
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonToObject {
	public static void main(String[] args) {
		String jsonString = "{\"id\":12345, \"name\":\"Pierce Brosnan\", \"age\":35,"
				+ " \"emailaddress\":[\"p.brosnan@gmail.com\", \"p.brosnan@yahoo.com\"]}";

		ObjectMapper mapper = new ObjectMapper();
		Actor actor = null;

		try {
			actor = mapper.readValue(jsonString, Actor.class);
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println(actor);
		
		Map<String, String> map = new HashMap<>();
		try {
			map = mapper.readValue(jsonString, Map.class);
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println(map);
	}
}
