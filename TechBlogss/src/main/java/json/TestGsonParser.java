package json;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
	
public class TestGsonParser {
    public static void main(String[] args) {
                
    	Employee emp = new Employee();
        emp.setId(2345);
        emp.setName("James Bond");
        emp.setAge(40);
        
        List<String> emailaddress = new ArrayList<>();
        emailaddress.add("jbond@yahoo.com");
        emailaddress.add("jbond@gmail.com");
        //emp.setEmailaddress(emailaddress);
        Gson gson = new GsonBuilder().setPrettyPrinting().create();   
        String jsonEmp = gson.toJson(emp); // create JSON String from Object
        System.out.print(jsonEmp);
    }
}