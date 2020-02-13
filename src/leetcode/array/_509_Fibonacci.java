package leetcode.array;

public class _509_Fibonacci {

	public static void main(String[] args) {
		// 1(1) 1(2) 2(3) 3(4) 5(5) 8(6) 13(7) 21(8)
		int n = 4;
		System.out.println(fib(n)); 
        for (int i = 1; i <= n; i++) {
			System.out.print(fib(i)+" ");
		}
	}
	
	public static int fib(int N) {
	    int a = 0, b = 1, c; 
	    if (N < 2) return N; 
	    for (int i = 2; i <= N; i++) 
	    { 
	    	c = a + b; 
	    	a = b; 
	    	b = c; 
	    } 
	    return b; 
	 } 
}


// 1(1) 1(2) 2(3) 3(4) 5(5) 8(6) 13(7) 21(8)
