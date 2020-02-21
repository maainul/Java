/*

Java Program to find Reverse of the string.
In this program, we need to find the reverse of the string. 
This can be done by iterating the string backward and storing each character from the original string into a new string.

Original string: Dream big  
Reverse of the string: gib maerD  

ALGORITHM
	STEP 1: START
	STEP 2: DEFINE String string = "Dream big"
	STEP 3: DEFINE reversedStr = " "
	STEP 4: SET i =string.length()-1. REPEAT STEP 5 to STEP 6 UNTIL i>=0
	STEP 5: reversedStr = reversedStr + string.charAt(i)
	STEP 6: i = i - 1
	STEP 7: PRINT string.
	STEP 8: PRINT reversedStr.
	STEP 9: END
 */
package intervieQuestions.String;

public class _17_FindReverseOfTheString {
	public static void main(String agrs[]) {
		String string = "Dream big";
		String reverseString = "";
		for (int i = string.length()-1; i >= 0; i--) {
			reverseString = reverseString + string.charAt(i);
		}
		System.out.println(reverseString);
	}

}
