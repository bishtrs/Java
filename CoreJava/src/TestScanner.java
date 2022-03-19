// Reads text file line by line using Scanner
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class TestScanner {

    public static void main(String[] args) {

    	try (Scanner scanner = new Scanner(new FileReader("C://employee.txt"))) {
            while (scanner.hasNext()) {
                System.out.printf("Name %s , Age %d, Salary %f %n",  scanner.next(), scanner.nextInt(), scanner.nextFloat());
            }
    	} catch (FileNotFoundException e) {
            e.printStackTrace();
        } 
    }

}