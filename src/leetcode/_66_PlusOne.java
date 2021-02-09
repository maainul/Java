/***********************************************************
66. Plus One

Given a non-empty array of digits representing a non-negative integer, plus one to the integer.

The digits are stored such that the most significant digit is at the head of the list, 
and each element in the array contain a single digit.

You may assume the integer does not contain any leading zero, except the number 0 itself.

Example 1:

	Input: [1,2,3]
	Output: [1,2,4]
	Explanation: The array represents the integer 123.
Example 2:

	Input: [4,3,2,1]
	Output: [4,3,2,2]
	Explanation: The array represents the integer 4321.
  
 ************************************************************/

package leetcode;

import java.util.Arrays;

public class _66_PlusOne {

	public static void main(String[] args) {
		System.out.println("136. Plus One (Easy)");

		int[] digits = { 4, 9, 9, 9 };
		System.out.println("\n\nOriginal Array : " + Arrays.toString(digits));

		System.out.println("\n\nPlus One Array : " + Arrays.toString(solutions(digits)));
		// PrintArray(digits);
	}

	public static int[] solutions(int[] digits) {
		for (int i = digits.length - 1; i >= 0; i--) {
			if (digits[i] < 9) {
				digits[i]++;
				return digits;
			}
			digits[i] = 0; // carry handled by next iteration for loop
		}
		// didn't return yet so digits were all 9's
		int[] result = new int[digits.length + 1];
		result[0] = 1;
		return result;
	}

}
/**********************************
 * 
 * ALGORITHM: STEP 1: LOOP THROUGH LAST TO FIRST (INDEX NUMBER 2,1,1) (VALUE
 * (9,2,2)
 * 
 * STEP 2: IF FIRST NUMBER IS SMALLER THAN 9: INCREAMENT THE VALUE OF FIRST
 * ELEMENT RETURN VALEUE
 * 
 * BUT GREATER THEN 9 THEN: STORE 0 VALUE TO THIS INDEX NUMBER
 * 
 * STEP 3: INCREMENT THE LENGTH OF ARRAY (BECAUSE IF THE VALUE IS 99 THEN RESULT
 * WILL BE 100(SIZE OF ARRAY WILL INCREASE)
 * 
 * STEP 4: STORE 1 IN THE FIRST VALUE AND RETURN RESULT
 * 
 * 
 * 
 ************************************/
