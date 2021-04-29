package interviewQuestions._7_MaximunConsecutiveRepeatedString;

/*
	Find maximum repeating consecutive character

	Input = "geeksforgeek"
	output = e

	Explanation e is consecutive 2 times, so ans is e.

 */

public class _1_Program {

	public static void main(String[] args) {
		String string = "geeksforgek";
		System.out.println(findFirstRepeat(string));

	}

	private static char findFirstRepeat(String str) {

		int len = str.length();
		int count = 0;

		// Find the maximum repeating character
		// starting from str[i]
		char res = str.charAt(0);
		for (int i = 0; i < len; i++) {
			int cur_count = 1;
			for (int j = i + 1; j < len; j++) {
				if (str.charAt(i) == str.charAt(j)) {
					cur_count++;
				} else {
					break;
				}
			}

			// Update result if required
			if (cur_count > count) {
				count = cur_count;
				res = str.charAt(i);
			}
		}
		return res;
	}

}