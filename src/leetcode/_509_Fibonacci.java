package leetcode;

public class _509_Fibonacci {

	public static void main(String[] args) {
		// 1(1) 1(2) 2(3) 3(4) 5(5) 8(6) 13(7) 21(8)
		int n = 4;
		System.out.println(fib(n)); 
                for (int i = 1; i <= n; i++) {
			System.out.print(fib(i)+" ");
		}
		System.out.println(); 
		System.out.println(fib2(n)); 
	}
	
	public static int fib(int N) {
	    int a = 0, b =1; 
	    if (N < 2) return N; 
	    for (int i = 2; i <= N; i++) 
	    { 
	    	int c = a + b; 
	    	a = b; 
	    	b = c; 
	    } 
	    return b; 
	 } 
	
	public static int fib2(int N) {
		if(N == 0) return 0;
		int[] arr = new int[N+1];
		arr[0] = 0;
		arr[1] = 1;
		for(int i =2; i <=N; i++){
		    arr[i] = arr[i-1] + arr[i-2];
		}
		return arr[N];
    }
}


// 1(1) 1(2) 2(3) 3(4) 5(5) 8(6) 13(7) 21(8)
