package json;

import java.util.List;

import com.jayway.jsonpath.Criteria;
import com.jayway.jsonpath.Filter;
import com.jayway.jsonpath.JsonPath;


public class JsonPathTest {
	public static void main(String[] args) {
		String json = "{\"id\":12345, \"studentname\":\"James Anderson\", \"age\":35,"
				+ " \"subjects\":[\"Computer Science\", \"Physics\"]}";

		Integer id = JsonPath.read(json, "$.id");
		System.out.println(id);
		String subject = JsonPath.read(json, "$.subjects[0]");
		System.out.println(subject);
		
		String json2 = "{ \"students\" : [{\"id\":12345,	 \"name\":\"James Anderson\", \"age\":25, \"subjects\":[\"computer science\",\"physics\"] }, "
				+ "{\"id\":12346,	\"name\":\"Keanu Reeves\", \"age\":35, \"subjects\":[\"computer science\",\"physics\"] } ]	}";
		List<Object> names = JsonPath.read(json2, "$.students[*].name");
		System.out.println(names);
		
		Filter filter =	Filter.filter(Criteria.where("age").lt(30));
		String expr = "$['students'][?].name";
		names = JsonPath.read(json2, expr, filter);
		System.out.println(names);
	}
}
