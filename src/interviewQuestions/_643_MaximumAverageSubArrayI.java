package interviewQuestions;

// https://www.programmersought.com/article/2652236293/;jsessionid=118A0B307D7C418F60DA4AFAB7185138
/*
643. Maximum Average Subarray I

Given an array consisting of n integers, 
find the contiguous subarray of given length k that has the maximum average value. And you need to output the maximum average value.

Example 1:

Input: [1,12,-5,-6,50,3], k = 4
Output: 12.75
Explanation: Maximum average is (12-5-6+50)/4 = 51/4 = 12.75
*/
public class _643_MaximumAverageSubArrayI {

	public static void main(String[] args) {
		int nums[] = { 1, 12, -5, -6, 50, 3 };
		int k = 4;
		System.out.println(maximumsubArray(nums, k));
		System.out.println(findMaxAverage(nums, k));

	}

// Naive approach
	private static double maximumsubArray(int[] nums, int K) {
		double max = Integer.MIN_VALUE;
		double sum = 0;
		for (int i = 0; i < nums.length - K; i++) {
			for (int j = i; j < K + i; j++) {
				sum += nums[j];
			}
			if (max < sum) {
				max = sum;
			}
			sum = 0;
		}
		return max / K;
	}

	// fastest approach
	public static double findMaxAverage(int[] nums, int k) {
		int sum = 0;
		for (int i = 0; i < k; i++) {
			sum += nums[i];
		}
		int max = sum;

		for (int i = k; i < nums.length; i++) {
			sum += nums[i] - nums[i - k];
			if (sum > max) {
				max = sum;
			}
		}

		return (double) max / k;

	}

}
