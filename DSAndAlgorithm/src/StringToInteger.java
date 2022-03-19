public class StringToInteger {

	public static void main(String[] args) {
		stringToInteger("123");
	}

	private static void stringToInteger(String text) {
		// todo check for negative number
		char[] ch = text.toCharArray();
		int num = 0;
		for (int i=0 ; i< ch.length ;i++) {
			num = 10*num; 
			num = num + (int)ch[i] - (int)'0';
		}
		
		System.out.println(num);
	}

}
