/**
 * @Author Md. Mainul Hasan
 * 
 * 8:44:32 PM
 * 
 * Oct 30, 2020
 *
 */
package leetcode;

public class _824_GoatLatin {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String string = "I speak Goat Latin";

		String str = toGoatLatin(string);
		System.out.println(str);

	}

	public static String toGoatLatin(String s) {

		String[] words = s.split(" ");
		String result = "";

		int k = 1;
		for (String word : words) {
			StringBuilder sb = new StringBuilder(word);

			if (!isVowel(word.charAt(0))) {
				char firstChar = sb.charAt(0);
				sb.deleteCharAt(0);
				sb.append(firstChar);
			}

			sb.append("ma");

			for (int i = 1; i <= k; i++)
				sb.append("a");

			k++;
			result = result + " " + sb.toString();
		}

		return result.trim();
	}

	private static boolean isVowel(char c) {
		return c == 'a' || c == 'A' || c == 'e' || c == 'E' || c == 'i' || c == 'I' || c == 'o' || c == 'O' || c == 'u'
				|| c == 'U';
	}

}
