package json;

import java.io.IOException;
import java.io.StringReader;

import com.google.gson.stream.JsonReader;
	
public class TestGsonReader {
    public static void main(String[] args) {
        String jsonString = "{\"id\":12345, \"name\":\"Jason Bourne\", \"age\":35, "
             + "\"roles\":[\"Actor\",\"Father\"]}";
        JsonReader jsonReader = new JsonReader(new StringReader(jsonString));
        try {
            jsonReader.beginObject();
            
            while(jsonReader.hasNext()){
                String key = jsonReader.nextName(); 
                if ("id".equals(key)){
                 System.out.println(jsonReader.nextInt());
                } else if("name".equals(key)){
                    System.out.println(jsonReader.nextString());
                } else if("age".equals(key)){
                    System.out.println(jsonReader.nextInt());
                } else if("roles".equals(key)){
                    jsonReader.beginArray();
                    
                    while (jsonReader.hasNext()) {
                        System.out.println(jsonReader.nextString());
                    }
                    jsonReader.endArray();
                } else {
                    jsonReader.skipValue(); 
                }
            }
            
            jsonReader.endObject();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}


