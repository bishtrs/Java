package json;



import java.io.FileWriter;
import java.io.IOException;

import com.google.gson.stream.JsonWriter;
	
public class TestGsonJsonWriter {
    public static void main(String[] args) {
                
        try (JsonWriter writer = new JsonWriter(new FileWriter("C:\\actor.json"))) {

            writer.beginObject();                   
            writer.name("id").value(12345);    
            writer.name("name").value("Jason Bourne");         
            writer.name("age").value(35);    

            writer.name("roles");
            writer.beginArray(); 
            writer.value("Actor");                  
            writer.value("Father");                  
            writer.endArray();                      

            writer.endObject();                     

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
	

