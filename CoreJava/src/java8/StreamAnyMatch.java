package java8;

import java.util.Arrays;
import java.util.List;

public class StreamAnyMatch {

	public static void main(String[] args) {
		Ball tennis = new Ball("tennis", 1, "green");
		Ball footBall = new Ball("football", 2, "white");
		Ball basketBall = new Ball("basketBall", 3, "orange");
		List<Ball> balls = Arrays.asList(tennis, footBall, basketBall);
		boolean noneMatch = balls.stream().noneMatch(b -> b.getSize() > 2);
		System.out.println(noneMatch);
	}
}
