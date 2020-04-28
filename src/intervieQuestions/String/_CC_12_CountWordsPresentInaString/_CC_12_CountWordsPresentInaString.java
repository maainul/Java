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
package intervieQuestions.String._CC_12_CountWordsPresentInaString;

public class _CC_12_CountWordsPresentInaString {

	public static void main(String[] args) {
		String words[] = { "welcome", "to", "geeks", "portal" };

		String str = "geeksforgeeks is a computer science portal for geeks.";
		int result = findString(words, str);
		System.out.println(result);
	}

	private static int findString(String[] words, String str) {
		int count = 0;

		String replaceString = str.replace(".", "");
		String[] words2 = replaceString.split(" ");
		for (int i = 0; i < words.length; i++) {
			for (int j = 0; j < words2.length; j++) {
				if (words2[j].equals(words[i])) {
					count++;
				}

			}
		}

		return count;
	}
}
