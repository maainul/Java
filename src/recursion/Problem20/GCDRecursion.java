package recursion.Problem20;

public class GCDRecursion {

	public static void main(String[] args) {
		System.out.println("GCD of Two Number\n");
		int n1 = 68;
		int n2 = 51;
		System.out.println(gcdByEuclidsAlgorithm(n1, n2));
	}

	static int gcdByEuclidsAlgorithm(int n1, int n2) {
		if (n2 == 0) {
			return n1;
		}
		return gcdByEuclidsAlgorithm(n2, n1 % n2);
	}
}