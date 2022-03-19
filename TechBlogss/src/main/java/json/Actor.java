package json;

import java.util.List;

public class Actor {

	private int id;
	private String name;
	private int age;
	private List<String> emailaddress;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public List<String> getEmailaddress() {
		return emailaddress;
	}

	public void setEmailaddress(List<String> emailaddress) {
		this.emailaddress = emailaddress;
	}

	@Override
	public String toString() {
		return "Actor [id=" + id + ", name=" + name + "," + " age=" + age + ", emailaddress=" + emailaddress + "]";
	}

}
