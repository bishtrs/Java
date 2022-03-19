// Converts Date to LocalDate Java
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Date;

public class DateToLocalDate {

    public static void main(String[] args) {
        ZoneId defaultZoneId = ZoneId.systemDefault();
		
        Date date = new Date();
        LocalDate localDate = date.toInstant().atZone(defaultZoneId).toLocalDate();
        
        System.out.println("localDate is: " + localDate);
        System.out.println("Date is: " + date);
        
        LocalDateTime localDateTime = date.toInstant().atZone(defaultZoneId).toLocalDateTime();
        
        System.out.println("localDateTime is: " + localDateTime);
   }
}	