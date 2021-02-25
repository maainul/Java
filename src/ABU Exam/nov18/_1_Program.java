/**
 * 
 */
package nov18;

/**
 * @author mainul Nov 18, 2020
 *
 */
public class _1_Program {

	private static boolean palindromeStringRecursion(String string, int left, int right) {

		while (left < right) {
			if (string.charAt(left) != string.charAt(right)) {
				return false;
			}

			return true;
		}

		return palindromeStringRecursion(string, left++, right--);

	}

	private static boolean palindromeString(String string) {

		int left = 0;
		int right = string.length() - 1;
		while (left < right) {
			if (string.charAt(left) != string.charAt(right)) {
				return false;
			}
			left++;
			right--;
		}

		return true;
	}

	public static void main(String[] args) {
		String string = "malayalam";
		boolean result1 = palindromeString(string);
		if (result1) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}

		String string2 = "max";
		int left = 0;
		int right = string2.length() - 1;
		boolean result2 = palindromeStringRecursion(string2, left, right);
		if (result2) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}

	}

}
