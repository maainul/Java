package recursion.Problem21;

public class LCM {

	public static void main(String[] args) {
		System.out.println("Find the LCM\n\n");
		int n1 = 72;
		int n2 = 120;
		int gcd = 1;
	
		for (int i = 1; i <= n1 && i <=n2; i++) {
			if(n1 % i == 0 && n2 % i == 0)
				gcd = i;
		}
		int lcm = (n1* n2)/gcd;
		System.out.printf("G.C.D of %d and %d is %d", n1, n2, lcm);
		
	}
}
