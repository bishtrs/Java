import java.util.ArrayList;
import java.util.List;

// Removes element from a List    
public class MyClass {
    public static void main(String[] args) {
        List<String> users = new ArrayList<String>();
        users.add("Harry");
        users.add("IronMan");
        users.add("Batman");
        
        for(String user : users) {
        	if (user.equalsIgnoreCase("Harry")) {
        		users.remove(user);
        	}
        }
        
        System.out.println("users " + users);
    }
}