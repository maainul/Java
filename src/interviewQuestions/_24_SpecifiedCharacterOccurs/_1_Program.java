/**
 * @Author Md. Mainul Hasan
 * 
 * 3:07:05 AM
 * 
 * Nov 21, 2020
 *
 */
package interviewQuestions._24_SpecifiedCharacterOccurs;

public class _1_Program {

	public static void main(String[] args) {
		String str = "geeks for geeks";
		String string = printString(str, 'e', 2);
		System.out.println(string);

	}

	private static String printString(String str, char c, int i) {

		String string = "";
		int count = 0;
		int j;
		for (j = 0; j < str.length(); j++) {
			if (str.charAt(i) == c) {
				count++;
			}
			if (count == i) {
				break;

			}
		}
		// condition 3
		if (i == 0) {
			return str;
			// condition 2
		} else if (count > i) {
			return string;
			// condition 1
		} else {
			for (int j2 = j + 1; j2 < str.length(); j2++) {
				string += str.charAt(j2);
			}
		}

		return string;
	}

}
