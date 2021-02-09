package leetcode;

public class IntegerToRoman {
	public String inttoroman(int num) {
		int[] values = new int[] { 1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1 };
		String[] romanStrings = new String[] { "M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I" };

		StringBuilder sBuilder = new StringBuilder();

		for (int i = 0; i < values.length; i++) {
			while (num - values[i] >= 0) {
				sBuilder.append(romanStrings[i]);
				num = num - values[i];
			}
		}
		return sBuilder.toString();
	}

	// Driver method
	public static void main(String args[]) {
		IntegerToRoman ob = new IntegerToRoman();

		// Considering inputs given are valid
		int num = 124;
		System.out.println("Integer form of Roman Numeral : " + " is " + ob.inttoroman(num));
	}
}
