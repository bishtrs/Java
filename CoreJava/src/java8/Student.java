package java8;

public class Student {
	private final int id;
	private final String subject;
	private final int marks;

	public Student(int id, String subject, int marks) {
		super();
		this.id = id;
		this.subject = subject;
		this.marks = marks;
	}

	public int getId() {
		return id;
	}

	public String getSubject() {
		return subject;
	}

	public int getMarks() {
		return marks;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", subject=" + subject + ", marks="
				+ marks + "]";
	}

}
