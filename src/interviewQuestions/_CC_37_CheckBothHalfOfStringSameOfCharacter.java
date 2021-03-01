/*
Check if both halves of the string have same set of characters
Given a string of lowercase characters only, the task is to check if it is possible to split a string from the middle which will give two halves having the same characters and same frequency of each character. If the length of the given string is ODD then ignore the middle element and check for the rest.

Examples:

Input: abbaab
Output: NO
The two halves contain the same characters
but their frequencies do not match so they
are NOT CORRECT

Input : abccab
Output : YES
Algorithm:



Declare two counter arrays for keeping count of characters in two half of the string, each of size 26.
Now run a loop and take two variables i and j, where i starts from 0 and j starts from (length of string � 1).
For each character in the string, go to the corresponding index in the counter arrays and increment the value by 1 and increment i and decrement j. Do this until i is less than j.
After finishing STEP 3, again run a loop and compare values of counter arrays. If value of first array if not equal to value of second array, then return false.
If all counts matched, return true.
 */
package interviewQuestions;

public class _CC_37_CheckBothHalfOfStringSameOfCharacter {

	public static void main(String[] args) {
		String str = "abba";
		System.out.println(cheeckstr(str));
	}

	private static boolean cheeckstr(String str) {
		int length = str.length();
		int[] count1 = new int[26];
		int[] count2 = new int[26];

		if (str.length() == 1) {
			return true;
		}
		for (int i = 0; i < length / 2; i++) {
			count1[str.charAt(i) - 'a']++;
		}

		for (int i = length / 2; i < length; i++) {
			count2[str.charAt(i) - 'a']++;
		}
		System.out.println("\ncount 1------\n");
		for (int i = 0; i < count1.length; i++) {
			System.out.print(count1[i] + " ");
		}

		System.out.println("\ncount 2------\n");
		for (int i = 0; i < count2.length; i++) {
			System.out.print(count2[i] + " ");
		}

		for (int i = 0; i < 26; i++) {
			if (count1[i] != count2[i]) {
				return false;
			}
		}
		return true;

	}

}
