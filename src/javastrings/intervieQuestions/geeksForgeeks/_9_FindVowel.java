package javastrings.intervieQuestions.geeksForgeeks;
//Java program to count vowels in a string 

public class _9_FindVowel { 
		
	// Function to check the Vowel 
	static boolean isVowel(char ch) 
	{ 
		ch = Character.toUpperCase(ch); 
		return (ch=='A' || ch=='E' || ch=='I' || 
						ch=='O' || ch=='U'); 
	} 
	
	// Returns count of vowels in str 
	static int countVowels(String str) 
	{ 
		int count = 0; 
		for (int i = 0; i < str.length(); i++) 
			if (isVowel(str.charAt(i))) // Check for vowel 
				++count; 
		return count; 
	} 
	
	// Driver code 
	public static void main(String args[]) 
	{ 
		//string object 
		String str = "Allah is One Mohammad"; 
	
		// Total numbers of Vowel 
		System.out.println(countVowels(str)); 
	} 
} 
//This code is contributed by Sumit Ghosh 
