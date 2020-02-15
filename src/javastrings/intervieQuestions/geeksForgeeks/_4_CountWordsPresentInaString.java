package javastrings.intervieQuestions.geeksForgeeks;
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
public class _4_CountWordsPresentInaString {

	public static void main(String[] args) {
		///String  str = "please Save water Save geeksforgeeks is a computer science portal for geeks.";
		String str = "geeksforgeeks is a computer science portal for geeks";
		//String words[] = {"Save","water"};
		String words[] = { "welcome", "to", "geeks", "portal"};
		
		System.out.println("Counting number is :"+countOccurence(str,words));
		System.out.println("Counting number is :"+countOccurence2(str,words));

	}
	
	private static int countOccurence2(String str, String[] words) {
		int count = 0;
		String splitString[] = str.split(" ");
		for (String string : splitString) {
			for (int i = 0; i < words.length; i++) {
				if (words[i].equals(string)) {
					System.out.println(string);
					count++;
				}
			}
			
		}
		
		
		return count;
	}

	private static int countOccurence(String str, String words[]) {
		int count = 0;
		String[] wordStrings = str.split("\\s");
		for (int i = 0; i < wordStrings.length; i++) {
			// System.out.println(wordStrings[i]);
			for (int j = 0; j < words.length; j++) {
				if(words[j].equals(wordStrings[i])) {
					count++;
				}
			}
		}
		
		
		return count;
	}

}
