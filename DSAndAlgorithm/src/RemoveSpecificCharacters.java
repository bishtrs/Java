
public class RemoveSpecificCharacters {

	public static void main(String[] args) {
		String str = removeSpecificChars("the quick brown fox jumped over", "qjo");
		System.out.println(str);
	}

	public static String removeSpecificChars(String originalstring, String removecharacterstring) {
		char[] orgchararray = originalstring.toCharArray();
		char[] removechararray = removecharacterstring.toCharArray();
		int start, end = 0;

		// tempBoolean automatically initialized to false ,size 128 assumes ASCII
		boolean[] tempBoolean = new boolean[128];

		// Set flags for the character to be removed
		for (start = 0; start < removechararray.length; ++start) {
			tempBoolean[removechararray[start]] = true;
		}

		// loop through all characters ,copying only if they are flagged to false
		for (start = 0; start < orgchararray.length; ++start) {
			if (!tempBoolean[orgchararray[start]]) {
				orgchararray[end++] = orgchararray[start];
			}
		}

		return new String(orgchararray, 0, end);
	}

}
