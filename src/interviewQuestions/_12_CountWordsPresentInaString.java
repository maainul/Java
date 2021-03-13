/*
Count words present in a string
Given an array of words and a string, we need to count all words that are present in given string.

Examples:

Input : words[] = { "welcome", "to", "geeks", "portal"}
            str = "geeksforgeeks is a computer science portal for geeks."
Output :  2
Two words "portal" and "geeks" is present in str.


Input : words[] = {"Save", "Water", "Save", "Yourself"}
        str     = "Save"
Output :1
 */
package interviewQuestions;

public class _12_CountWordsPresentInaString {

	public static void main(String[] args) {
		String[] words = { "welcome", "to", "geeks", "portal" };

		String str = "geeksforgeeks is a computer science portal for geeks.";
		int result = findString(words, str);
		System.out.println(result);
	}

	private static int findString(String[] words, String str) {
		int count = 0;

		String replaceString = str.replace(".", "");
		String[] words2 = replaceString.split(" ");
		for (String word : words) {
			for (String s : words2) {
				if (s.equals(word)) {
					count++;
				}
			}
		}

		return count;
	}
}
