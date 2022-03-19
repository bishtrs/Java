import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class TestCSVReader {

	public static void main(String[] args) {

        String line = "";
        try (BufferedReader br = new BufferedReader(new FileReader("C://person.csv"))) {
            while ((line = br.readLine()) != null) {

                // use comma as separator
                String[] person = line.split(",");

                System.out.printf("[ID] %s [Name] %s [Age] %s", person[1], person[2], person[3]);
                System.out.println();
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } 

    }

}
	