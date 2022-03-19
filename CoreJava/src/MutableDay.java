import java.util.ArrayList;
import java.util.List;
        
// mutable class	
public final class MutableDay { 
    private List<String> days; 
      
    public MutableDay(List<String> days) {
        this.days = days;
    }
            
    public List<String> getDays() {
        return this.days; 
    }
                    
    public void setDays(List<String> days) {
        this.days = days;
    }
    
    public static void main(String[] args) {
        List<String> days = new ArrayList<String>();
        days.add("Monday");
        days.add("Tuesday");
        days.add("Wednesday");
        MutableDay day = new MutableDay(days);
        days = day.getDays();
        System.out.println(days);
        days.remove("Wednesday");
        System.out.println(day.getDays());
    }
}
        