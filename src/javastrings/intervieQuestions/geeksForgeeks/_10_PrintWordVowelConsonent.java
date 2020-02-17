package javastrings.intervieQuestions.geeksForgeeks;

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

