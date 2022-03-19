import java.sql.Timestamp;
import java.time.Instant;
import java.util.Date;

// get current timestamp
public class CurrentTimestamp {
		
    public void print() {
        System.out.println("Hello");
    }
		
    public static void main(String[] args) {
    	// number of milliseconds, between the current time and midnight, January 1, 1970 UTC.
        long currentTime = System.currentTimeMillis();
		System.out.println("currentTime " + currentTime);
		
		Timestamp timestamp = new Timestamp(currentTime);
		System.out.println("timestamp " + timestamp);
		
		Instant instant = Instant.now();
		System.out.println("instant " +instant);
		
		// convert Timestamp to Instance
		instant = timestamp.toInstant();
        System.out.println("instant from Timestamp " +instant);
		
        // convert Instance to Timestamp
        timestamp = Timestamp.from(instant);
        System.out.println("timestamp from instant " + timestamp.getTime());
        
        Date date = new Date();
        timestamp = new Timestamp(date.getTime());
        System.out.println("timestamp from date " + timestamp.getTime());
    }
}