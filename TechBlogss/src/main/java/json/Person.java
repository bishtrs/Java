package json;

import java.util.List;

public class Person {
    
    private String firstName;
    private String lastName;
    private List<String> address;
        
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
        
    public String getFirstName() {
        return this.firstName;
    }
        
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
        
    public String getLastName() {
        return this.lastName;
    }
        
    public void setAddress(List<String> address) {
        this.address = address;
    }
        
    public List<String> getAdress() {
        return this.address;
    }
    
    @Override
    public String toString() {
	    return "Person [firstName=" + firstName + ", lastName=" + lastName + ","
            + ", address=" + address + "]";
    }    
    
}
    