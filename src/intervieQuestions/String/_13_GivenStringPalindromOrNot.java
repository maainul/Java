/*

Java Program to determine whether a given string is palindrome
In this program, we need to check whether a given string is palindrome or not.

A string is said to be palindrome if it is the same from both the ends. For e.g. above string is a palindrome because if we try to read it from backward, it is same as forward. One of the approach to check this is iterate through the string till middle of string and compare a character from back and forth.

ALGORITHM
	STEP 1: START
	STEP 2: DEFINE String string = "Kayak"
	STEP 3: SET flag = true
	STEP 4: CONVERT string into lowercase.
	STEP 5: SET i =0. REPEAT STEP 6 to STEP 7 UNTIL i
	STEP 6: IF (string.charAt(i) != string.charAt(string.length()-i-1))
	              then
	              SET flag = false
	              break
	STEP 7: SET i = i + 1
	STEP 8: IF flag
	              then PRINT "Yes"
	              else
	              PRINT "No"
	STEP 9: END
Program:
 */
package intervieQuestions.String;

public class _13_GivenStringPalindromOrNot {

	public static void main(String[] args) {
		String string = "Mollom";
		string = string.toLowerCase();
		boolean flag = true;
		
		for (int i = 0; i < string.length()/2; i++) {
			if(string.charAt(i) != string.charAt(string.length()-1-i)) {
				flag = false;
				break;
			}
		}
		
		if(flag) {
			System.out.println(string+ " is palindrom Stirng.");
		}else {
			System.out.println(string+ " is not a palindrom string.");
		}
	}

}
