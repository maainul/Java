package interviewQuestions;

public class _345_ReverseVowelOfString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String string = "Mainul";

		for (int i = 0; i < string.length(); i++) {
			System.out.print(string.charAt(i));
		}
		System.out.println();
		reverseVowel(string);
		System.out.println(reverseVowel(string));
	}

	private static String reverseVowel(String string) {
		char[] array = string.toCharArray();
		boolean isLeftVowel = false;
		boolean isRightVowel = false;

		int left = 0;
		int right = array.length - 1;
		char temp;

		while (left < right) {
			if (checkVowel(array[left])) {
				isLeftVowel = true;
			} else {
				left++;
			}

			if (checkVowel(array[right])) {
				isRightVowel = true;
			} else {
				right--;
			}

			if (isLeftVowel & isRightVowel) {
				temp = array[left];
				array[left] = array[right];
				array[right] = temp;
				isLeftVowel = false;
				isRightVowel = false;
				left++;
				right--;
			}
		}

		return String.valueOf(array);

	}

	public static boolean checkVowel(char value) {
		if (value != 'a' && value != 'e' && value != 'i' && value != 'o' && value != 'u' && value != 'A' && value != 'E'
				&& value != 'I' && value != 'O' && value != 'U') {
			return false;
		}
		return true;
	}

}
