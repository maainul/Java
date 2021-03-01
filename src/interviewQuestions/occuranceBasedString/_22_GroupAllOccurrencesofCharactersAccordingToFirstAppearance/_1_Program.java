/**
 * @Author Md. Mainul Hasan
 * 
 * 11:49:14 PM
 * 
 * Nov 20, 2020
 *
 */
package interviewQuestions.occuranceBasedString._22_GroupAllOccurrencesofCharactersAccordingToFirstAppearance;

public class _1_Program {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String str = "geeksforgeeks";
		String resultString = frequency(str);
		System.out.println(resultString);
	}

	private static String frequency(String str) {
		int[] freq = new int[256];

		for (int i = 0; i < str.length(); i++) {
			freq[str.charAt(i) - 'A']++;
		}
		String resultString = "";
		for (int i = 0; i < str.length(); i++) {
			if ((freq[str.charAt(i) - 'A']) != 0) {
				for (int j = 0; j < freq[str.charAt(i) - 'A']; j++) {
					resultString += str.charAt(i);
					// System.out.println(str.charAt(i) + "----->" + freq[str.charAt(i) - 'A']);
				}
				// System.out.println(str.charAt(i) + "----->" + freq[str.charAt(i) - 'A']);

				freq[str.charAt(i) - 'A'] = 0;
			}
		}

		return resultString;
	}

}
