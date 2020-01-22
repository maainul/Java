//https://www.geeksforgeeks.org/prime-numbers/

package recursion.Problem17;
//A school method based Java program to 
//check if a number is prime 

import java.util.Scanner;

class PrimeNumber { 
	
	// function check whether a number 
	// is prime or not 
	static boolean isPrime(int n) 
	{ 
		// Corner case 
		if (n <= 1) 
			return false; 
	
		// Check from 2 to n-1 
		for (int i = 2; i < n; i++) 
			if (n % i == 0) 
				return false; 
	
		return true; 
	} 
	
	/* Driver program */
	public static void main(String[] args) 
	{ 
		System.out.println("Enter a number :");
		
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		s.close();
		
	    if (isPrime(n))  
	    	System.out.println("Yes Prime Number"); 
	    else 
	        System.out.println("Not Prime Number"); 
	} 
} 
	
//This code is contributed by Arnav Kr. Mandal	 
