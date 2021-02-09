/**
 * @Author Md. Mainul Hasan
 * 
 * 7:47:46 PM
 * 
 * Nov 21, 2020
 *
 */
package javastrings.occuranceBasedString._19_PrintCharactersAndTheirFrequenciesInOrderOfOccurrence;

public class _1_Program {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String str = "geeksforgeeks";
		printCharWithFreq(str);

	}

	private static void printCharWithFreq(String str) {

		int[] freq = new int[122];

		for (int i = 0; i < str.length(); i++) {
			freq[str.charAt(i)]++;
		}

		for (int i = 0; i < str.length(); i++) {
			if (freq[str.charAt(i)] != 0) {
				System.out.println(str.charAt(i) + "------>" + freq[str.charAt(i)]);
				freq[str.charAt(i)] = 0;
			}

		}

	}

}
