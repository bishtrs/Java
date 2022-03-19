package java8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class StreamSort {

	public static void main(String[] args) {
		 Ball tennis = new Ball("tennis", 1, "green");
	        Ball footBall = new Ball("football", 2, "white");
	        Ball basketBall = new Ball("basketBall", 3, "orange");
	        List<Ball> balls = Arrays.asList(tennis, footBall, basketBall);
	        balls.stream().sorted().forEach(System.out::println);
		
	}
}

class Ball implements Comparable<Ball> {

    private String name;
    private int size;
    private String color;

    public Ball(String name, int size, String color) {
        this.name = name;
        this.size = size;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public int getSize() {
        return size;
    }

    public String getColor() {
        return color;
    }

    @Override
    public String toString() {
        return "Ball [name=" + name + ", size=" + size + ", color=" + color + "]";
    }

    public int compareTo(Ball ball) {
        return this.getName().compareTo(ball.getName());
    }

}