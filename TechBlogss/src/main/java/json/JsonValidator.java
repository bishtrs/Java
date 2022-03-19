package json;

import org.everit.json.schema.Schema;
import org.everit.json.schema.ValidationException;
import org.everit.json.schema.loader.SchemaLoader;
import org.json.JSONObject;
import org.json.JSONTokener;

public class JsonValidator {

	public static void main(String[] args) {
		JSONObject jsonSchema = new JSONObject(
				new JSONTokener(JsonValidator.class.getResourceAsStream("/schema.json")));
		JSONObject jsonData = new JSONObject(new JSONTokener(JsonValidator.class.getResourceAsStream("/data.json")));

		Schema schema = SchemaLoader.load(jsonSchema);
		try {
			schema.validate(jsonData);
		} catch (ValidationException e) {
			System.out.println("schema validation failed");
			e.printStackTrace();
		}
		System.out.println("schema validated successfully");
		
		// https://cswr.github.io/JsonSchema/spec/basic_types/
	}

}
