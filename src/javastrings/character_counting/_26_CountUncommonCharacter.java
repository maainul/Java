/*
 * Find uncommon characters of the two strings
Find and print the uncommon characters of the two given strings in sorted order. Here uncommon character means that either the character is present in one string or it is present in other string but not in both. The strings contain only lowercase characters and can contain duplicates.

Source: Amazon Interview Experience | Set 355 (For 1 Year Experienced)

Examples:



Input: str1 = �characters�, str2 = �alphabets�
Output: b c l p r

Input: str1 = �geeksforgeeks�, str2 = �geeksquiz�
Output: f i o q r u z
 */
package javastrings.character_counting;

//Java implementation to find the uncommon 
//characters of the two strings 
public class _26_CountUncommonCharacter {

	// size of the hash table
	static int MAX_CHAR = 26;

	// function to find the uncommon
	// characters of the two strings
	public static void findAndPrintUncommonChars(String str1, String str2) {
		// mark presence of each character as 0
		// in the hash table 'present[]'
		int present[] = new int[MAX_CHAR];
		for (int i = 0; i < MAX_CHAR; i++) {
			present[i] = 0;
		}

		int l1 = str1.length();
		int l2 = str2.length();

		// for each character of str1, mark its
		// presence as 1 in 'present[]'
		for (int i = 0; i < l1; i++) {
			present[str1.charAt(i) - 'a'] = 1;
		}

		// for each character of str2
		for (int i = 0; i < l2; i++) {

			// if a character of str2 is also present
			// in str1, then mark its presence as -1
			if (present[str2.charAt(i) - 'a'] == 1 || present[str2.charAt(i) - 'a'] == -1) {
				present[str2.charAt(i) - 'a'] = -1;
			}

			// else mark its presence as 2
			else {
				present[str2.charAt(i) - 'a'] = 2;
			}
		}

		// print all the uncommon characters
		for (int i = 0; i < MAX_CHAR; i++) {
			if (present[i] == 1 || present[i] == 2) {
				System.out.print((char) (i + 'a') + " ");
			}
		}
	}

	// Driver code
	public static void main(String[] args) {
		String str1 = "characters";
		String str2 = "alphabets";
		findAndPrintUncommonChars(str1, str2);
	}
}
