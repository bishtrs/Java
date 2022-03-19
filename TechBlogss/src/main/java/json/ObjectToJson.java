package json;

//Converts Java JSON to Map    
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.databind.ObjectMapper;

public class ObjectToJson {
	public static void main(String[] args) {
		Actor actor = new Actor();
		actor.setId(1234);
		actor.setName("Pierce Brosnan");
		actor.setAge(40);
        
        List<String> emailaddress = new ArrayList<>();
        emailaddress.add("p.brosnan@yahoo.com");
        emailaddress.add("p.brosnan@gmail.com");
        actor.setEmailaddress(emailaddress);
            
        ObjectMapper mapper = new ObjectMapper();
        String jsonString = "";

        try {
            jsonString = mapper.writeValueAsString(actor);
            System.out.println(jsonString);   
            // Enable pretty print
            jsonString = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(actor);
            System.out.println("Prettyfied output");
            System.out.println(jsonString); 
        }  catch (IOException e) {
            e.printStackTrace();
        } 
        
        
        Map<String, String> map = new HashMap<>();
        map.put("id", "12345");
        map.put("name", "Pierce Brosnan");
        map.put("age", "36");
            
        try {
            jsonString = mapper.writeValueAsString(map);
            System.out.println(jsonString);	
            
            // Pretty JSON
            jsonString = mapper.writerWithDefaultPrettyPrinter()
                .writeValueAsString(map);
            System.out.println(jsonString);	
        }  catch (IOException e) {
            e.printStackTrace();
        } 
        
	}
}
