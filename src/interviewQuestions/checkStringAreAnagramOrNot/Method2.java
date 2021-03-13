package interviewQuestions.checkStringAreAnagramOrNot;

import java.util.Arrays;

public class Method2 {

	public static void main(String[] args) {
		String str1 = "cat";
		String str2 = "bct";
		boolean result = anagram(str1, str2);

		if (result) {
			System.out.println("Anagram");
		} else {
			System.out.println("Not anagram");
		}

	}

	private static boolean anagram(String str1, String str2) {
		int len1 = str1.length();
		int len2 = str2.length();

		char[] ch1 = str1.toCharArray();
		char[] ch2 = str2.toCharArray();

		Arrays.sort(ch1);
		Arrays.sort(ch2);

		System.out.println(Arrays.toString(ch1));
		System.out.println(Arrays.toString(ch2));

		// found and len1 and len2 equal hobe
		if (len1 == len2) {
			for (int i = 0; i < len1; i++) {
				if (ch1[i] != ch2[i]) {
					return false;
				}
			}

		} else {
			return false;
		}
		return true;

	}
}
