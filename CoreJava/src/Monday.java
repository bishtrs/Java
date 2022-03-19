public final class Monday { // class should be final 
    private final String day; // class attributes should be final
    private final int dayNumber; // class attributes should be final
      
    public Monday(String day, int dayNumber) {
        this.day = day; 
        this.dayNumber = dayNumber; 
    }
            
    public String getDay() {
        return this.day; 
    }
                    
    public int getDayNumber() {
        return this.dayNumber;
    }
            
    public static void main(String[] args) {
        Monday monday = new Monday("Monday", 1);
        System.out.println(monday.getDay());
        System.out.println(monday.getDayNumber());
    }
}