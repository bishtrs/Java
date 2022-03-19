package java8;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CollectorsJoiningExample {

    public static void main(String[] args) {
    	 Ball tennis = new Ball("tennis", 1, "green");
         Ball footBall = new Ball("football", 2, "white");
         Ball basketBall = new Ball("basketBall", 3, "orange");
         Ball volleyBall = new Ball("volleyBall", 4, "orange");
         
         List<Ball> balls = Arrays.asList(tennis, footBall, basketBall, volleyBall);
         
         String ballNames = balls.stream()
                 .filter(ball -> ball.getSize() > 1)
                 .map(Ball::getName)
                 .collect(Collectors.joining(",", "-> ", "."));
         System.out.println("Name of balls greater than size 1 " + ballNames);
    }
}       
   