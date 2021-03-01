package interviewQuestions.occuranceBasedString.maximumRepeatedString;

public class _2_Progra {

	public static void main(String[] args) {
		String string = "annikoooo";
		System.out.println(findFirstRepeat(string));

	}

	private static char findFirstRepeat(String string) {

		int j;
		char result = ' ';
		int[] freq = new int[256];
		int min = Integer.MAX_VALUE;
		for (int i = 0; i < string.length(); i++) {
			freq[string.charAt(i)]++;
		}

		for (j = 0; j < string.length(); j++) {

			if (freq[string.charAt(j)] < min) {

				min = freq[string.charAt(j)];
				result = string.charAt(j);
			}

		}

		return result;
	}

}
