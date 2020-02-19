/*
 * Java Program to find all subsets of a string
In this program, all the subsets of the string need to be printed. The subset of a string is the character or the group of characters that are present inside the string.

All the possible subsets for a string will be n(n+1)/2.

For example, all possible subsets of a string "FUN" will be F, U, N, FU, UN, FUN.

To complete this program, we need to run two for loops. The outer loop is used to maintain the relative position of the first character and the second loop is used to create all possible subsets and prints them one by one.

The algorithm of the program is given below.

Algorithm
	STEP 1: START
	STEP 2: DEFINE string str = "FUN"
	STEP 3: DEFINE len = str.length()
	STEP 4: SET temp =0
	STEP 5: DEFINE String array having length: len*(len + 1)/2
	STEP 6: SET i =0. REPEAT STEP 7 to STEP 11 UNTIL i<len
	STEP 7: SET j =1. REPEAT STEP 8 to STEP 10 UNTIL j<len
	STEP 8: arr[temp] = str.substring(i, j+1)
	STEP 9: temp = temp + 1
	STEP 10: j =j + 1
	STEP 11: i =i +1
	STEP 12: PRINT ("All subsets for given string are: ")
	STEP 13: SET i = 0
	STEP 14: REPEAT STEP 14 UNTIL i<arr.length
	STEP 14: PRINT arr[i]
	STEP 15: END
 */
package intervieQuestions.String;

public class _7_FindAllSubSequenceOfAString {

	public static void main(String[] args) {
		String string = "Fun";
		
		int length = string.length();
		
		int len = (length*(length+1)/2);
		int temp = 0;
		String[] subSequenceString = new String[(len)];
		
		for (int i = 0; i < length; i++) {
			for (int j = i; j < length; j++) {
				subSequenceString[temp] = string.substring(i, j+1);
				temp++;
			}
		}
		
		for (int i = 0; i < subSequenceString.length; i++) {
			System.out.println(subSequenceString[i]);
		}
	}

}
