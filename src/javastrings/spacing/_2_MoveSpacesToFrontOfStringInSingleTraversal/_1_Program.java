/**
 * @Author Md. Mainul Hasan
 * 
 * 11:01:09 PM
 * 
 * Nov 21, 2020
 *
 */
package javastrings.spacing._2_MoveSpacesToFrontOfStringInSingleTraversal;

public class _1_Program {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		char str[] = "Hey there, it's GeeksforGeeks".toCharArray();
		moveSpaceInFront(str);
		System.out.println(String.valueOf(str));

	}

	private static void moveSpaceInFront(char[] str) {

		int count = 0;
		int index = str.length - 1;
		for (int i = str.length - 1; i >= 0; i--) {
			if (str[i] != ' ') {
				str[index--] = str[i];
			} else {
				count++;
			}
		}

		for (int i = 0; i < count; i++) {
			str[i] = ' ';
		}

	}

}
