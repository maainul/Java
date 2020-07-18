package recursion.Problem26;

public class Problem26 {

	public static void main(String[] args) {
		int n = 5;
		revprint(n);

	}

	private static void revprint(int n) {
		System.out.print(n + " ");
		if (n == 0) {
			return;
		}
		revprint(n - 1);
	}
}
