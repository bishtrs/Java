package java8;

import java.util.ArrayList;
import java.util.List;

public class StreamReduce {

	public static void main(String[] args) {
		List<Double> readings = new ArrayList<>();
		readings.add(10.3);
		readings.add(20.5);
		readings.add(30.6);

		double sum = readings.stream().reduce(0.0, (v1, v2) -> v1 + v2);
		System.out.println("Sum of readings " + sum);
	}
}
