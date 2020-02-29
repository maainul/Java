/**************************************************************************
 * 7. Reverse Integer (Easy)

Given a 32-bit signed integer, reverse digits of an integer.

Example 1:

Input: 123
Output: 321
Example 2:

Input: -123
Output: -321
Example 3:

Input: 120
Output: 21
Note:
Assume we are dealing with an environment which could only store integers within the 32-bit signed integer range: [−231,  231 − 1]. For the purpose of this problem, assume that your function returns 0 when the reversed integer overflows.
 ***************************************************************************/
package leetcode.Math;

public class _7_ReverseInteger {

	public static void main(String args[]) {
		int x = 4236469;
		
		System.out.println("Input : " + x + " Output : " + reverse(x));
	}



	public static int reverse(int x) {
        long rev = 0;
        while (x!= 0){
            rev = (rev*10)+(x%10);
            x = x/10;
        }
  
        return (rev >= Integer.MAX_VALUE || rev <=Integer.MIN_VALUE) ? 0 : (int)rev;
    	}
}
