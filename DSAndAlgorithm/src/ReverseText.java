
public class ReverseText {

	public static void main(String[] args) {
		String str = "abcde";
		char[] chs = reverseText(str);
		System.out.println(String.valueOf(chs));
	}

	private static char[] reverseText(String str) {
		char[] chs = str.toCharArray();
		int lastIndex = chs.length-1;
		for (int i=0; i<lastIndex ; i++ ) {
			char temp = chs[i];
			chs[i] = chs[lastIndex];
			chs[lastIndex] = temp;
			lastIndex--;
		}
		return chs;
	}

}
