/* 
 Number of substrings with count of each character as k
 Given a string and an integer k, 
 find number of substrings in which all the different characters occurs exactly k times.
	
	Examples:
	
	Input : s = "aabbcc"
	        k = 2 
	Output : 6
	
	The substrings are aa, bb, cc,
	aabb, bbcc and aabbcc.
	
	Input : s = "aabccc"
	        k = 2
	Output : 3
	
	There are three substrings aa, 
	cc and cc
*/


package javastrings.intervieQuestions.geeksForgeeks;

public class _5_NumberOfSubstringsWithCountEachCharacterk {
	
	public static void main(String[] args) {
		String string = "aabccc";
		int k = 2;
		stringCount(string,k);
		
	}

private static void stringCount(String string,int k) {
	int count = 0;
	
	for (int i = 0; i < string.length(); i++) {
		for (int j = i+1; j <= string.length(); j++) {
			String subStrings = string.substring(i,j);
			System.out.println(subStrings);
			if(subStrings.length() ==k) {
				count++;
			}
		}
	}
	System.out.println("Value of substrings :"+count);

	}
}