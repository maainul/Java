package recursion.Problem19;

public class GCD {

	public static void main(String[] args) {
		System.out.println("Find the GCD\n\n");
		int n1 = 68;
		int n2 = 51;
		int gcd = 1;

		for (int i = 1; i <= n1 && i <= n2; i++) {
			if (n1 % i == 0 && n2 % i == 0)
				gcd = i;
		}
		System.out.printf("G.C.D of %d and %d is %d", n1, n2, gcd);

	}
}
