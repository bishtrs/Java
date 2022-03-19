// Java 8 Date Time API LocalTime
import java.time.LocalTime;
import java.time.ZoneId;

public class TestLocalTime {

    public static void main(String args[]) {
        LocalTime time = LocalTime.now();
        System.out.println("Current time is: " + time);
        
        // add one hour , 20 min
        time = time.plusHours(1).plusMinutes(20);
        System.out.println("Current time is: " + time);
        
        time = LocalTime.of(10,23);
        System.out.println(time);
        
        time = LocalTime.now(ZoneId.of("Asia/Tokyo"));
        System.out.println("Time in Asia/Kolkata zone " + time);
        
        time = LocalTime.now(ZoneId.of("America/Cuiaba"));
        System.out.println("Time in Asia/Kolkata zone " + time);
        
        time = LocalTime.parse("14:20:05");
        System.out.println("Parsed time " + time);
        
        time = LocalTime.ofSecondOfDay(66620);
        System.out.println(time);
        
    }
}	