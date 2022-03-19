public class IntegerToString {

	public static void main(String[] args) {
		integerToString(123);
	}

	private static void integerToString(int num) {
		// todo check for negative number
		StringBuilder sb = new StringBuilder();
		while (num > 0) {
			int last = num % 10;
			num = num / 10;
			sb.append(last);
		}
		System.out.println(sb.toString());
	}

}
