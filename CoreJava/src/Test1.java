import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;


public class Test1 {
	
	public static void main(String[] args) {
	//String str = "Forget  CVs..Save time . x x";
	String str = "We test coders. Give us a try?";
	//String str = "We test coders. Give us a try? Give us a try again!";
	//String str = "We test coders again and again. Give us a try? Give us a try again!";
	//String str = "We test coders again and again.Give us a try? Give us a try again!";
	//String str = "We test coders again and again. Give us a try? Give us a try again please";
	char[] delimiters = new char[3];
	delimiters[0] = '.';
	delimiters[1] = '?';
	delimiters[2] = '!';
	
	List<String> list = new ArrayList<>();
	int beginIndex= 0;
	
	for (int  i=0; i<str.length() ; i++) {
		for (int  j=0; j<delimiters.length ; j++) {
			if (delimiters[j] == str.charAt(i)) {
				list.add(str.substring(beginIndex, i).trim());
				beginIndex = i+1;
			}
		}
		
	}
	
	
	int max = 0;
	for (String ls : list) {
		System.out.println(ls);
		StringTokenizer tokens = new StringTokenizer(ls);
	    int count = tokens.countTokens();
	    System.out.println(count);
	    if (count > max) {
			max = count;
		}
		
		
	}
	System.out.println(max);
	}

}
