package java8;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CollectorsMinByExample {

    public static void main(String[] args) {
         
         /*Stream<String> stream = Stream.of("Harry", "Alan", "Tom", "John");
         Optional<String> op = stream.collect(Collectors.maxBy(String::compareTo));
         if (op.isPresent()) {
            System.out.println(op.get());
         } else {
            System.out.println("Nothing!");
         }
    	
         stream = Stream.of("Harry", "Alan", "Tom", "John");
         op = stream.collect(Collectors.minBy(String::compareTo));
         if (op.isPresent()) {
            System.out.println(op.get());
         } else {
            System.out.println("Nothing!");
         }*/
         
    	Ball tennis = new Ball("tennis", 1, "green");
        Ball footBall = new Ball("football", 2, "white");
        Ball basketBall = new Ball("basketBall", 3, "orange");
        Ball volleyBall = new Ball("volleyBall", 4, "orange");
        
        List<Ball> balls = Arrays.asList(tennis, footBall, basketBall, volleyBall);
        Optional<Ball> ball = balls.stream().collect(Collectors.minBy((b1, b2)
           -> b1.getSize() - b2. getSize()));
        if (ball.isPresent()) {
           System.out.println("Smallest ball :: " + ball);
        } else {
           System.out.println("Not found!");
        }
        
        ball = balls.stream().collect(Collectors.maxBy((b1, b2) -> b1.getSize() - b2. getSize()));
        if (ball.isPresent()) {
           System.out.println("Biggest ball :: " + ball);
        } else {
           System.out.println("Not found!");
        }
    }
}   


   