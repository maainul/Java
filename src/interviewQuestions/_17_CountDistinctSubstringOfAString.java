package interviewQuestions;

public class _17_CountDistinctSubstringOfAString {

	public static void main(String[] args) {
		String str = "ababa";
		System.out.println(distinctCount(str));

	}

	private static int distinctCount(String str) {
		int count = 0;
		int flag = 0;
		String[] arrayStrings = new String[100];
		for (int i = 0; i < str.length(); i++) {
			for (int j = i + 1; j < str.length(); j++) {
				arrayStrings[flag++] = str.substring(i, j);
				// System.out.println(str.substring(i,j));
			}
		}
		for (int i = 0; i < arrayStrings.length; i++) {
			// System.out.println(arrayStrings[i]);
		}

		// String[] my_array = { "bcd", "abd", "jude", "bcd", "oiu", "gzw", "oiu" };

		for (int i = 0; i < arrayStrings.length - 1; i++) {
			for (int j = i + 1; j < arrayStrings.length; j++) {
				if ((arrayStrings[i].equals(arrayStrings[j])) && (i != j)) {
					count++;
					System.out.println("Duplicate Element is : " + arrayStrings[j]);
				}
			}

		}
		System.out.println(count);
		return count;
	}

}
