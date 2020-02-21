/*
 * Java Program to determine whether two strings are the anagram
Two Strings are called the anagram if they contain the same characters. However, the order or sequence of the characters can be different.

In this program, our task is to check for two strings that, they are the anagram or not. For this purpose, we are following a simpler approach.

First of all, Compare the length of the strings, if they are not equal in the length then print the error message and make an exit, otherwise, convert the string into lower-case for the easy comparisons. Sort both the strings using bubble sort or other sorting methods. If the strings are found to be identical after sorting, then print that strings are anagram otherwise print that strings are not the anagram.

For programming, follow the algorithm given below:

Algorithm
	STEP 1: START
	STEP 2: DEFINE str1 = "Brag", str2 = "Grab".
	STEP 3: CONVERT str1, str2 to lower-case.
	STEP 4: IF length of str1, str2 are not equal then PRINT "Not Anagram"
	else go to Step 5
	STEP 5: CONVERT str1, str2 to character arrays.
	STEP 6: SORT the arrays.
	STEP 7: COMPARE the arrays, IF equal then PRINT "Anagram"
	else
	PRINT "Not Anagram"
	STEP 8: END
 */
package intervieQuestions.String._5_AnagramsOfTwoString;

import java.util.Arrays;

public class _5_AnagramsOfTwoString {

	public static void main(String[] args) {
		String string1 = "END";
		String string2 = "DEN";
		
		
		string1 = string1.toLowerCase();
		string2 = string2.toLowerCase();
		
		if(string1.length() != string2.length()) {
			System.out.println("Not anagram.");
		}
		
		char[] Array1 = string1.toCharArray();
		char[] Array2 = string2.toCharArray();
		
		Arrays.sort(Array1);
		Arrays.sort(Array2);
		
		if(Arrays.equals(Array1,Array2)) {
			System.out.println("Both are anagram.");
		}else {
			System.out.println("Not Anagram");
		}
		

	}

}
