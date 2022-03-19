package xml;

//Converts JSON to XML    
import org.json.JSONException;
import org.json.JSONObject;
import org.json.XML;
	
public class JsonToXml {
 public static void main(String[] args) throws JSONException {
	String json = "{\"person\" :{\"firstName\": \"Harry\",\"lastName\": \"Potter\"," +
	    "\"addresses\": [{\"city\" : \"London\" },{ \"city\" : \"New York\"}]}}";
		
	JSONObject jsonObject = new JSONObject(json);
     String xml = XML.toString(jsonObject);
     
	System.out.println(xml);
 }
}	