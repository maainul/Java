/**
 * @Author Md. Mainul Hasan
 * 
 * 11:33:33 PM
 * 
 * Oct 13, 2020
 *
 */
package interviewQuestions.leetcode;

public class _541_ReverseString_2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String string = "abc";
		String string2 = reverseStr(string, 2);
		System.out.println(string2);
	}

	public static String reverseStr(String s, int k) {
		char[] a = s.toCharArray();
		for (int start = 0; start < a.length; start += 2 * k) {
			int i = start, j = Math.min(start + k - 1, a.length - 1);
			while (i < j) {
				char tmp = a[i];
				a[i++] = a[j];
				a[j--] = tmp;
			}
		}
		return String.valueOf(a);
	}

}
