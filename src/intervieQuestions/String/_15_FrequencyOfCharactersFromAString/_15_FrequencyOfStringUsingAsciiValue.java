/*
## Solution Link : https://www.faceprep.in/program-to-find-the-frequency-of-characters-in-a-string/

Program to find the frequency of characters in a string | faceprep
Program to find the frequency of characters in a string is discussed here. Given a string, the frequency of occurrence of each character is displayed as output.

Input Format:
Input consists of 1 string.


Sample Input & Output:

Input: google
Output:
e 1
g 2
l 1
o 2

Algorithm to find the frequency of characters in a string
Input the string from the user.
Traverse the string, character by character and store the count of each of the characters in an array.
Print the array that contains the frequency of all the characters. 
Program to find the frequency of characters in a string is given below.


 */
package intervieQuestions.String._15_FrequencyOfCharactersFromAString;

public class _15_FrequencyOfStringUsingAsciiValue {

	public static void main(String[] args) {
		freq_of_chars("mynameisanik");

	}

	public static void freq_of_chars(String str) {
		final int SIZE = 26;
		int n = str.length();

		int[] freq = new int[SIZE];

		for (int i = 0; i < n; i++) {
			freq[str.charAt(i) - 'a']++;
		}

		for (int i = 0; i < n; i++) {

			if (freq[str.charAt(i) - 'a'] != 0) {

				System.out.println(str.charAt(i) + "---" + freq[str.charAt(i) - 'a']);

				freq[str.charAt(i) - 'a'] = 0;
			}
		}
	}
}