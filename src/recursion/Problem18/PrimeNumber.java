//https://www.geeksforgeeks.org/prime-numbers/
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
