/******************************************************************************

Write a recursive program to print fibonacci series. 1st and 2nd fibonacci numbers are 1, 1.

Input:
6
Output:
1 1 2 3 5 8 

*******************************************************************************/
package recursion.Problem14;

public class Fibonacci
{
	public static void main(String[] args) {
	    int x = 1;
	    int y = 1;
	    int z;
	    System.out.print("1 1");
	    for (int i = 2; i < 6;i++) {
	        z = x +y;
	        System.out.print(" "+ z);
	        x = y;
	        y = z;
	    }
	}
}
