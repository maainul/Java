/* 
 Input : str = �abc�
Output : 6
Proper substrings are �a�, �b�, �c�, �ab�, �bc�, �abc�

Input : str = �abcd�
Output : 10
Proper substrings are �a�, �b�, �c�, �d�, �ab�, �bc�, �cd�, �abc�, �bcd� and �abcd�
*/

package interviewQuestions.character_counting;

public class _7_NumberOfSubstringsOfaString {

	public static void main(String[] args) {
		String string = "abc";

		System.out.println(stringCount(string));

	}

	private static int stringCount(String string) {
		int n = string.length();
		return n * (n + 1) / 2;
	}
}
