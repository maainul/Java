package leetcode;

public class BinaryToDecimal {

	public static void main(String[] args) {
		int num = 101;
		System.out.println(decimalConversion(num));

	}

	private static int decimalConversion(int num) {
		int decimal_number = 0;
		int base = 1;
		int temp = num;
		int last_digit = 0;

		while (temp > 0) {
			last_digit = temp % 10;
			temp = temp / 10;
			decimal_number += last_digit * base;
			base = base * 2;
		}

		return decimal_number;
	}

}
