package interviewQuestions.leetcode;

public class _1464_MaximumProductofTwoElementsinanArray {

	public static void main(String[] args) {
		int nums[] = { 3, 4, 5, 2 };
		int t = maxProduct(nums);
		System.out.println(t);

		int r = maxProduct2(nums);
		System.out.println(r);
	}

	public static int maxProduct(int[] nums) {
		int sum = 0;
		for (int i = 0; i < nums.length - 1; i++) {
			for (int j = i + 1; j < nums.length; j++) {
				int value = (nums[i] - 1) * (nums[j] - 1);
				sum = Math.max(sum, value);
			}
		}
		return sum;

	}

	public static int maxProduct2(int[] nums) {
		int num1 = Integer.MIN_VALUE;
		int num2 = Integer.MIN_VALUE;
		for (int num : nums) {
			if (num > num1) {
				num2 = num1;
				num1 = num;
			} else if (num > num2) {
				num2 = num;
			}
		}
		return (num1 - 1) * (num2 - 1);
	}

}
