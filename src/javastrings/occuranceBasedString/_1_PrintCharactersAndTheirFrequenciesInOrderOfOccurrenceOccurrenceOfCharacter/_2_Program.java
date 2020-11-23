/**
 * @Author Md. Mainul Hasan
 * 
 * 12:37:55 PM
 * 
 * Nov 19, 2020
 *
 */
package javastrings.occuranceBasedString._1_PrintCharactersAndTheirFrequenciesInOrderOfOccurrenceOccurrenceOfCharacter;

// Frequcny without maintaining serial

public class _2_Program {

	public static void main(String[] args) {
		String str = "GeekSforgeekS";
		findFreq(str);

	}

	private static void findFreq(String str) {
		int[] freq = new int[256];
		for (int i = 0; i < str.length(); i++) {
			freq[str.charAt(i) - 'A']++;
		}

		for (int i = 0; i < str.length(); i++) {
			if (freq[str.charAt(i) - 'A'] != 0) {
				System.out.println(str.charAt(i) + "----->" + freq[str.charAt(i) - 'A']);
				freq[str.charAt(i) - 'A'] = 0;

			}

		}

	}

}
