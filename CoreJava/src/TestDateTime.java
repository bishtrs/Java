// Java 8 Date Time API Duration
import java.time.Duration;
import java.time.LocalDateTime;

public class TestDateTime {
    public static void main(String args[]) {
        Duration duration = Duration.ofSeconds(6, 8);
        System.out.println("duration " + duration);
        
        Duration oneDay = Duration.between(LocalDateTime.now().plusDays(1), LocalDateTime.now().plusDays(1));
        System.out.println("oneDay " + oneDay);
        
    }
}	