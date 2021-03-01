package interviewQuestions.ProgramToCountTheCommonSubSequenceOfTwoStrings;

/*
Program to count the common sub sequence of two strings | FACE Prep

Program to count the common sub sequence of two strings is discussed here. 

Given two strings, count all the common sub-sequences of the two strings and print it.

For example,

Input:

string 1 = "abcd"

string 2 = "abc"

Output:

Number of common sub-sequences = 7

Common sub-sequences: 'a', 'b', 'c', 'ab', 'bc', 'ac', 'abc'.

Input:

String 1 : bajdpmk

String 2 : dimnkc

Output:

Number of common sub-sequences = 7

Common sub-sequences: 'd', 'k', 'm', 'dk', 'km', 'dm', 'dmk'.

Algorithm to count the common sub sequence of two strings


Input both the strings.

Define arr[i][j] = arr[i][j-1] + arr[i-1][j] + 1, when s1[i-1] is equal to s2[j-1]

When s1[i-1] == s1[j-1],

all previous common sub-sequences are doubles as they get appended by one another character.
 
Both arr[i][j-1] and arr[i-1][j] contain arr[i-1][j-1] and hence it gets added 

two times in recurrence which takes care of doubling the count of all previous common sub-sequences.

Addition of 1 in recurrence is done for the latest character match, 

which is the common sub-sequence made up of s1[i-1] and s2[j-1]= arr[i-1][j] + arr[i][j-1] arr[i-1][j-1], 

when s1[i-1] is not equal to s2[j-1].

Subtract arr[i-1][j-1] once because it is present in both arr[i][j 1] and arr[i 1][j] and is added twice.

**/

public class Method1 {

	public static void main(String[] args) {
		String str = "tes";
		StringBuilder sb = new StringBuilder();

		// Appending the characters in the reverse order
		for (int i = str.length() - 1; i >= 0; i--) {
			sb.append(str.charAt(i));
		}
		System.out.println(sb.toString());
	}
}
