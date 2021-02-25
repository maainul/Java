package nov25;

public class _5_SquareRoot {

	public static void main(String[] args) {
		int x = 11;
		System.out.println(squareRoot(x));

	}

	private static int squareRoot(int x) {

		if (x == 0 || x == 1)
			return x;

		int result = 1;
		int i = 1;
		while (result <= x) {
			i++;
			result = i * i;
		}

		return i - 1;
	}

}
