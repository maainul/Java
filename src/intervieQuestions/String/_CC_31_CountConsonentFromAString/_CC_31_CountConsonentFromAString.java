
package intervieQuestions.String._CC_31_CountConsonentFromAString;


public class _CC_31_CountConsonentFromAString {

	public static void main(String[] args) {
		String str = "abc de";
		System.out.println(consonent(str));
	}

	private static int consonent(String str) {
		int count = 0;

		for (int i = 0; i < str.length(); i++) {
			if (isConsonent(str.charAt(i))) {
				++count;
			}
		}
		return count;

	}

	private static boolean isConsonent(char ch) {
		ch = Character.toUpperCase(ch);
		return !(ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') && (ch >= 65 && ch <= 90);
	}

}
