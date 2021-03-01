/********************************************************************************
459. Repeated Substring Pattern (Easy)

Given a non-empty string check if it can be constructed by taking a substring of 
it and appending multiple copies of the substring together. 
You may assume the given string consists of lowercase English letters only and 
its length will not exceed 10000.

Example 1:

Input: "abab"
Output: True
Explanation: It's the substring "ab" twice.
Example 2:

Input: "aba"
Output: False
Example 3:

Input: "abcabcabcabc"
Output: True
Explanation: It's the substring "abc" four times. (And the substring "abcabc" twice.)
********************************************************************************/

package interviewQuestions.leetcode;

public class _459_RepeatedSubStringPattern {

	public static void main(String[] args) {

		String str = "ababab";
		System.out.println(repeatedSubstringPattern(str));

	}

	public static boolean repeatedSubstringPattern(String str) {
		int sumStr = str.length();
		for (int i = sumStr / 2; i >= 1; i--) {
			if (sumStr % i == 0) {
				int num = sumStr / i;
				StringBuffer sb = new StringBuffer();
				String strx = str.substring(0, i);
				for (int j = 0; j < num; j++) {
					sb.append(strx);
				}
				if (sb.toString().equals(str))
					return true;
			}
		}
		return false;
	}
}
