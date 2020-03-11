package intervieQuestions.String._CC_24_PrintCommonCharactersOfTwoStringsinAlphabeticalOrder;

public class _24_PrintCommonCharactersOfTwoStringsinAlphabeticalOrder {

	public static void main(String[] args) {
		printstring("geeks", "forgeeks");

	}

	private static void printstring(String string1, String string2) {

		int[] arr1 = new int[26];
		int[] arr2 = new int[26];
		for (int i = 0; i < string1.length(); i++) {
			// System.out.println(arr1[string1.charAt(i) - 'a']);

			arr1[string1.charAt(i) - 'a']++;

		}
		System.out.println();
		for (int i = 0; i < string2.length(); i++) {
			// System.out.println(arr2[string2.charAt(i) - 'a']);
			arr2[string2.charAt(i) - 'a']++;

		}

		for (int i = 0; i < 26; i++) {
			if (arr1[i] != 0 && arr2[i] != 0) {
				System.out.println(arr1[i]);
				// Find the minimum of the occurrence
				// of the character in both strings and print
				// the letter that many number of times
				// for (int j = 0 ; j < Math.min(a1[i], a2[i]) ; j++)
				// System.out.print(((char)(i + 'a')));
			}
		}

	}

}
