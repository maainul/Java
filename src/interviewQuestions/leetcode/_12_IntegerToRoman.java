package interviewQuestions.leetcode;

public class _12_IntegerToRoman {

	public static void main(String[] args) {
		int num = 14;
		String resultString = intToRoman(num);
		System.out.println(resultString);
	}

	private static String intToRoman(int num) {
		int[] values = new int[] { 1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1 };
		String[] romanStrings = new String[] { "M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I" };
		StringBuilder stringBuilder = new StringBuilder();

		for (int i = 0; i < values.length; i++) {
			while (num - values[i] >= 0) {
				stringBuilder.append(romanStrings[i]);
				num = num - values[i];

			}
		}
		return stringBuilder.toString();
	}

}
