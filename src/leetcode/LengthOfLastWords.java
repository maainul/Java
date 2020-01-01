package leetcode;

public class LengthOfLastWords {

	public static void main(String[] args) {
	
		String string = "Mainul Hasan Hello world";
		String wordsplitString[] = string.split("\\s");

		// First find the number of word...
		// second, print the length
		// Mainul---0
		// Hasan--1
		// Hello---2
		// world----3
		// word is 4.....
		// Find the number 4 word......which is word.....
		int length = wordsplitString.length;
		//System.out.println(length);
		String lastwordString= wordsplitString[length-1];
		System.out.println(lastwordString);
		// now find the length of the string by length method
		System.out.println(lastwordString.length());
		/*
		 * String testString = "This is a sentence";
		 * 
		 * String[] parts =testString.split(" ");
		 * 
		 * String lastWord = parts[parts.length - 1];
		 * 
		 * System.out.println(lastWord);
		 */
		
		
		
		// Leetcode solutions
	/*	class Solution {
		    public int lengthOfLastWord(String s) {
		    // if s = " ", s.isEmpty == false because there's a blank!  
		        if (s == null || s.length() == 0 || s.trim().isEmpty()) {
					return 0;
				}
		        String words[] = s.split("\\s");
		        int last = (words[words.length-1]).length();
		        return last;
		    }
		    
		}
		
*/
	}

}
