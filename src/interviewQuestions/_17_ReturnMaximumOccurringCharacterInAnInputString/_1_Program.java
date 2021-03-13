/**
 * @Author Md. Mainul Hasan
 * 
 * 11:24:45 AM
 * 
 * Nov 19, 2020
 *
 */
package interviewQuestions._17_ReturnMaximumOccurringCharacterInAnInputString;

public class _1_Program {

	private static final int ASCII_SIZE = 256;

	public static void main(String[] args) {
		String str = "s a mp l e str in g";
		System.out.println("Max occurring character is " + getMaxOccuringChar(str));

	}

	private static char getMaxOccuringChar(String str) {

		// Create array to keep the count of individual
		// characters and initialize the array as 0
		int count[] = new int[ASCII_SIZE];

		// Construct character count array from the input
		// string.
		int len = str.length();
		for (int i = 0; i < len; i++)

			count[str.charAt(i)]++;

		for (int i = 0; i < count.length; i++)
			if (count[i] != 0) {
				System.out.println(count[i]);
			}

		int max = -1; // Initialize max count
		char result = ' '; // Initialize result

		// Traversing through the string and maintaining
		// the count of each character
		for (int i = 0; i < len; i++) {
			if (max < count[str.charAt(i)] && str.charAt(i) != ' ') {
				max = count[str.charAt(i)];
				result = str.charAt(i);
			}
		}

		return result;
	}

}
