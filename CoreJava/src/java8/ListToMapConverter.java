package java8;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class ListToMapConverter {

	public static void main(String[] args) {

		List<Student2> students = new ArrayList<Student2>();
		students.add(new Student2(1, "John", 13));
		students.add(new Student2(2, "Mark", 14));
		students.add(new Student2(3, "Henry", 13));

		Map<Integer, Student2> rollNumberStudentMap = students.stream()
				.collect(Collectors.toMap(Student2::getRollNumber, Function.identity()));
		System.out.println(rollNumberStudentMap);
		rollNumberStudentMap = students.stream().collect(Collectors.toMap(Student2::getRollNumber, p -> p));
		System.out.println(rollNumberStudentMap);

		students.add(new Student2(1, "James", 15)); // oops student with same rollNumber

		// below throws exception
		// Map<Integer, String> rollNumberNameMap = Student2s.stream()
		// .collect(Collectors.toMap(Student2::getRollNumber, Student2::getName));
		Map<Integer, String> rollNumberNameMap = students.stream()
				.collect(Collectors.toMap(Student2::getRollNumber, Student2::getName, (a1, a2) -> {
					return a1;
				}));
		System.out.println(rollNumberNameMap);
		
	}

}
