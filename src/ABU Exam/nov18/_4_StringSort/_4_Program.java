/**
 * 
 */
package nov18._4_StringSort;

/**
 * @author mainul Nov 19, 2020
 *
 */
public class _4_Program {

	public static void main(String[] args) {
		String string = "geeksforgeeks";
		String resultString = sortString(string);
		System.out.println(resultString);

	}

	private static String sortString(String string) {
		int[] freq = new int[26];

		char[] ch = string.toCharArray();

		char[] result = new char[26];

		for (int i = 0; i < string.length(); i++) {
			freq[ch[i] - 'a']++;
		}
		int index = 0;
		for (int i = 0; i < 26; i++) {
			for (int j = 0; j < freq[i]; j++) {
				result[index] = (char) (i + 'a');
				index++;
			}
		}

		return String.valueOf(result);
	}

}
