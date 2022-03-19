// immutable class	
import java.util.ArrayList;
import java.util.List;
	
public final class ImmutableDay { // immutable class should be final 
    private final List<String> days;  // immutable class attributes should be final
      
    public ImmutableDay(List<String> days) {
        this.days = days;
    }
            
    // return copy of days instead of actual data
    public List<String> getDays() {
         return new ArrayList<String>(this.days); 
    }
            
    public static void main(String[] args) {
        List<String> days = new ArrayList<String>();
        days.add("Monday");
        days.add("Tuesday");
        days.add("Wednesday");
        ImmutableDay day = new ImmutableDay(days);
        days = day.getDays();
        System.out.println(days);
        days.remove("Wednesday");
        System.out.println(day.getDays());
    }
}