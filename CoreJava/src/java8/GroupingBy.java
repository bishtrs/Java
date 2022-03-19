package java8;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupingBy {

	public static void main(String[] args) {
		List<Student> students = new ArrayList<>();
		students.add(new Student(1, "English", 74));
		students.add(new Student(1, "Science", 89));
		students.add(new Student(2, "English", 89));
		students.add(new Student(2, "Science", 91));
		students.add(new Student(3, "English", 69));
		students.add(new Student(3, "Science", 95));
		
		Map<Integer, Integer> marks = students.stream().collect(
				Collectors.groupingBy(Student::getId, Collectors.summingInt(Student::getMarks)));
		System.out.println(marks);
		Map<String, Double> average = students.stream().collect(
				Collectors.groupingBy(Student::getSubject, Collectors.averagingInt(Student::getMarks)));
		System.out.println(average);
		
	}
}


