/*
  Count substrings with same first and last characters
  We are given a string S, we need to find count of all contiguous substrings starting and ending with same character.
	
	Examples :
	
	Input  : S = "abcab"
	Output : 7
	There are 15 substrings of "abcab"
	a, ab, abc, abca, abcab, b, bc, bca
	bcab, c, ca, cab, a, ab, b
	Out of the above substrings, there 
	are 7 substrings : a, abca, b, bcab, 
	c, a and b.
	
	Input  : S = "aba"
	Output : 4
	The substrings are a, b, a and aba
Method 1 (Simple): In this approach we use brute force and find all the s
ub-strings and pass them through our 
function checkEquality to see if starting and ending characters are same.

Method 2 (Space Efficient): In this approach we don’t actually generate 
substrings rather we traverse the string 
in such a manner so that we can easily 
compare first and last characters.


 */

package javastrings.intervieQuestions.geeksForgeeks;

public class _6_CountSubstringsWithSameFirstAndLastCharacters {
	// Space efficient Java program to count all 
	// substrings with same first and last characters. 
	public static void main(String[] args) {
		 String s = "abcab"; 
	     System.out.println(countSubstringWithEqualEnds2(s)); 
	     
	     System.out.println(countSubstringWithEqualEnds1(s)); 
	       
	}

	 static int countSubstringWithEqualEnds1(String s) 
	    { 
	        int result = 0; 
	        int n = s.length(); 
	       
	        // Starting point of substring 
	        for (int i = 0; i < n; i++) 
	       
	           // Length of substring 
	           for (int j = 1; j <= n-i; j++) 
	       
	              // Check if current substring has same 
	              // starting and ending characters. 
	              if (checkEquality(s.substring(i, i + j))) 
	                result++; 
	       
	        return result; 
	    } 
	       
	private static boolean checkEquality(String s) {
		 return (s.charAt(0) == s.charAt(s.length() - 1)); 
		
	}

	private static int countSubstringWithEqualEnds2(String s) {
		  int result = 0; 
	      int n = s.length(); 
	       
	        // Iterating through all substrings in 
	        // way so that we can find first and last 
	        // character easily 
	        for (int i = 0; i < n; i++) 
	            for (int j = i; j < n; j++) 
	                if (s.charAt(i) == s.charAt(j)) 
	                    result++; 
	       
	        return result;
	}
	
	
}
