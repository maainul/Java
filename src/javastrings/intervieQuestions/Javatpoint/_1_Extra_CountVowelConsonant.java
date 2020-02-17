package javastrings.intervieQuestions.Javatpoint;
// https://www.javatpoint.com/program-to-count-the-total-number-of-vowels-and-consonants
public class _1_Extra_CountVowelConsonant {

	public static void main(String[] args) {
		int vCount = 0,cCount = 0;
		
		//declare a string
		String string = "This is a really simple sentence";
		
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
