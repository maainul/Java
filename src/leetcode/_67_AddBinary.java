package leetcode;

public class _67_AddBinary {

	public static void main(String[] args) {
		String s1 = "1010";
		String s2 = "10110";
		System.out.println(addBinary(s1, s2));
	}

	public static String addBinary(String a, String b) {

		if (a.length() == 0 || a.equals(""))
			return b;
		if (b.length() == 0 || b.equals(""))
			return a;

		// Making the Strings equal in length
		if (b.length() != a.length()) {

			// Swapping to make a the bigger string in length, maintaining consistency
			if (b.length() > a.length()) {
				String temp = a;
				a = b;
				b = temp;
			}

			// Appending zeroes to the shorter number
			b = appendZeroes(b, a.length());
		}

		StringBuilder output = new StringBuilder();
		int carry = 0;
		int sum = 0;

		// Iterate begining at the end, since that is the LSD
		for (int i = a.length() - 1; i >= 0; i--) {

			int num1 = a.charAt(i) - 48;
			int num2 = b.charAt(i) - 48;
			int currentSum = num1 + num2 + carry;

			if (currentSum == 3) {
				carry = 1;
				sum = 1;
			} else if (currentSum == 2) {
				carry = 1;
				sum = 0;
			} else {
				carry = 0;
				sum = currentSum;
			}

			output.append(sum);
		}

		// The last condition when carry maybe zero
		if (carry != 0)
			output.append(carry);

		// I could prepend the answer of each addition but that would not be efficient,
		// would it?
		output = output.reverse();

		return output.toString();
	}

	/**
	 * A function basically to prepend zeroes to the shorter number
	 * 
	 **/
	public static String appendZeroes(String b, int length) {

		StringBuilder zeroes = new StringBuilder();
		for (int i = 0; i < length - b.length(); i++) {
			zeroes.append(0);
		}
		return zeroes.toString() + b;
	}
}
