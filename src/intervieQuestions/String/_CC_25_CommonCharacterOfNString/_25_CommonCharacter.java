/*****************************************************************
Common characters in n strings
Given n strings, 
find the common characters in all the strings. 
In simple words, find characters that appear in all the strings and display them in alphabetical order 
or lexicographical order.

Notewe’ll be considering that the strings contain lower case letters only.

Examples:


Input :  geeksforgeeks
         gemkstones
         acknowledges
         aguelikes

Output : e g k s

Input :  apple 
         orange

Output : a e
We’ll use two hash arrays of size 26 (for a-z, where 0 is a, and z is 25).
The approach will be simple, if we have seen a character before we’ll mark it and if we haven’t then ignore the character because it is not a common one.
 ******************************************************************/
package intervieQuestions.String._CC_25_CommonCharacterOfNString;

public class _25_CommonCharacter {

	public static void main(String[] args) {
		String s1 = "aguelikes", s2 = "geeksforgeeks";
		int[] a1 = new int[26];
		int[] a2 = new int[26];

		for (int i = 0; i < s1.length(); i++) {
			int c = s1.charAt(i) - 'a';
			a1[c]++;
		}
		for (int i = 0; i < s2.length(); i++) {
			int c = s2.charAt(i) - 'a';
			a2[c]++;
		}

		for (int i = 0; i < 26; i++) {
			if ((a1[i] != 0) && (a2[i] != 0)) {
				for (int j = 0; j < Math.min(a1[i], a2[i]); j++) {
					System.out.print((char) (i + 'a'));
				}

			}

		}

	}

}
