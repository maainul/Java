/**
 * @Author Md. Mainul Hasan
 * 
 * 12:40:09 PM
 * 
 * Nov 4, 2020
 *
 */
package interviewQuestions.leetcode;

public class _1309_decrypt_string_from_alphabet_to_integer_mapping {

	public static void main(String[] args) {
		String s = "1223#";
		System.out.println(freqAlphabets(s));
		// char c = (char) 109;
		// System.out.println(c);
		// System.out.println('3' - '0' - 1);

	}

	public static String freqAlphabets(String s) {
		StringBuilder sb = new StringBuilder();
		int v = 0;
		int i = s.length() - 1;

		while (i >= 0) {
			if (s.charAt(i) == '#') {
				String string = s.substring(i - 2, i);
				// string to int convert
				// System.out.println(string);
				v = Integer.parseInt(string) - 1;
				// System.out.println(v);
				i = i - 2;
			} else {
				char c = s.charAt(i); // 2
				v = c - '0' - 1;

			}
			// get int value
			int val = 'a' + v; // 97 + 22
			// int to char //
			char c = (char) val; // 129 // w
			// System.out.println(c);
			sb.append(c);
			i--;
		}

		return sb.reverse().toString();

	}

}
