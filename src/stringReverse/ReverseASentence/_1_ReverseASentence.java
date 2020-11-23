/**
 * @Author Md. Mainul Hasan
 * 
 * 12:50:18 AM
 * 
 * Oct 14, 2020
 *
 */
package stringReverse.ReverseASentence;

public class _1_ReverseASentence {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String string = "I love Bangladesh";
		String[] splitStrings = string.split(" ");
		String resultString = "";
		for (int i = splitStrings.length - 1; i >= 0; i--) {
			resultString += splitStrings[i] + " ";

		}
		System.out.println(resultString);

	}

}
