package json;
import org.json.JSONException;
import org.json.XML;
	
public class XMLToJSON {
    public static void main(String[] args) throws JSONException {
        String xml = "<person>" +
        "<firstName>Harry</firstName>" +
        "<lastName>Potter</lastName>" +
        "<addresses>" +
        "<address>" +
        "<city>London</city>" +
        "</address>" +
        "<address>" +
        "<city>New York</city>" +
        "</address>" +
        "</addresses>" +
        "</person>";

        System.out.println(XML.toJSONObject(xml).toString());

    }
}