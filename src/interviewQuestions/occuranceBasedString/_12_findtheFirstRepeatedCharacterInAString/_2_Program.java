/**
 * 
 */
package interviewQuestions.occuranceBasedString._12_findtheFirstRepeatedCharacterInAString;

/**
 * @author mainul Nov 18, 2020
 *
 */
public class _2_Program {

	public static void main(String[] args) {
		String string = "geeksforgeeks";
		int index = findFirstRepeat(string);
		System.out.println(string.charAt(index));

	}

	private static int findFirstRepeat(String string) {

		int j;

		int[] freq = new int[26];

		for (int i = 0; i < string.length(); i++) {
			freq[string.charAt(i) - 'a']++;
		}

		for (j = 0; j < string.length(); j++) {
			if (freq[string.charAt(j) - 'a'] > 1) {
				return j;
			}
		}

		return -1;
	}

}
