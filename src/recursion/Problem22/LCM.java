package recursion.Problem22;

public class LCM {

	public static void main(String[] args) {
		System.out.println("LCM of Two Number\n");
		int n1 = 72;
		int n2 = 120;
		System.out.println(lcm(n1, n2));
	}

	private static int lcm(int a, int b) {
		return (a * b) / gcdByEuclidsAlgorithm(a, b);
	}

	private static int gcdByEuclidsAlgorithm(int n1, int n2) {
		if (n2 == 0) {
			return n1;
		}
		return gcdByEuclidsAlgorithm(n2, n1 % n2);
	}
}