package recursion.Problem27;

public class Problem27 {

	public static void main(String[] args) {
		int n = 5;
		printval(0, n);

	}

	private static void printval(int i, int n) {
		System.out.print(i + " ");
		if (i == n) {
			return;
		}
		printval(i + 1, n);
	}

}
