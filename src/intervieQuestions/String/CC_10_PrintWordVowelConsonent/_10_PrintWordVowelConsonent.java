/*
 * 
 * 

Program to find the frequency of characters
Explanation
In this program, we need to find the frequency of each character present in the word.

Picture perfect  
To accomplish this task, we will maintain an array called freq with same size of the length of the string. Freq will be used to maintain the count of each character present in the string. Now, iterate through the string to compare each character with rest of the string. Increment the count of corresponding element in freq. Finally, iterate through freq to display the frequencies of characters.

For example: Frequency of p in above string is 2.

Algorithm
	Define a string.

	Define an array freq with the same size of the string.

	Two loops will be used to count the frequency of each character. Outer loop will be used to select a character and initialize element at corresponding index in array freq with 1.

	Inner loop will compare the selected character with rest of the characters present in the string.

	If a match found, increment element in freq by 1 and set the duplicates of selected character by '0' to mark them as visited.

	Finally, display the character and their corresponding frequencies by iterating through the array freq.
 */



package intervieQuestions.String.CC_10_PrintWordVowelConsonent;

// https://www.javatpoint.com/program-to-count-the-total-number-of-vowels-and-consonants

// https://www.javatpoint.com/program-to-find-the-frequency-of-characters

public class _10_PrintWordVowelConsonent {

	public static void main(String[] args) {
		//declare a string
		String string = "This is a really simple sentence";
		printVowelAndConsonant(string);
		printFrequencyOfWord(string);
	}
		

	private static void printFrequencyOfWord(String str) {
		int[] freq = new int[str.length()];
		
		int i,j;
		
		// converts given string to char array
		
		char string[] = str.toCharArray();  
		
		
		for ( i = 0; i < str.length(); i++) {
			freq[i] = 1;
			for ( j = i+1; j < str.length(); j++) {
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
            if(string[i] != ' ' && string[i] != '0') {
            	 System.out.println(string[i] + "-" + freq[i]); 
            }
                
        
		}
		
		
	}


	private static void printVowelAndConsonant(String string) {
		int vCount = 0,cCount = 0;
	
		// convert entire string to lower case to recuce the comparisons
		string = string.toLowerCase();
		
		for (int i = 0; i < string.length(); i++) {
			//checks whether vowels or not
			if(string.charAt(i)=='a'||
					string.charAt(i)=='e'||
					string.charAt(i)=='i'||
					string.charAt(i)=='o'||
					string.charAt(i)=='u'){
						//increment vowel counter
						vCount++;
					}
			// checks whether consonant
			else if (string.charAt(i)>='a' && string.charAt(i) <='z') {
				cCount++;
			}
		}
		
		System.out.println("Number of vowels: " + vCount);  
        System.out.println("Number of consonants: " + cCount);  

	}
		
}

