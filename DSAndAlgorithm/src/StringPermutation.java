public class StringPermutation {

	public static void main(String[] args) {
		String text = "ABC";
		permutation(text, "");
	}

	private static void permutation(String text, String ans) {
		System.out.format("text ans %s %s %n", text, ans);
		if (text.length() == 0) {
            System.out.println(ans + " ");
            return;
        }
  
		// ABC
		for (int i=0; i<text.length() ; i++) {
			char ch = text.charAt(i);
			String str = text.substring(0, i).concat(text.substring(i+1));
			permutation(str, ans + ch);
		}
	}

}
