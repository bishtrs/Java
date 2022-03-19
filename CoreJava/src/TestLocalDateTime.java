

// Java 8 Date Time API LocalDateTime
import java.time.LocalDateTime;
import java.time.ZoneId;

public class TestLocalDateTime {

    public static void main(String args[]) {
    	 LocalDateTime time = LocalDateTime.now();
         System.out.println("Current time is: " + time);
         
         // add one hour , 20 min
         time = time.plusHours(1).plusMinutes(20);
         System.out.println("Current time is: " + time);
         
         time = LocalDateTime.now(ZoneId.of("Asia/Tokyo"));
         System.out.println("Time in Asia/Kolkata zone " + time);
         
         time = LocalDateTime.now(ZoneId.of("America/Cuiaba"));
         System.out.println("Time in Asia/Kolkata zone " + time);
         
         time = LocalDateTime.parse("2018-03-20T06:30:00");
         System.out.println("Parsed time " + time);
         
         
        
        
    }
}	

