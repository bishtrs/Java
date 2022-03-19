// Reads file to String 
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class TestReadFile {

    public static void main(String args[]) {
        try {
            List<String> lines =  Files.readAllLines(Paths.get("C://Data.txt"));
            lines.forEach(System.out::println);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}	