package javastrings.intervieQuestions.geeksForgeeks;

public class _8_CountVowelsFromAString {

	public static void main(String[] args) {
		// String string = "allah is One allah";
		 String string = "ALLAH Is One.Mohammad (Sallalahu alaihi wasallam) is Our Prophet.";
		 printVowelInerative(string);
	}

	private static void printVowelInerative(String string) {
		int vowel = 0;
		System.out.println(string);
		
		for (int i = 0; i < string.length(); i++) {
			   if(string.charAt(i) == 'A' || string.charAt(i) == 'a'
			   || string.charAt(i) == 'E' || string.charAt(i) == 'e'
			   || string.charAt(i) == 'I' || string.charAt(i) == 'i'
			   || string.charAt(i) == 'O' || string.charAt(i) == 'o'
			   || string.charAt(i) == 'U' || string.charAt(i) == 'u'){
				vowel++;
			}
		}
		
		
		System.out.println("Vowel :"+vowel);
		
		
		
	}
}
