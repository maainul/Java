/*

Java Program to find the frequency of characters
In this program, we need to find the frequency of each character present in the word.

Picture perfect

To accomplish this task, we will maintain an array called freq with same size of the length of the string. 
Freq will be used to maintain the count of each character present in the string. 
Now, iterate through the string to compare each character with rest of the string. 
Increment the count of corresponding element in freq. 
Finally, iterate through freq to display the frequencies of characters.

For example: Frequency of p in above string is 2.

ALGORITHM
	STEP 1: START
	STEP 2: DEFINE String str = "picture perfect"
	STEP 3: INITIALIZE freq[] having same size of str.
	STEP 4: DEFINE i, j
	STEP 5: CONVERT str into char string[].
	STEP 6: SET i=0. REPEAT STEP 7 to 11 STEP UNTIL i
	STEP 7: SET freq[i] =1
	STEP 8: SET j = i+1. REPEAT STEP 9 to STEP 10 UNTIL j
	STEP 9: IF (string[i] == string[j]) then
	              freq[i]++
	              string[j]= 0
	STEP 10: j = j + 1
	STEP 11: i = i + 1
	STEP 12: PRINT "Characters and their corresponding frequencies "
	STEP 13: SET i=0. REPEAT STEP 14 to STEP 15 UNTIL i
	STEP 14: IF(string[i] != ' ' && string[i] != '0')               then
	              PRINT string[i], freq[i]
	STEP 15: i=i+1
	STEP 16: END

 */
package intervieQuestions.String._15_FrequencyOfCharactersFromAString;

public class _15_FrequencyOfString {
 
	     public static void main(String[] args) {    
	        String str = "picture perfect";    
	        int[] freq = new int[str.length()];    
	        int i, j;    
	         
	        //Converts given string into character array    
	        char string[] = str.toCharArray();    
	            
	        for(i = 0; i <str.length(); i++) {    
	            freq[i] = 1;    
	            for(j = i+1; j <str.length(); j++) {    
	                if(string[i] == string[j]) {    
	                	
	                    freq[i]++;    
	                        
	                    //Set string[j] to 0 to avoid printing visited character    
	                   string[j] = '0';    
	                }    
	            }    
	        }    
	            
	        //Displays the each character and their corresponding frequency    
	        System.out.println("Characters and their corresponding frequencies");    
	        for(i = 0; i <freq.length; i++) {    
	            if(string[i] != ' ' && string[i] != '0')    
	                System.out.println(string[i] + "-" + freq[i]);    
	        }    		

	}

}
