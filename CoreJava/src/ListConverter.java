import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ListConverter {

	public static void main(String[] args) {
		List<User> users = new ArrayList<>();
		users.add(new User("John", "Mathews", 39));
		users.add(new User("Boris", "Becker", 59));

		List<Employee> employees = new ArrayList<>();
		
		employees = users.stream().map(user -> {
			Employee employee = new Employee(user.getFirstName().concat(" ").concat(user.getLastName()),
					user.getAge());
			return employee;
		}).collect(Collectors.toList());
		
		System.out.println(users);
		System.out.println(employees);
	}
}

class User {
	private String firstName;
	private String lastName;
	private int age;

	public User(String firstName, String lastName, int age) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public int getAge() {
		return age;
	}

	@Override
	public String toString() {
		return "User [firstName=" + firstName + ", lastName=" + lastName
				+ ", age=" + age + "]";
	}
	

}

class Employee {
	private String fullName;
	private int age;
	
	public Employee(String fullName, int age) {
		this.fullName = fullName;
		this.age = age;
	}

	public String getFullName() {
		return fullName;
	}

	public int getAge() {
		return age;
	}

	@Override
	public String toString() {
		return "Employee [fullName=" + fullName + ", age=" + age + "]";
	}
	

}
