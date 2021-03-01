/*
Implement strStr().

Return the index of the first occurrence of needle in haystack, or -1 if needle is not part of haystack.

Example 1:

Input: haystack = "hello", needle = "ll"
Output: 2

Example 2:

Input: haystack = "aaaaa", needle = "bba"
Output: -1

Clarification:

What should we return when needle is an empty string? This is a great question to ask during an interview.

For the purpose of this problem, we will return 0 when needle is an empty string. This is consistent to C's strstr() and Java's indexOf().
*/
package interviewQuestions.leetcode;

public class _28_ImplementStr {

	public static void main(String[] args) {
		String haystack = "hello", needle = "ll";

		System.out.println(strStr(haystack, needle));
	}

	public static int strStr(String haystack, String needle) {
		int haystackLength = haystack.length();
		int needleLength = needle.length();

		if (needleLength == 0) {
			return 0;
		}
		if (needleLength > haystackLength) {
			return -1;
		}
		if (needleLength == haystackLength) {
			return needle.equals(haystack) ? 0 : -1;
		}

		for (int i = 0; i <= haystackLength - needleLength; i++) {
			int j;
			for (j = 0; j < needleLength; j++) {
				if (haystack.charAt(i + j) != needle.charAt(j)) {
					break;
				}
			}
			if (j == needleLength) {
				return i;
			}
		}
		return -1;
	}

}
