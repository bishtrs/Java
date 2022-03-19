// Converts LocalDate to Date Java
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Date;

public class LocalDateToDate {

    public static void main(String[] args) {
        ZoneId defaultZoneId = ZoneId.systemDefault();
		
        LocalDate localDate = LocalDate.of(2019, 8, 18);
        
        Date date = Date.from(localDate.atStartOfDay(defaultZoneId).toInstant());
        
        System.out.println("LocalDate is: " + localDate);
        System.out.println("Date is: " + date);
        
        LocalDateTime localDateTime = LocalDateTime.of(2019,8,18,00,00,0);
        date = Date.from(localDateTime.atZone(defaultZoneId).toInstant());
        System.out.println("Date is: " + date);
   }
}	