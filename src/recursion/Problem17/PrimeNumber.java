// https://www.programiz.com/java-programming/examples/prime-number
package recursion.Problem17;

import java.util.Scanner;

class PrimeNumber {
	public static void main(String[] args) {
		System.out.println("Enter a number :");
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		s.close();
		primeNumber(n);
	}

	private static void primeNumber(int n) {
		boolean flage = false;
		for (int i = 2; i < n / 2; i++) {
			if (n % i == 0) {
				flage = true;
				break;
			}
		}
		if (flage) {
			System.out.println("Not a prime number");
		} else {
			System.out.println("Prime Number");
		}

	}
}

// Output
/*
Enter a number :
7
Prime Number
*/
