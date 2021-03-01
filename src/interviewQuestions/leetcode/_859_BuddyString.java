/**
 * @Author Md. Mainul Hasan
 * 
 * 12:42:02 AM
 * 
 * Nov 7, 2020
 *
 */
package interviewQuestions.leetcode;

import java.util.Arrays;

public class _859_BuddyString {

	public static boolean buddyStrings(String A, String B) {
		int[] freqA = new int[26];
		int[] freqB = new int[26];

		final int n = A.length();

		for (int i = 0; i < n; i++) {

			int a = A.charAt(i);
			int b = B.charAt(i);

			freqA[a - 'a']++;
			freqB[b - 'a']++;
		}
		return Arrays.equals(freqA, freqB);

	}

	public static void main(String[] args) {
		String A = "ab";
		String B = "bb";
		System.out.println(buddyStrings(A, B));

	}

}
