package json;

import java.io.InputStream;
import java.util.Set;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.networknt.schema.JsonSchema;
import com.networknt.schema.JsonSchemaFactory;
import com.networknt.schema.SpecVersion;
import com.networknt.schema.ValidationMessage;

public class JsonValidator2 {

	public static void main(String[] args) {

		ObjectMapper objectMapper = new ObjectMapper();
		JsonSchemaFactory schemaFactory = JsonSchemaFactory.getInstance(SpecVersion.VersionFlag.V201909);
		try (InputStream jsonStream = JsonValidator2.class.getResourceAsStream("/schema.json");
				InputStream schemaStream = JsonValidator2.class.getResourceAsStream("/data.json");) {
			JsonNode json = objectMapper.readTree(jsonStream);
			JsonSchema schema = schemaFactory.getSchema(schemaStream);
			Set<ValidationMessage> validationResult = schema.validate(json);

			if (validationResult.isEmpty()) {
				System.out.println("schema validated successfully");
			} else {
				System.out.println("schema validation failed");
				validationResult.forEach(vm -> System.out.println(vm.getMessage()));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
