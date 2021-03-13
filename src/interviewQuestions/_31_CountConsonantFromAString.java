
package interviewQuestions;

public class _31_CountConsonantFromAString {

	public static void main(String[] args) {
		String str = "abc de";
		System.out.println(consonant(str));
	}

	private static int consonant(String str) {
		int count = 0;

		for (int i = 0; i < str.length(); i++) {
			if (isConsonant(str.charAt(i))) {
				++count;
			}
		}
		return count;

	}

	private static boolean isConsonant(char ch) {
		ch = Character.toUpperCase(ch);
		return !(ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') && (ch >= 65 && ch <= 90);
	}

}
