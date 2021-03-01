/**
 * @Author Md. Mainul Hasan
 * 
 * 4:11:02 AM
 * 
 * Oct 9, 2020
 *
 */
package interviewQuestions.leetcode;

public class _709ToLowerCase {

	public String toLowerCase(String str) {
		String res = "";
		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			int val = str.charAt(i);
			if (val >= 65 && val <= 90) {
				c = (char) (val + 32);
			}
			res += c;
		}
		return res;
	}

	public String toLowerCase2(String str) {
		StringBuilder res = new StringBuilder();
		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			int val = str.charAt(i);
			if (val >= 65 && val <= 90) {
				c = (char) (val + 32);
			}
			res.append(c);
		}
		return res.toString();
	}

	public static void main(String[] args) {
		_709ToLowerCase obj = new _709ToLowerCase();
		String str = "HELLO";
		String string = obj.toLowerCase(str);
		System.out.println(string);

	}

}
