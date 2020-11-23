/**
 * 
 */
package javastrings.occuranceBasedString._7_MaximunConsecutiveRepeatedString;

/**
 * @author mainul Nov 18, 2020
 *
 */

public class _2_Program {

	public static void main(String[] args) {
		String string = "aaaadddddddddaaiddddddddikkeeeeeeeeeeeeekkk";
		System.out.println(findFirstRepeat(string));

	}

	private static char findFirstRepeat(String str) {

		int len = str.length();
		int count = 0;
		int cur_count = 1;
		// Find the maximum repeating character
		// starting from str[i]
		char res = str.charAt(0);
		for (int i = 1; i < len; i++) {
			// If current character matches with next
			if (str.charAt(i - 1) == str.charAt(i))
				cur_count++;

			// If doesn't match, update result
			// (if required) and reset count
			else {

				cur_count = 1;
			}

			if (cur_count > count) {
				count = cur_count;
				res = str.charAt(i);
			}
		}
		return res;
	}

}
