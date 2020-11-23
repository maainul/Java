/**
 * @Author Md. Mainul Hasan
 * 
 * 12:32:55 PM
 * 
 * Nov 19, 2020
 *
 */
package javastrings.occuranceBasedString._1_PrintCharactersAndTheirFrequenciesInOrderOfOccurrenceOccurrenceOfCharacter;

// Frequcny without maintaining serial

public class _1_Program {

	public static void main(String[] args) {
		String str = "geeksforgeeks";
		findFreq(str);

	}

	private static void findFreq(String str) {
		int[] freq = new int[256];
		for (int i = 0; i < str.length(); i++) {
			freq[str.charAt(i) - 'A']++;
		}

		for (int i = 0; i < freq.length; i++) {
			if (freq[i] != 0) {
				System.out.println((char) (i + 'A') + "----->" + freq[i]);
			}

		}

	}

}
