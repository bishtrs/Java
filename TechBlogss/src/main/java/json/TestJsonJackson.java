package json;

//Converts Java JSON to Map    
import java.io.IOException;
import java.util.Map;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
	
public class TestJsonJackson {
 public static void main(String[] args) {
     String jsonString = "{\"id\":\"12345\", \"name\":\"Jason Bourne\", \"age\":\"35\"}";
         
     ObjectMapper mapper = new ObjectMapper();

     try {
         Map<String, String> employee = mapper.readValue(jsonString, Map.class);
         System.out.println(employee);			
     } catch (JsonGenerationException | JsonMappingException e) {
         e.printStackTrace();
     } catch (IOException e) {
         e.printStackTrace();
     } 
 }
}
	