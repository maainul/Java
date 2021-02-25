package nov18;

import java.util.Arrays;

public class _5_Program {
	public static void main(String[] args) {
		String string1 = "Army";
		String string2 = "Mory";

		System.out.println(isAnagram(string1, string2));

	}

	private static boolean isAnagram(String string1, String string2) {

		int n1 = string1.length();
		int n2 = string2.length();

		if (n1 != n2) {
			return false;
		}

		String string1LowerCase = string1.toLowerCase();
		String string2LowerCase = string2.toLowerCase();

		char[] array1 = string1LowerCase.toCharArray();
		char[] array2 = string2LowerCase.toCharArray();

		Arrays.sort(array1);
		Arrays.sort(array2);

		return Arrays.equals(array1, array2);

	}

}
