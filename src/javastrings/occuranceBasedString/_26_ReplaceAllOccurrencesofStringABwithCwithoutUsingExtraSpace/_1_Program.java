/**
 * @Author Md. Mainul Hasan
 * 
 * 3:21:29 AM
 * 
 * Nov 21, 2020
 *
 */
package javastrings.occuranceBasedString._26_ReplaceAllOccurrencesofStringABwithCwithoutUsingExtraSpace;

public class _1_Program {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String st = "helloABworldABGfG";
		char str[] = st.toCharArray();
		translate(str);
		System.out.println("The modified string is :");
		System.out.println(str);

	}

	private static void translate(char[] str) {

		for (int i = 1; i < str.length; i++) {
			if (str[i - 1] == 'A' && str[i] == 'B') {
				str[i - 1] = 'C';
				int j;
				for (j = i; j < str.length - 1; j++) {
					str[j] = str[j + 1];
				}

				str[j] = ' ';
			}

		}
		return;
	}

}
