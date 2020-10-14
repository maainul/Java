/**
 * @Author Md. Mainul Hasan
 * 
 * 12:14:16 PM
 * 
 * Oct 14, 2020
 *
 */
package leetcode;

public class _680_ValidPalindromeII {

	public boolean Palindrome(String s, int low, int high) {
		while (low < high) {
			if (s.charAt(low) == s.charAt(high)) {
				low++;
				high--;
			} else
				return false;
		}
		return true;
	}

	public boolean validPalindrome(String s) {
		if (s.length() == 0 || s.length() == 1)
			return true;
		int low = 0, high = s.length() - 1;

		while (low < high) {
			if (s.charAt(low) == s.charAt(high)) {
				low++;
				high--;
			}

			// If there is a mismatch

			// Check if the palindrome is formed by deleting the char on the left
			else if (Palindrome(s, low + 1, high))
				return true;

			// Else check if the palindrome is formed by deleting the char on the right
			else if (Palindrome(s, low, high - 1))
				return true;

			// If both of the above are not possible then more than one characters need to
			// be deleted for a palindrome to be formed
			else
				return false;
		}

		// If the console reaches here that means no chars need to be deleted for the
		// word to be a palindrome
		return true;
	}

	public static void main(String[] args) {
		_680_ValidPalindromeII obj = new _680_ValidPalindromeII();
		boolean c = obj.validPalindrome("aba");
		System.out.println(c);

	}

}
