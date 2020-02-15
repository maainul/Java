package javastrings.intervieQuestions.geeksForgeeks;

public class _5_CheckingIfFirstCharIsEqualToLastChar {

	public static void main(String[] args) {
		String s = "abcaa"; 
		System.out.print(s + " begins and ends with the same letter: " + checkString(s));
	}

	private static boolean checkString(String s) {
		// find lenth of word.
		int len = s.length();
		System.out.println(len);
		
		// make it upper case
		s = s.toUpperCase();
		System.out.println(s);
		
		// pickup first character
		char firstCharacter = s.charAt(0);
		
		//pick th last character
		char lastCharacter = s.charAt(len-1);
		
		return firstCharacter == lastCharacter;

	}

}
