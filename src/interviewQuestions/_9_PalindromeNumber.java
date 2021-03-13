/***********************************************************************
9. Palindrome NumberEasy

Share
Determine whether an integer is a palindrome. An integer is a palindrome when it reads the same backward as forward.

Example 1:

Input: 121
Output: true
Example 2:

Input: -121
Output: false
Explanation: From left to right, it reads -121. From right to left, it becomes 121-. Therefore it is not a palindrome.
Example 3:

Input: 10
Output: false
Explanation: Reads 01 from right to left. Therefore it is not a palindrome.
Follow up:

Coud you solve it without converting the integer to a string?
**************************************************************************/
package interviewQuestions;

public class _9_PalindromeNumber {

	public static void main(String[] args) {

		reverseInteger(-001);
	}

	public static void reverseInteger(int x) {
		long rev = 0;
		long n = x;

		while (n > 0) {
			rev = (rev * 10) + (n % 10);
			n = n / 10;
		}

		if (x == rev) {
			System.out.println(rev);
			System.out.println("palindrom");

		} else {
			System.out.println("Not a palindrom");
		}
	}

}
