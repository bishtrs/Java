//compare enum values    
public class CompareEnums {
    private enum Color { BLUE, GREEN, YELLOW, ORANGE};
    
    public static void main(String[] args) {
    	Color color = Color.BLUE;

    	if (color == Color.BLUE) {
            System.out.println("color == Color.BLUE " + true);
    	}
    	
    	if (color.equals(Color.BLUE)) {
            System.out.println("color.equals(Color.BLUE) " + true);
    	}
    	
    	color = null;
    	if (Color.BLUE.equals(color)) {
            System.out.println("color.equals(Color.BLUE) " + true);
    	}


    }
}	