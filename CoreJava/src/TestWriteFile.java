// Reads file to String 
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class TestWriteFile {

    public static void main(String args[]) {
        String content = "The quick brown fox jumps over the lazy dog";
        
        try (BufferedWriter writer = Files.newBufferedWriter(Paths.get("C://Data.txt"))) {
            writer.write(content);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}	