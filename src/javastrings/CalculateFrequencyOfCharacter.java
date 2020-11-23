package javastrings;

/*
Program to find the frequency of characters in a string | 

Published on 11 Mar 2020

Program to find the frequency of characters in a string is discussed here. 

Given a string, the frequency of occurrence of each character is displayed as output.


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

 */
public class CalculateFrequencyOfCharacter {

	public static void main(String[] args) {
		String string = "google";
		freqCalculator(string);

	}

	private static void freqCalculator(String string) {
		int[] freq = new int[26];
		for (int i = 0; i < string.length(); i++) {
			freq[string.charAt(i) - 'a']++;
		}

		for (int i = 0; i < string.length(); i++) {
			System.out.println();
			if (freq[string.charAt(i) - 'a'] != 0) {
				System.out.print(string.charAt(i) + " ---");
				System.out.println(freq[string.charAt(i) - 'a']);
				freq[string.charAt(i) - 'a'] = 0;
			}

		}

	}
}
