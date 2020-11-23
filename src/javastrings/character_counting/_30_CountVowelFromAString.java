package javastrings.character_counting;

public class _30_CountVowelFromAString {

	public static void main(String[] args) {
		int count = 0;
		String str = "mainul hasan";
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o'
					|| str.charAt(i) == 'u') {
				count++;
			}
		}

		System.out.println(count);
		// second method
		System.out.println(vowelReturn(str));
		// recursive method
		
	}
 
	private static int vowelReturn(String str) {
		int count = 0;
		for (int i = 0; i < str.length(); i++) {
			if (isVowel(str.charAt(i))) {
				count++;
			}
		}
		return count;
	}

	private static boolean isVowel(char ch) {
		ch = Character.toUpperCase(ch);
		return (ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U');

	}
	

}
