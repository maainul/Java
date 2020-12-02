package dataStructureAndAlgorithm.hackerRank;

// Java program to find LCM of two numbers.
class Test
{
	// Recursive method to return gcd of a and b
	static int gcd(int a, int b)
	{
		if (b == 0){
			return a;
		}
		if (a > b){
			return gcd(a, b % a );
		}
		return gcd(b, a %b );
	}
	
	// method to return LCM of two numbers
	static int lcm(int a, int b)
	{
		return (a / gcd(a, b)) * b;
	}
	
	// Driver method
	public static void main(String[] args) 
	{
		int a = 20, b = 5;
		System.out.println("LCM of " + a +
						" and " + b + 
					" is " + lcm(a, b));
	}
}
