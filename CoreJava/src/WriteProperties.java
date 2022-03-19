import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Properties;

		
public class WriteProperties {
    public static void main(String[] args) {
        try (OutputStream output = new FileOutputStream("C:\\db2.properties")) {
            Properties properties = new Properties();  
            properties.setProperty("db.username", "scott");
            properties.setProperty("db.password", "tiger");		
            properties.store(output, "Properties Example");
            System.out.println(properties);
        } catch (IOException io) {
            io.printStackTrace();
        }		
    }
}