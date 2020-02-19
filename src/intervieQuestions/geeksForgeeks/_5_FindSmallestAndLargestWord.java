/*
 * Program to find Smallest and Largest Word in a String
 
 * Algorithm
	1. Define a string.
	2. Split the string..
	3. Iterate through array words, check if the length of word is less than small. If yes, store that word in small.
	4. If the length of word is greater than large. If yes, store that word in large.
	5. At the end, display the smallest and largest word.
 */

// https://www.javatpoint.com/program-to-find-the-largest-and-smallest-word-in-a-string
package intervieQuestions.geeksForgeeks;


public class _5_FindSmallestAndLargestWord  {  
    public static void main(String[] args){  
    	String small = "", large="";  
    	// 1 . define a string
        String string = "Hardships often prepare ordinary people for an extraordinary destiny";
        
        // 2. split words
        String stri[] = string.split(" ");
        
        //Initialize small and large with first word in the string  
        small = large = stri[0]; 
        // 3. iterate through the words
        for (int i = 1; i < stri.length; i++) {
        	
        	 //If length of small is greater than any stri present in the string  
            //Store value of word into small  
			if(small.length() > stri[i].length()) {
				small = stri[i];
			}
			
			//If length of large is less than any word present in the string  
            //Store value of word into large  
			if(large.length() <stri[i].length()) {
				large = stri[i];		
		}
      
     }
        // 5. display value
        System.out.println("Smallest word: " + small);  
        System.out.println("Largest word: " + large);  
        
    }  
}  