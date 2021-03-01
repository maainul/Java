/**
 * @Author Md. Mainul Hasan
 * 
 * 4:31:37 AM
 * 
 * Oct 9, 2020
 *
 */
package interviewQuestions.leetcode;

/*
1446. Consecutive Characters
Easy


Given a string s, the power of the string is the maximum length of a non-empty substring that contains 

only one unique character.

Return the power of the string.

 

Example 1:

Input: s = "interviewQuestions.leetcode"
Output: 2
Explanation: The substring "ee" is of length 2 with the character 'e' only.
Example 2:

Input: s = "abbcccddddeeeeedcba"
Output: 5
Explanation: The substring "eeeee" is of length 5 with the character 'e' only.
Example 3:

Input: s = "triplepillooooow"
Output: 5
Example 4:

Input: s = "hooraaaaaaaaaaay"
Output: 11
Example 5:

Input: s = "tourist"
Output: 1
 */
public class _1446_ConsecutiveCharacters {

	public int maxPower(String s) {
		int max = 1;
		int count = 1;
		for (int i = 0; i < s.length() - 1; i++) {
			if (s.charAt(i) == s.charAt(i + 1)) {
				count++;
				max = Math.max(max, count);
			} else if (s.charAt(i) != s.charAt(i + 1)) {
				count = 1;
			}
		}
		return max;

	}

	public int maxPower2(String s) {
		int max = 1;
		int count = 1;
		for (int i = 0; i < s.length() - 1; i++) {
			if (s.charAt(i) == s.charAt(i + 1)) {
				count++;
			} else {
				count = 1;
			}
			max = Math.max(max, count);
		}
		return max;

	}

	public static void main(String[] args) {

		_1446_ConsecutiveCharacters obj = new _1446_ConsecutiveCharacters();

		String s = "hooraaaaaaaaaaay";

		System.out.println(obj.maxPower2(s));

	}

}
