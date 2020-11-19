/**
 * 
 */
package javastrings.occuranceBasedString.findtheFirstRepeatedCharacterInAString;

import java.util.HashSet;

/**
 * @author mainul Nov 18, 2020
 *
 */
/*
 * Input: ch = “geeksforgeeks” Output: e e is the first element that repeats
 * 
 * Input: str = “hello geeks” Output: l l is the first element that repeats
 */
public class _1_findtheFirstRepeatedCharacterInAString {

	// Java program to find the first
	// repeated character in a string

	// This function prints the first repeated
	// character in str[]
	static char firstRepeating(char str[]) {
		// Creates an empty hashset
		HashSet<Character> h = new HashSet<>();

		// Traverse the input array from left to right
		for (int i = 0; i <= str.length - 1; i++) {
			char c = str[i];

			// If element is already in hash set, update x
			// and then break
			if (h.contains(c))
				return c;

			else // Else add element to hash set
				h.add(c);
		}

		return '\0';
	}

	// Driver method to test above method
	public static void main(String[] args) {
		String str = "geeksforgeeks";
		char[] arr = str.toCharArray();
		System.out.println(firstRepeating(arr));
	}
}
