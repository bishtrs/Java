// Writes JSON object to a file

package json;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
				
public class TestJsonWriter {
    public static void main(String[] args) {
        JSONParser parser = new JSONParser();
        String agent = "{\"id\":12345, \"name\":\"Jason Bourne\","+
        "\"age\":35,\"emailaddress\":[\"j.bourne@gmail.com\","+
        "\"j.bourne@yahoo.com\"]}";
        
        JSONObject jsonObject = new JSONObject(); 
        jsonObject.put("id", 12345);
        jsonObject.put("name", "Jason Bourne");
        jsonObject.put("age", 35);
            
        JSONArray emailaddress = new JSONArray();
        emailaddress.add("j.bourne@gmail.com");
        emailaddress.add("j.bourne@yahoo.com");
		
        jsonObject.put("emailaddress", emailaddress);
                
        System.out.println(jsonObject);
                
        PrintWriter pw = null;
        try {
            pw = new PrintWriter("C:///Data.json");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } 

        pw.write(jsonObject.toJSONString()); 
          
        pw.flush(); 
        pw.close(); 

    }
}
