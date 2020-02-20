/*

Java program to find the duplicate characters in a string
In this program, we need to find the duplicate characters in the string.

Great responsibility

To find the duplicate character from the string, 
we count the occurrence of each character in the string. 
If count is greater than 1, it implies that a character has a duplicate entry in the string. 
In above example, the characters highlighted in green are duplicate characters.

ALGORITHM
	STEP 1: START
	STEP 2: DEFINE String string1 = "Great responsibility"
	STEP 3: DEFINE count
	STEP 4: CONVERT string1 into char string[].
	STEP 5: PRINT "Duplicate characters in a given string:"
	STEP 6: SET i = 0. REPEAT STEP 7 to STEP 11 UNTIL i
	STEP 7: SET count =1
	STEP 8: SET j = i+1. REPEAT STEP 8 to STEP 10 UNTIL j
	STEP 9: IF (string[i] == string[j] && string[i] != ' ')
	              then
	              count = count + 1
	              string[j]= 0
	STEP 10: j = j + 1
	STEP 11: i = i + 1
	STEP 12: IF(count>1 && string[i] != 0) then PRINT string[i]
	STEP 13: END
 */
package intervieQuestions.String;

public class _18_FindDupllicateCharacterFromAString {

	public static void main(String[] args) {
		String string1 = "This is mainul hasan";
		//string = string.toLowerCase();
		int count = 0;
		int i,j;
	
		 //Converts given string into character array    
	     char string[] = string1.toCharArray(); 
	        
		for (i = 0; i < string.length; i++) {
			count = 1;
			for (j = i+1; j < string.length; j++) {
			    if(string[i] == string[j] && string[i] != ' ') {    
					count++;
				
					string[j] = '0';
			    }
			}
		
      //A character is considered as duplicate if count is greater than 1    
        if(count > 1 && string[i] != '0') {
        	System.out.println(string[i]);
        }
		}
	}

}
