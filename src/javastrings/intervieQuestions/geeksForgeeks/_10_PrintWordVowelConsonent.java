package javastrings.intervieQuestions.geeksForgeeks;

public class _10_PrintWordVowelConsonent {

	public static void main(String[] args) {
		String string = "Allah is one Almighty";
		String splitString[] = string.split(" ");
		System.out.println("Length of words :"+(splitString.length));
		int vowel = 0;
		for (String word : splitString) {
			System.out.println(word);
			
			for (int i = 0; i < word.length(); i++) {
				   if(word.charAt(i) == 'A' || string.charAt(i) == 'a'
						   || word.charAt(i) == 'E' || word.charAt(i) == 'e'
						   || word.charAt(i) == 'I' || word.charAt(i) == 'i'
						   || word.charAt(i) == 'O' || word.charAt(i) == 'o'
						   || word.charAt(i) == 'U' || word.charAt(i) == 'u'){
					   		vowel++;
							
						}
				 
					}
			
			
			}
		String string2 = "this is owesome";
		isConsonant(string2);
		isVowel(string2);
		}

	private static void isConsonant(String string2) {
		int consonent = 0;
		for (int i = 0; i < string2.length(); i++) {
			char ch = string2.charAt(i);
			ch = Character.toUpperCase(ch);
			
			if(!(ch == 'A' || ch == 'E' || 
				ch == 'I' || ch == 'O' || 
				ch == 'U') && ch >= 65 && ch <= 90) {
				consonent++;
			}
			//System.out.println(ch);
		}
		System.out.println("Number of Consonent : "+consonent);
		
	}
	
	
	private static void isVowel(String string2) {
		int vowel = 0;
		for (int i = 0; i < string2.length(); i++) {
			char ch = string2.charAt(i);
			ch = Character.toUpperCase(ch);
			
			if((ch == 'A' || ch == 'E' || 
				ch == 'I' || ch == 'O' || 
				ch == 'U') && ch >= 65 && ch <= 90) {
				vowel++;
			}
			System.out.println(ch);
		}
		System.out.println("Number of Vowels :"+vowel);
		
	}
}



