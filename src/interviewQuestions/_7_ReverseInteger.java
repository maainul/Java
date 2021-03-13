package interviewQuestions;

public class _7_ReverseInteger {

	public static void main(String[] args) {
		int x = 4236469;
		System.out.println("Input : " + x + " Output : " + reverse(x));

	}

	public static int reverse(int x) {
		long rev = 0;
		while (x != 0) {
			rev = (rev * 10) + (x % 10);
			x = x / 10;
		}

		return (rev >= Integer.MAX_VALUE || rev <= Integer.MIN_VALUE) ? 0 : (int) rev;
	}
}
