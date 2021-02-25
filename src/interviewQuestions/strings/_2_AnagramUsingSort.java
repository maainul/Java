package interviewQuestions.strings;// JAVA program to check whether two strings
// are anagrams of each other
import java.io.*;
import java.util.Arrays;
import java.util.Collections;

class _2_AnagramUsingSort {

	/* function to check whether two strings are
	anagram of each other */
	static boolean areAnagram(String str1, String str2)
	{
		// Get lenghts of both strings
		char[] c1 = str1.toCharArray();
		char[] c2 = str2.toCharArray();
		int n1 = c1.length;
		int n2 = c2.length;

		// If length of both strings is not same,
		// then they cannot be anagram
		if (n1 != n2)
			return false;

		// Sort both strings
		Arrays.sort(c1);
		Arrays.sort(c2);

		// Compare sorted strings
		for (int i = 0; i < n1; i++)
			if (c1[i] != c2[i])
				return false;

		return true;
	}

	/* Driver Code*/
	public static void main(String args[])
	{
		String str1 =  "test" ;
		String str2 = "ttew" ;
	
		// Function Call
		if (areAnagram(str1, str2))
			System.out.println("The two strings are"
							+ " anagram of each other");
		else
			System.out.println("The two strings are not"
							+ " anagram of each other");
	}
}

// This code is contributed by Nikita Tiwari.
