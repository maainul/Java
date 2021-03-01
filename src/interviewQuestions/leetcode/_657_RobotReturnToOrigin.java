/**
 * @Author Md. Mainul Hasan
 * 
 * 11:02:23 AM
 * 
 * Oct 14, 2020
 *
 */
package interviewQuestions.leetcode;

public class _657_RobotReturnToOrigin {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String string = "UD";
		boolean result = returnToOrigin(string);
		System.out.println(result);
	}

	private static boolean returnToOrigin(String moves) {
		int y = 0, x = 0;
		for (int i = 0; i < moves.length(); i++) {
			if (moves.charAt(i) == 'R')
				y++;
			if (moves.charAt(i) == 'L')
				y--;
			if (moves.charAt(i) == 'U')
				x++;
			if (moves.charAt(i) == 'D')
				x--;
		}
		return x == 0 && (y == 0);
	}
}
