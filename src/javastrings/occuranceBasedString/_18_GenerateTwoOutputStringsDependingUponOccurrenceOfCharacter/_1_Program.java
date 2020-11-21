/**
 * @Author Md. Mainul Hasan
 * 
 * 12:05:23 PM
 * 
 * Nov 19, 2020
 *
 */
package javastrings.occuranceBasedString._18_GenerateTwoOutputStringsDependingUponOccurrenceOfCharacter;

/*
Input : str[] = "geeksforgeeks"
Output : String with characters occurring once:
for
String with characters occurring multiple times:
egks

 */
public class _1_Program {

	final static int MAX_CHAR = 256;

	// function to print two strings
	// generated from single string one
	// with characters occurring once
	// other with character occurring
	// multiple of times
	static void printDuo(String str) {
		// initialize hashtable with zero
		// entry
		int countChar[] = new int[MAX_CHAR];

		// perform hashing for input string
		int n = str.length();
		for (int i = 0; i < n; i++) {
			countChar[str.charAt(i) - 'A']++;
		}

		// generate string (str1) consisting
		// char occurring once and string
		// (str2) consisting char occurring
		// multiple times
		String str1 = "", str2 = "";
		for (int i = 0; i < MAX_CHAR; i++) {
			if (countChar[i] > 1) {
				str2 = str2 + (char) (i + 'A');
			} else if (countChar[i] == 1) {
				str1 = str1 + (char) (i + 'A');
			}
		}

		for (int i = 0; i < countChar.length; i++) {
			if (countChar[i] >= 1) {
				System.out.println((char) (i + 'A') + " ----->" + countChar[i]);
			}
		}

		// print both strings
		System.out.print("String with characters occurring " + "once:\n");
		System.out.print(str1 + "\n");
		System.out.print("String with characters occurring " + "multiple times:\n");
		System.out.print(str2 + "\n");
		System.out.print("");
	}

	// driver program
	public static void main(String[] args) {
		String str = "GeeksForGeeks";
		printDuo(str);

	}

}
