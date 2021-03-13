/**
 * @Author Md. Mainul Hasan
 * 
 * 11:52:02 PM
 * 
 * Nov 22, 2020
 *
 */
package interviewQuestions._2_SortStringOfCharacter;

public class _2_Program {


	public static void main(String[] args) {
		String string = "geeksforgeek";
		//sortString(string);
		sortStringNew(string);

	}

	private static void sortStringNew(String string) {
		int[] freq = new int[26];
		char[] ch = string.toCharArray();
		for (char c : ch) {
			freq[c - 'a']++;
		}
		for (int i = 0; i < 26; i++) {
			for (int j = 0; j < freq[i]; j++) {
				System.out.print((char) (i + 'a'));
			}

		}



	}

	private static void sortString(String str) {
		int[] letters = new int[26];

		// Traverse string and increment
		// count of characters
		for (char x : str.toCharArray()) {

			// 'a'-'a' will be 0, 'b'-'a' will be 1,
			// so for location of character in count
			// array we will do str[i]-'a'.
			letters[x - 'a']++;
		}
		// Traverse the hash array and print
		// characters
		for (int i = 0; i < 26; i++) {
			for (int j = 0; j < letters[i]; j++) {
				System.out.print((char) (i + 'a'));
			}

		}

	}
}
