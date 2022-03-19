package json;

public class Employee {
    
    private int id;
    private String name;
    private int age;
        
    public void setId(int id) {
        this.id = id;
    }
        
    public int getId() {
        return this.id;
    }
        
    public void setName(String name) {
        this.name = name;
    }
        
    public String getName() {
        return this.name;
    }
        
    public void setAge(int age) {
        this.age = age;
    }
        
    public int getAge() {
        return this.age;
    }
        
    @Override
	public String toString() {
        return "Employee [id=" + id + ", name=" + name + "," +" age=" + age + "]";
    }  
   
}