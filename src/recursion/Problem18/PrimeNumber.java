//https://www.geeksforgeeks.org/prime-numbers/
/*******************************************************
Some interesting fact about Prime numbers

	1.Two is the only even Prime number.
	2.Every prime number can represented in form of 6n+1 or 6n-1 except 2 and 3, where n is natural number.
	3.Two and Three are only two consecutive natural numbers which are prime too.
	
	4.Goldbach Conjecture: Every even integer greater than 2 can be expressed as the sum of two primes.
	
	Wilson Theorem : Wilson’s theorem states that a natural number p > 1 is a prime number if and only if
	    (p - 1) ! ≡  -1   mod p 
	OR  (p - 1) ! ≡  (p-1) mod p
	Fermat’s Little Theorem: If n is a prime number, then for every a, 1 <= a < n,
	an-1 ≡ 1 (mod n)
	 OR 
	an-1 % n = 1 
	
	Prime Number Theorem : The probability that a given, randomly chosen number n is prime is 
	inversely proportional to its number of digits, or to the logarithm of n.
	
	Lemoine’s Conjecture : Any odd integer greater than 5 can be expressed as a sum of 
	an odd prime (all primes other than 2 are odd) and an even semiprime. 
	A semiprime number is a product of two prime numbers. This is called Lemoine’s conjecture.
 
 ***********************************************************/





package recursion.Problem18;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		System.out.println("Enter a number :");
		
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		s.close();
	    if (isPrime(n, 2))  
	    	System.out.println("Yes Prime Number"); 
	    else 
	        System.out.println("Not Prime Number"); 
	}
	
	static boolean isPrime(int n, int i) 
    { 
        // Base cases 
        if (n <= 2) 
            return (n == 2) ? true : false; 
        if (n % i == 0) 
            return false; 
        if (i * i > n) 
            return true; 
       
        // Check for next divisor 
        return isPrime(n, i + 1); 
    } 
      

}
