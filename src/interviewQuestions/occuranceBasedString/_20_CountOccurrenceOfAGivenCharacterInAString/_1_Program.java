/**
 * @Author Md. Mainul Hasan
 * 
 * 12:27:09 PM
 * 
 * Nov 19, 2020
 *
 */
package interviewQuestions.occuranceBasedString._20_CountOccurrenceOfAGivenCharacterInAString;

public class _1_Program {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String string = "geeksforgeeks";
		char c = 'e';
		System.out.println(countRepeation(string, c));

	}

	private static int countRepeation(String string, char c) {
		int count = 0;
		for (int i = 0; i < string.length(); i++) {
			if (string.charAt(i) == c) {
				count++;
			}
		}
		return count;
	}

}
