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
package intervieQuestions.String._17_FindReverseOfTheString;

public class _17_FindReverseOfTheString {
	public static void main(String agrs[]) {
		String string = "Dream big";
		String reverseString = "";
		for (int i = string.length()-1; i >= 0; i--) {
			reverseString = reverseString + string.charAt(i);
		}
		System.out.println(reverseString);
		
		// method 2 :first make char of arry stirng;
		char[] charry = string.toCharArray();
		for (int i = charry.length-1; i >= 0; i--) {
			System.out.print(charry[i]);
		}
		
		// method 3 :String builder
		System.out.println("\nMethod 3 (String Builder)\n");
		String string2 = "Dream Very big";
		StringBuilder sb = new StringBuilder();
		for (int i = string2.length()-1; i >= 0; i--) {
			sb.append(string2.charAt(i));
		}
		System.out.println(sb.toString());
		
		
		// method 4 :String builder
		System.out.println("\nMethod 4 (String Builder Reverse)\n");
		String string3 = "Dream Very big";
		StringBuilder sb2 = new StringBuilder(string3);
		
		System.out.println(sb2.reverse().toString());
	}

}
