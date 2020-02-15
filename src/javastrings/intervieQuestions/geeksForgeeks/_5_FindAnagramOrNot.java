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

package javastrings.intervieQuestions.geeksForgeeks;

import java.util.Arrays;

public class _5_FindAnagramOrNot {

	public static void main(String[] args) {
		   isAnagram("keep","peek"); //s1 // s2
		   isAnagram("Mother In Law", "Hitler Woman");  
		
	}

	private static void isAnagram(String str1, String str2) {
		// 2. Remove all space.
		String s1 = str1.replaceAll("\\s", "");
		String s2 = str2.replaceAll("\\s", "");
		
		
		boolean status = true;
		
		// 3. length of the two string 
		if(s1.length() != s2.length()) {
			status = false;
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
			
			Arrays.parallelSort(ArrayS1);
			Arrays.parallelSort(ArrayS2);
			//status = Arrays.equals(ArrayS1, ArrayS2);
			if(Arrays.equals(ArrayS1,ArrayS2)) {
				status = true;
			}else {
				status = false;
			}
			
		}
		if(status == true) {
			System.out.println(s1 + " and " + s2 + " are anagrams");  
		}else {
			System.out.println(s1 + " and " + s2 + " are not anagrams");  
		}
		
		
		
	}

}
