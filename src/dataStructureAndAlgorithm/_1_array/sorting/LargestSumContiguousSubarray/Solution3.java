package dataStructureAndAlgorithm._1_array.sorting.LargestSumContiguousSubarray;

/*
Dynamic Programming
 */

public class Solution3 {

	public static void main(String[] args) {
		int[] a = { -2, -3, 4, -1, -2, 1, 5, -3 };
		System.out.println("Maximum contiguous sum is " + maxSubArraySum(a));
	}

	private static int maxSubArraySum(int[] a) {
		int cur_max = a[0];
		int maximum_so_far = a[0];
		for (int i = 0; i < a.length; i++) {
			cur_max = Math.max(a[i], cur_max + a[i]);
			maximum_so_far = Math.max(maximum_so_far, cur_max);
		}
		return maximum_so_far;
	}

}
