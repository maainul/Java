/**********************************************************
1051. Height Checker (Easy)

Students are asked to stand in non-decreasing order of heights for an annual photo.

Return the minimum number of students that must move in order for all students to be standing in non-decreasing order of height.

 

Example 1:

Input: heights = [1,1,4,2,1,3]
Output: 3
 

Constraints:

1 <= heights.length <= 100
1 <= heights[i] <= 100

************************************************************/

package leetcode.array;

import java.util.Arrays;

public class _1051_HeightChecker {

	public static void main(String[] args) {

		System.out.println("1051. Height Checker (Easy)");

		// int[] heights = {1,1,4,2,1,3};
		int[] heights = { 1, 2, 3, 9, 1, 5, 4 };

		System.out.println("\nInput :");
		for (int i = 0; i < heights.length; i++) {
			System.out.print(heights[i] + " ");
		}

		System.out.println("\n\nOutput :");

		System.out.println(heightChecker(heights));
	}

	public static int heightChecker(int[] heights) {
		int[] snums = heights.clone();
		int count = 0;
		Arrays.parallelSort(snums);
		for (int i = 0; i < snums.length; i++) {
			if (snums[i] != heights[i]) {
				count++;
			}
		}
		return count;

	}

}
