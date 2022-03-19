public class TestFormatting {

	public static void main(String[] args) {
    	String name1 = "Mark";
        String name2 = "Abraham";
        int age1 = 37;
        int age2 = 5;
        System.out.format("%s  %d\n",name1,age1);
        System.out.format("%s  %d\n",name2,age2);
        System.out.format("%-10s  %4d\n",name1,age1);
        System.out.format("%-10s  %4d\n",name2,age2);        
    }
}
	