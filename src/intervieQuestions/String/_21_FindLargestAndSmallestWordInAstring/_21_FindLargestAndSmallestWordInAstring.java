/*

Java Program to find the largest and smallest word in a string.
In this program, we need to find the smallest and the largest word present in the string:

"Hardships often prepare ordinary people for an extraordinary destiny"

Consider above example in which 'an' is the smallest word and 'extraordinary' is the largest word. 
One of the approach to find smallest and largest word is to split string into words then, 
compare length of each word with variables small and large. 
If length of a word is less than length of small then, 
store that word in small. If length of a word is greater than length of large then, 
store that word in large.

ALGORITHM
	STEP 1: START
	STEP 2: DEFINE String string="Hardships often prepare ordinary people for an extraordinary destiny"
	STEP 3: DEFINE word = " ", small = " ", large = " ".
	STEP 4: Make object of String[] words.
	STEP 5: SET length =0
	STEP 6: string = string + " "
	STEP 7: SET i=0. REPEAT STEP 8 to 9 STEP UNTIL i
	STEP 8: IF(string.charAt(i) != ' ') then
	              word =word + string.charAt(i)
	              else
	              word[length]=word
	              length =length + 1
	              word = " "
	STEP 9: i=i+1
	STEP 10: small = large =words[0]
	STEP 11: SET k = 0. REPEAT STEP 12 to STEP 14 UNTIL k
	STEP 12: IF(small.length() > words[k].length())
	              then
	              small = words[k]
	STEP 13: IF(large.length() < words[k].length())
	              then
	              large = words[k]
	STEP 14: k = k + 1
	STEP 15: PRINT small
	STEP 16: PRINT large
	STEP 17: END
 */
package intervieQuestions.String._21_FindLargestAndSmallestWordInAstring;

public class _21_FindLargestAndSmallestWordInAstring {

	  public static void main(String[] args){     
	      String string = "Hardships often prepare ordinary people for an extraordinary destiny";    
	      String small = "", large="";      
	     
	      //split
		  String words[] = string.split(" ");
		  for (int i = 0; i < words.length; i++) {
			  System.out.println(words[i]);
		   }
	      
	      //Initialize small and large with first word in the string    
	      small = large = words[0];    
	          
	      for (int i = 1; i < words.length; i++) {
			if(words[i].length() > words[i-1].length()) {
				small = words[i];
			}
			if(words[i].length() > words[i-1].length()) {
				large = words[i-1];
			}
			
		}
	     
	      System.out.println("Smallest word: " + small);    
	      System.out.println("Largest word: " + large);    
	  }    
}
