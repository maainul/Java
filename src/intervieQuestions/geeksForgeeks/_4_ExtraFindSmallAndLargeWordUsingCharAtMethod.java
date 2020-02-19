/*
 * Program to find Smallest and Largest Word in a String
 
 * Algorithm
	1. Define a string.
	2. Split the string..
	3. Iterate through array words, check if the length of word is less than small. If yes, store that word in small.
	4. If the length of word is greater than large. If yes, store that word in large.
	5. At the end, display the smallest and largest word.
 */

package intervieQuestions.geeksForgeeks;

public class _4_ExtraFindSmallAndLargeWordUsingCharAtMethod {

	public static void main(String[] args) {
		// 1 . define a string
		String string = "Hardships often prepare ordinary people for an extraordinary destiny";
		String[] splitStrings = new String[100] ;
		String splitString = ""; 
		int length = 0;
		// 2. split string 
		for (int i = 0; i < string.length(); i++) {
			if(string.charAt(i)==' ') {
				splitString = splitString + string.charAt(i);
				System.out.println(splitString);
			}else{  
                //Add word to array words  
                splitStrings[length] = splitString;  
                //Increment length  
                length++;  
                //Make word an empty string  
                splitString = "";  
            }
			
			
		}
		
		System.out.println("IN COMPLETE");
		 
		 
	}

}
