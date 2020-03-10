/******************************
Count characters at same position as in English alphabet
Given a string of lower and uppercase characters, 
the task is to find that how many characters are at same position as in English alphabet.

Examples:

Input:  ABcED 
Output :  3
First three characters are at same position
as in English alphabets.

Input:  geeksforgeeks 
Output :  1
Only 'f' is at same position as in English
alphabet

Input :  alphabetical 
Output :  3 
 
**********************************/
package intervieQuestions.String._10_CountCharactersAtSamePositionAsInEnglishAlphabets;

//Java program to find number of 
//characters at same position 
//as in English alphabets 
public class _10_CountCharactersAtSamePositionAsInEnglishAlphabets {

	public static int findCount(String str) {
		int result = 0;

		// Traverse input string
		for (int i = 0; i < str.length(); i++)

		// Check that index of characters
		// of string is same as of English
		// alphabets by using ASCII values
		// and the fact that all lower case
		// alphabetic characters come together
		// in same order in ASCII table. And
		// same is true for upper case.

		{
			if (i == (str.charAt(i) - 'a') || i == (str.charAt(i) - 'A')) {
				result++;
			}
			//System.out.println(str.charAt(i) - 'A');
		}
		return result;
	}

	// Driver code
	public static void main(String[] args) {
		String str = "abdef";
		System.out.print(findCount(str));
	}
}

//This code is contributed by Rajput-JI 
