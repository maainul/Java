/**
 * @Author Md. Mainul Hasan
 * 
 * 11:16:21 PM
 * 
 * Nov 21, 2020
 *
 */
package interviewQuestions._3_PutSpacesBetweenWordsStartingWithCapitalLetters;

public class _1_Program {


	public static void main(String[] args) {
		String str = "BruceWayneIsBatman";
		amendSentence(str);
	}

	private static void amendSentence(String str) {
		char[] ch = str.toCharArray();
		for (int i = 0; i < str.length(); i++) {
			if (ch[i] >= 'A' && ch[i] <= 'Z') {
				ch[i] = (char) (ch[i] + 32);
			}
		}
		System.out.println(ch);
	}

}
