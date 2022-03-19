package others;

// Download file from URL	
import java.io.File;
import java.io.IOException;
import java.net.URL;

import org.apache.commons.io.FileUtils;

public class DownloadFileFromURL {
	
	public static void main(String[] args) {
		
		String url = "https://www.oracle.com/java/technologies/#chapter1";
		String fileName = "C://chapter1.txt";
		
		try {
			FileUtils.copyURLToFile(new URL(url), new File(fileName));
			
			// with connection, read timeout
			FileUtils.copyURLToFile(new URL(url), new File(fileName), 10000, 10000);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
