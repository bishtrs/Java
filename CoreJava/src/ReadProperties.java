// Read properties file	
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;
		
public class ReadProperties {
    public static void main(String[] args) {
	    try {	
            FileReader reader = new FileReader("C:\\db.properties"); 
            Properties properties = new Properties();  
            properties.load(reader); 
            System.out.println(properties.getProperty("db.username"));
            System.out.println(properties.getProperty("db.password"));
        } catch (IOException io) {
            io.printStackTrace();
		}
    }		
}
	