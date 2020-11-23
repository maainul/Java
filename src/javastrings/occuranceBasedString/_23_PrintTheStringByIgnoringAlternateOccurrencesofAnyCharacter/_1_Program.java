/**
 * @Author Md. Mainul Hasan
 * 
 * 7:10:22 PM
 * 
 * Nov 21, 2020
 *
 */
package javastrings.occuranceBasedString._23_PrintTheStringByIgnoringAlternateOccurrencesofAnyCharacter;

public class _1_Program {

	// Function to print the string
	static void printStringAlternate(String str) {
		int[] occ = new int[122];

		// Convert uppercase to lowercase
		String s = str.toLowerCase();

		// Start traversing the string
		for (int i = 0; i < str.length(); i++) {

			char temp = s.charAt(i);

			// Increment occurrence count
			occ[temp]++;

			// If count is odd then print the character
			if (occ[temp] % 2 != 0)
				System.out.print(str.charAt(i));
		}
		System.out.println();
	}

	// driver program
	public static void main(String[] args) {
		String str1 = "Geeks for geeks";
		String str2 = "It is a long day Dear";
		printStringAlternate(str1);
		printStringAlternate(str2);
	}
}

// Contributed by Pramod Kumar
