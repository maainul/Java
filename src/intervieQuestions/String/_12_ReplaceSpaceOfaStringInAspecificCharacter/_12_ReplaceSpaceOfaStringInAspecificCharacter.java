/*

Java Program to replace the spaces of a string with a specific character
In this program, we need to replace all the spaces present in the string with a specific character.

String: Once in a blue moon
String after replacing space with '-': Once-in-a-blue-moon
One of the approach to accomplish this is by iterating through 
the string to find spaces. If spaces are present, 
then assign specific character in that index. 
Other approach is to 
use a built-in function replace function to replace space with a specific character.

For programming, follow the algorithm given below:

Algorithm
	STEP 1: START
	STEP 2: String string = "Once in a blue moon".
	STEP 3: char ch = '-'
	STEP 4: String = string.replace(' ', ch)
	STEP 5: PRINT "String after replacing spaces with given character:"
	STEP 6: PRINT string.
	STEP 7: END
 */
package intervieQuestions.String;

public class _12_ReplaceSpaceOfaStringInAspecificCharacter {

	public static void main(String[] args) {
		String string ="Once in a Blue Moon";
		// replace all method
		String replaceString = string.replaceAll("\\s", "-");
		System.out.println(replaceString);
		StringBuilder sb = new StringBuilder(string);
		// CharAt stringBuilder method
		for (int i = 0; i < string.length(); i++) {
			if(string.charAt(i) == ' ') {
				sb.setCharAt(i, '-');
				
			}
		}
		System.out.println(sb);
	}

}
