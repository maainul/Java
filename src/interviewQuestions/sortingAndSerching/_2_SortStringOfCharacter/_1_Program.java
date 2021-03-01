/**
 * @Author Md. Mainul Hasan
 * 
 * 11:49:36 PM
 * 
 * Nov 22, 2020
 *
 */
package interviewQuestions.sortingAndSerching._2_SortStringOfCharacter;

import java.util.Arrays;

public class _1_Program {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String string = "geeksforgeek";
		sortString(string);

	}

	private static void sortString(String string) {
		char[] ch = string.toCharArray();
		Arrays.sort(ch);
		System.out.println(String.valueOf(ch));

	}

}
