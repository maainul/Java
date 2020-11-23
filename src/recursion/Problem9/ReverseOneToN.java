/******************************************************************************
// Find the  reverse of integers from 1 through n.
index :4                                                                                                                    
index :3                                                                                                                    
index :2                                                                                                                    
index :1                                                                                                                    
index :0

*******************************************************************************/
package recursion.Problem9;

public class ReverseOneToN {
	public static void main(String[] args) {
		reverse(4);
		int n = 5;
		reversearray(n);
	}

	private static void reversearray(int n) {
		System.out.println(n);
		if (n == 0) {
			return;
		}
		reversearray(n - 1);

	}

	public static void reverse(int i) {
		System.out.println("index :" + i);
		if (i == 0) {
			return;
		} else {
			reverse(i - 1);
		}

	}

}
