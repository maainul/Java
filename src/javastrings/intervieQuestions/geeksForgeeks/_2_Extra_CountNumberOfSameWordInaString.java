package javastrings.intervieQuestions.geeksForgeeks;
// https://www.tutorialspoint.com/java-program-to-count-occurrences-of-a-word-in-string
/*
 Count words present in a string
 Given an array of words and a string, we need to count all words that are present in given string.

	Examples:
	
	Input : words[] = { "welcome", "to", "geeks", "portal"}
	            str = "geeksforgeeks is a computer science portal for geeks."
	Output :  2
	
	Two words "portal" and "geeks" is present in str.
	
	
	Input : words[] = {"Save", "Water", "Save", "Yourself"}
	        str     = "Save"
	Output :1
	
 */
public class _2_Extra_CountNumberOfSameWordInaString {

	public static void main(String[] args) {
		String  str = "please Save water Save geeksforgeeks is a computer science portal for geeks.";
		String words = "Save";
		
		System.out.println(countOccurence(str,words));

	}

	private static int countOccurence(String str, String words) {
		int count = 0;
		
		String[] wordStrings = str.split("\\s");
		for (int i = 0; i < wordStrings.length; i++) {
			if(words.equals(wordStrings[i])) {
				count++;
			}
		}
		
		return count;
	}

}
