// Java 8 Date and Time API LocalDate
import java.time.LocalDate;
import java.time.Month;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class TestLocalDate {

    public static void main(String args[]) {
        LocalDate today = LocalDate.now();
        System.out.println("Today's date is: " + today);
        
        LocalDate date = LocalDate.of(2012, Month.DECEMBER, 12);
        System.out.println(date);
        
        date = LocalDate.now(ZoneId.of("Asia/Kolkata"));
        System.out.println("Date in Asia/Kolkata zone " + date);
        
        date = LocalDate.now(ZoneId.of("America/Cuiaba"));
        System.out.println("Date in America/Cuiaba zone " + date);
        
        date = LocalDate.parse("2015-10-26");
        System.out.println("Parsed date " + date);
        
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MMM-yyyy");
       
        LocalDate localDate = LocalDate.parse("16-Jul-2019", formatter);
        System.out.println("localDate " +localDate);  
        System.out.println("formatted localDate " +formatter.format(localDate));

        
        // Returns the LocalDate by adding the number of days to the epoch starting day (1970)
        date = LocalDate.ofEpochDay(150);  // middle of 1970
        System.out.println("Date from epoch day " + date);
        
        // obtains an instance of LocalDate from a year and day-of-year.
        date = LocalDate.ofYearDay(2016,100);
        System.out.println(date);
        
        // adds the specified amount to the days field 
        date = date.plusDays(100);
        System.out.println(date);
    }
}	