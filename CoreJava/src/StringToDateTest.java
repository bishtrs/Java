import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;
    
// converts String to Date
public class StringToDateTest {
	public static void main(String[] args) {
		Date date = null;
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss Z");
        
        String dateInString = "2017-10-01 15:23:01 PDT";

    	try {
            date = formatter.parse(dateInString);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        
        System.out.println(formatter.format(date));
        
        dateInString = "2017-10-01 15:23:01 IST";

    	try {
            date = formatter.parse(dateInString);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        
        System.out.println(formatter.format(date));
        formatter.setTimeZone(TimeZone.getTimeZone("Europe/Berlin"));
        System.out.println(formatter.format(date));
        formatter.setTimeZone(TimeZone.getTimeZone("GMT"));
        System.out.println(formatter.format(date));
        
        Integer a = Integer.valueOf(100);
        Integer b = Integer.valueOf(100);
        System.out.println(a==b);
        
        Integer c = Integer.valueOf(150);
        Integer d = Integer.valueOf(150);
        System.out.println(c==d);
    }
}