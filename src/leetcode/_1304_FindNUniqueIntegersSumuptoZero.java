package leetcode;
/*
Given an integer n, return any array containing n unique integers such that they add up to 0.

 

Example 1:

Input: n = 5
Output: [-7,-1,1,3,4]
Explanation: These arrays also are accepted [-5,-1,1,2,3] , [-3,-1,2,-2,4].

Example 2:

Input: n = 3
Output: [-1,0,1]

Example 3:

Input: n = 1
Output: [0]

 

Constraints:

    1 <= n <= 1000

 */
import java.util.Arrays;

public class _1304_FindNUniqueIntegersSumuptoZero {

	public static void main(String[] args) {
		int[] result = unique(5);
		System.out.println(Arrays.toString(result));
	}

	private static int[] unique(int nums) {
		int left = 0;
		int right = nums - 1;
		int value = 1;
		int[] newArray = new int[nums];

		while (left < right) {
			newArray[left++] = value;
			newArray[right--] = -value;
			value++;
		}

		return newArray;
	}

}
