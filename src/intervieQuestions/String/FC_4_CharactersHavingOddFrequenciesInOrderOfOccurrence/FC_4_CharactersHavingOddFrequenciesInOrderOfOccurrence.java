/************************************************************************************************
https://www.geeksforgeeks.org/print-characters-having-odd-frequencies-in-order-of-occurrence/

Print characters having odd frequencies in order of occurrence

Given a string str containing only lowercase characters. 
The task is to print the characters having an odd frequency in the order of their occurrence.

Note: Repeated elements with odd frequency are printed as 
many times they occur in order of their occurrences.

Examples:

Input: str = “geeksforgeeks”
Output: for

CHARACTER	FREQUENCY
‘g’				2
‘e’				4
‘k’				2
‘s’				2
‘f’				1
‘o’				1
‘r’				1

‘f’, ‘o’ and ‘r’ are the only characters with odd frequencies.

Input: str = “elephant”
Output: lphant


*************************************************************************************************/

package intervieQuestions.String.FC_4_CharactersHavingOddFrequenciesInOrderOfOccurrence;

public class FC_4_CharactersHavingOddFrequenciesInOrderOfOccurrence {

	public static void main(String[] args) {

		String str = "geeksforgeeks"; 
		printCharWithFreq(str); 

	}
	private static void printCharWithFreq(String str) {
		int n = str.length();
		int[] freq = new int[26];
		
		for(int i = 0; i< n; i++) {
			freq[str.charAt(i)-'a']++;
		}
		
		for(int i = 0; i< n ;i++) {
			if(freq[str.charAt(i) - 'a'] > 0 && freq[str.charAt(i)-'a'] %2 == 1) {
				System.out.println(str.charAt(i));
				
				freq[str.charAt(i) - 'a'] = 0; 
			}
		}
		
	}

}
/*
f
o
r
*/

