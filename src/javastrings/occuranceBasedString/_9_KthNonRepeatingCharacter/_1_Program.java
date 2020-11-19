/**
 * 
 */
package javastrings.occuranceBasedString._9_KthNonRepeatingCharacter;

/**
 * @author mainul Nov 18, 2020
 *
 */
public class _1_Program {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String string = "geeksforgeeks";
		System.out.println(nonRepeating(string));

	}

	private static char nonRepeating(String string) {
		int k = 3, count = 0;
		int[] freq = new int[26];
		char result = ' ';

		for (int i = 0; i < string.length(); i++) {
			freq[string.charAt(i) - 'a']++;
		}

		for (int i = 0; i < string.length(); i++) {
			if (freq[string.charAt(i) - 'a'] == 1) {
				count++;
				if (count == k) {
					result = string.charAt(i);

				}

			}
		}

		return result;
	}

}
