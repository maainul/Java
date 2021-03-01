/**
 * @Author Md. Mainul Hasan
 * 
 * 10:38:02 AM
 * 
 * Oct 14, 2020
 *
 */
package interviewQuestions.leetcode;

public class _551_StudentAttendanceRecordI {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String string = "PPALLL";
		boolean res = countAtten(string);
		System.out.println(res);

	}

	private static boolean countAtten(String string) {
		int countA = 0;
		int countL = 0;
		char[] ch = string.toCharArray();
		for (int i = 0; i < string.length(); i++) {
			if (ch[i] == 'A') {
				countA++;
				countL = 0;
			} else if (ch[i] == 'L') {
				countL++;
			} else {
				countL = 0;
			}

			if (countA > 1 || countL > 2) {
				return false;
			}

		}
		return true;
	}

}
