/*

Check whether two strings are anagram of each other
Write a function to check whether two given strings are anagram of each other or not. 
An anagram of a string is another string that contains same characters, 
only the order of characters can be different. 
For example, “abcd” and “dabc” are anagram of each other.

Algorithm: 
	1. Define string
	2. Remove all space.
	3. length of the two string and check length same of not 
	4. Make array of characters to compare each other.
	5. Sort
	6. Compare two string
	
	
Write a Java program to check whether two strings are anagram or not?
Two strings are called anagrams if they contain same set of characters but in different order.

"keep ? peek", "Mother In Law - Hitler Woman".



*/

package intervieQuestions.String.CC_6_CountSubstringsWithSameFirstAndLastCharacters;

import java.util.Arrays;

public class _6_Extra_FindAnagramFromList {

public static void main(String[] args) {
	String arr[] = { "eat", "tea", "tan", "ate", "nat", "bat"};
	
	   findisAnagram(arr); //s1 // s2
	   //isAnagram("Mother In Law", "Hitler Woman");  
	
}

private static void findisAnagram(String[] arr) {
	for (int i = 0; i < arr.length; i++) {
		for (int j = i+1; j < arr.length; j++) {
			 if (areAnagram(arr[i], arr[j])) {
				 System.out.println(arr[i] +" is the anagram of  " + arr[j]); 
			 }
				
			}
		}
	}


private static boolean areAnagram(String str1, String str2) {
	// 2. Remove all space.
	String s1 = str1.replaceAll("\\s", "");
	String s2 = str2.replaceAll("\\s", "");
	
	// 3. length of the two string 
	int n1 = s1.length();
	int n2 = s2.length();
	if(n1 != n2) {
		return false;
	}else {
		// make array of characters to compare each other
		// because without array you are not able to compare 
		// equal mehod 
		// for sorting you need to array
		// Arrays1 = m o t h e r i n l a w
		// Array2  = h i t l e r w o m e n
		
		// ArraysS1 Sorted : aehilmnortw
		// ArraysS2 Sorted : aehilmnortw
		
		char[] ArrayS1 = s1.toLowerCase().toCharArray();
		char[] ArrayS2 = s2.toLowerCase().toCharArray();
		
        // Sort both strings 
        Arrays.sort(ArrayS1); 
        Arrays.sort(ArrayS2); 
  
        // Compare sorted strings 
        for (int i = 0; i < n1; i++) 
            if (ArrayS1[i] != ArrayS2[i]) 
                return false; 	
		}
	return true; 
	}
}

/*
 * eat , tea
eat , ate
tea , ate
tan , nat
*/
