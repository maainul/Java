/*
 * 125. Valid Palindrome (Easy)
Given a string, determine if it is a palindrome, considering only alphanumeric characters and ignoring cases.

Note: For the purpose of this problem, we define empty string as valid palindrome.

Example 1:

Input: "A man, a plan, a canal: Panama"
Output: true
Example 2:

Input: "race a car"
Output: false

 */
package leetcode;

public class _125_ValidPalindrom {

	public static void main(String[] args) {
		String input = "A man, a plan, a canal: Panama";

		System.out.println(ValidPalindrom(input));
	}

	private static boolean ValidPalindrom(String input) {

		if (input == null || input.length() == 0) {
			return false;
		}
		input = input.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
		System.out.println(input);
		System.out.println(input);

		for (int i = 0; i < input.length(); i++) {
			if (input.charAt(i) != input.charAt(input.length() - 1 - i)) {
				return false;
			}
		}
		return true;
	}

}
