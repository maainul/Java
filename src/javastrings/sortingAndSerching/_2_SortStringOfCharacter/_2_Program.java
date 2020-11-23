/**
 * @Author Md. Mainul Hasan
 * 
 * 11:52:02 PM
 * 
 * Nov 22, 2020
 *
 */
package javastrings.sortingAndSerching._2_SortStringOfCharacter;

public class _2_Program {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String string = "geeksforgeek";
		sortString(string);

	}

	private static void sortString(String str) {
		int letters[] = new int[26];

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
