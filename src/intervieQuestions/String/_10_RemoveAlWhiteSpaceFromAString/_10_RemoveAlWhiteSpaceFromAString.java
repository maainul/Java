/*
 * Java Program to remove all the white spaces from a string
In this program, our task is to remove all the white-spaces from the string. For this purpose, we need to traverse the string and check if any character of the string is matched with a white-space character or not. If so, use any built-in method like replace() with a blank.

In C, we do not have any built-in method to replace. Therefore, we need to run for loop to traverse the string and see if there is any white-space character or not. If so, then start the inner loop (j) from ith character to len and keep replacing each element with its next adjacent element. Decrease the length of the string by 1 on the termination of this loop. Repeat this process until all the white-spaces of the string are removed.

The algorithm of the program is given below.

Algorithm
	STEP 1: START
	STEP 2: DEFINE string str1 = "Remove white spaces".
	STEP 3: REPLACE all space characters with blank using replaceAll().
	STEP 4: PRINT str1.
	STEP 5: END
 */
package intervieQuestions.String._10_RemoveAlWhiteSpaceFromAString;

public class _10_RemoveAlWhiteSpaceFromAString {

	public static void main(String[] args) {
		String string = " This     Is A Test Case  ";
		string = string.replaceAll("\\s","");
		System.out.println(string);

	}

}
