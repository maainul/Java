package interviewQuestions;

import java.util.Scanner;

/*
Find the first non-repeating character in a string | FACE Prep

Published on 11 Mar 2020

Program to find the first non-repeating character in a string is discussed here. 

Given a string, the task is to find the first non-repeating character in the string.



Input and Output format:

The first line of the input consists of a string.



Sample Input 1:

teeterson


Sample Output 1:

r


Sample Input 2:

charactercharacter



Sample Output 2:

All characters are repetitive


Algorithm to find the first non-repeating character in a string


1. Input the string from the user.

2. Start traversing the string using two loops.

3. Use the first loop to scan the characters of the string one by one.

4. Use the second loop to find if the current character is occurring in the latter part if the string or not.

5. If it is not occurring, print that character.

Else, continue traversing.

*/
public class FindTheFirstNonRepeatingCharacterInAString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String string = sc.nextLine();
		sc.close();
		int result = firstRepeatingChar(string);

		System.out.println(result == -1 ? "All are repeatative" : string.charAt(result));
	}

	private static int firstRepeatingChar(String string) {
		int[] freq = new int[26];
		int index = -1;
		for (int i = 0; i < string.length(); i++) {
			freq[string.charAt(i) - 'a']++;
		}

		for (int i = 0; i < string.length(); i++) {
			if (freq[string.charAt(i) - 'a'] != 0) {
				if (freq[string.charAt(i) - 'a'] == 1) {
					index = i;
					break;
				}

				freq[string.charAt(i) - 'a'] = 0;
			}
		}
		return index;

	}

}
