package interviewQuestions.leetcode;

import java.util.Arrays;

/*
169. Majority Element

Given an array of size n, find the majority element.
The majority element is the element that appears more than ⌊ n/2 ⌋ times.

You may assume that the array is non-empty and the majority element always exist in the array.

Example 1:

Input: [3,2,3]
Output: 3
Example 2:

Input: [2,2,1,1,1,2,2]
Output: 2
 */
public class _169_MajorityElement {
	public static void main(String[] args) {
		int nums[] = { 2, 2, 1, 1, 1, 1, 1, 2, 2 };

		System.out.println(majorityNums(nums));
	}

	private static int majorityNums(int[] arr) {
		int n = arr.length;
		boolean visited[] = new boolean[n];
		Arrays.fill(visited, false);

		for (int i = 0; i < n; i++) {
			if (visited[i] == true) {
				continue;
			}
			int count = 1;
			for (int j = i + 1; j < n; j++) {
				if (arr[i] == arr[j]) {
					count++;
					visited[j] = true;

				}
			}
			if (count > arr.length / 2) {
				return arr[i];
			}
		}

		return -1;

	}

}
