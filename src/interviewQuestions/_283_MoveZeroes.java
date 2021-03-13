/**************************************************
283. Move Zeroes (Easy)

Given an array nums, write a function to move all 0's to the end 
of it while maintaining the relative order of the non-zero elements.

	Example:
	
	Input: [0,1,0,3,12]
	Output: [1,3,12,0,0]

Note:

You must do this in-place without making a copy of the array.
Minimize the total number of operations.

https://www.codevscolor.com/java-move-zeros-integer-array-start/
 
Algorithm :
1. The array is given. We will scan the elements from end to first. For example , for the array {1,0,2,0,3,0},we will scan one by one element as 0,3,0,2,0 and 1.
2. Create one variable to store the current index. At first, its value is the last index of the array.
3. Check for each element of the array while scanning, if it is not zero, add the value to the current index of the array.
4. After all values are completed, fill the remaining position of the array with 0.
5. Finally, print out the array.

********************************************************/

package interviewQuestions;

public class _283_MoveZeroes {
	public static void main(String[] args) {

		int[] nums = { 0, 1, 3, 0 };
		System.out.println("Original value");
		for (int i = 0; i < nums.length; i++) {
			System.out.print(nums[i] + " ");
		}
		System.out.println("\n\nAfter Moves Zeros");
		moveszero(nums);
		for (int i = 0; i < nums.length; i++) {
			System.out.print(nums[i] + " ");
		}

		System.out.println("\n\nBefore Moves Zeros");
		moveszeroBefore(nums);

		for (int i = 0; i < nums.length; i++) {
			System.out.print(nums[i] + " ");
		}

		System.out.println("\n\nBefore Moves Zeros temp value method");

		sortBasedOnZero(nums);
		for (int i = 0; i < nums.length; i++) {
			System.out.print(nums[i] + " ");
		}

	}

	private static void moveszero(int[] nums) {
		int index = 0;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] != 0) {
				nums[index++] = nums[i];
			}
		}

		for (int i = index; i < nums.length; i++) {
			nums[i] = 0;
		}

	}

	private static void moveszeroBefore(int[] nums) {
		int index = nums.length - 1;

		for (int i = nums.length - 1; i >= 0; i--) {
			if (nums[i] != 0) {
				nums[index--] = nums[i];
			}
		}

		/*
		 * while(index >= 0) { nums[index--] = 0; }
		 */
		for (int i = index; i >= 0; i--) {

			nums[index--] = 0;
		}
	}

	private static int[] sortBasedOnZero(int[] nums) {
		int k = 0;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == 0) {
				int temp = nums[i];
				nums[i] = nums[k];
				nums[k] = temp;
				k++;
			}
		}
		return nums;
	}

}
