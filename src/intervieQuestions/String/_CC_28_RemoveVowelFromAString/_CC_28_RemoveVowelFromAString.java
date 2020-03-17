/****************************************
Program to remove vowels from a String
Given a string, remove the vowels from the string and print the string without vowels.

Examples:

Input : welcome to geeksforgeeks
Output : wlcm t gksfrgks

Input : what is your name ?
*****************************************/

package intervieQuestions.String._CC_28_RemoveVowelFromAString;

import java.util.Arrays;
import java.util.List;

public class _CC_28_RemoveVowelFromAString {

	public static void main(String[] args) {
		String str = "What is your name?";
		System.out.println(removeVowel(str));
		System.out.println(removeVowel2(str));
	}

	private static String removeVowel2(String str) {
		Character vowels[] = { 'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U' };

		List<Character> al = Arrays.asList(vowels);

		StringBuffer sb = new StringBuffer(str);

		for (int i = 0; i < sb.length(); i++) {

			if (al.contains(sb.charAt(i))) {
				sb.replace(i, i + 1, "");
				i--;
			}
		}

		return sb.toString();
	}

	private static String removeVowel(String str) {
		return str.replaceAll("[aeiouAEIOU]", "");
	}

}
