package javastrings;

/*
 * 
Program to check if two strings are anagrams or not is discussed here. 

Two strings are given as input and those strings have to be checked if they are anagrams or not. 

Anagram means that both strings contain the same character set, only their order is different. 

Therefore, in both strings, the frequency of each letter must be the same. For example, strings "act" and "cat" are anagrams.



The solution to this problem can be given in two different ways.

Method 1: Count the frequency of alphabets in both the strings and store them in respective arrays. 

If the two arrays are equal, return true. Else, return false.

Method 2: Sort both the strings and compare if both the sorted strings are equal. 

If they are equal, return true. Else, return false



Algorithm to check if two strings are anagrams or not


Input the two strings.

Create an array for both the strings.

Traverse both the strings and store the count of the alphabets of both the strings in respective arrays.

Check if both the arrays are equal.

If both the arrays are equal, return true. Else, return false.

 */

public class CheckIfTwoStringsAreAnagramsOrNot {

	public static void main(String[] args) {
		String str1, str2;
		int len, len1, len2, i, j, found = 0, not_found = 0;

		str1 = "cat";

		str2 = "act";

		len1 = str1.length();
		len2 = str2.length();

		if (len1 == len2) {
			len = len1;
			for (i = 0; i < len; i++) {
				found = 0;
				for (j = 0; j < len; j++) {
					if (str1.charAt(i) == str2.charAt(j)) {
						found = 1;
						break;
					}
				}
				if (found == 0) {
					not_found = 1;
					break;
				}
			}
			if (not_found == 1) {
				System.out.print("Strings are not Anagrams");
			} else {
				System.out.print("Strings are Anagrams");
			}
		} else {
			System.out.print("Both Strings Must have the same number of Character to be an Anagram");
		}
	}
}