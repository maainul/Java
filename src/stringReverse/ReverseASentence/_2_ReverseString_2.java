/**
 * @Author Md. Mainul Hasan
 * 
 * 12:59:09 AM
 * 
 * Oct 14, 2020
 *
 */
package stringReverse.ReverseASentence;

public class _2_ReverseString_2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		_2_ReverseString_2 obj = new _2_ReverseString_2();
		obj.reverseWord("Welcome mainul Hasan");

	}

	private void reverseWord(String string) {
		String[] words = string.split(" ");
		String revString = "";
		for (int i = 0; i < words.length; i++) {
			String word = words[i];
			String revWord = "";
			for (int j = word.length() - 1; j >= 0; j--) {
				revWord += word.charAt(j);
			}
			revString += revWord + " ";
		}
		System.out.println(string);
		System.out.println(revString);

	}
/*
	private String rev(String st) {
		String[] string = s.trim().split("\\s+");
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < st.length; i++) {
			char[] ch = st[i].toCharArray();
			for (int j = ch.length - 1; j >= 0; j--) {
				sb.append(ch[j]);
			}

			if (i < st.length - 1) {
				sb.append(" ");
			}
		}
		return sb.toString();
	}
	*/
}
