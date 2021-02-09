package leetcode;

public class _665_Non_DecreasingArray {

	public static void main(String[] args) {
		int nums[] = { 4, 6, 3, 2 };
		System.out.println(nonDecreasing(nums));

	}

	private static boolean nonDecreasing(int[] nums) {

		if (nums.length == 0 || nums == null)
			return false;
		if (nums.length == 1)
			return true;

		int count = 0;
		for (int i = 1; i < nums.length; i++) {
			if (nums[i] < nums[i - 1]) {
				count++;
				if (count > 1) {
					return false;
				}

				if (i - 2 < 0 || nums[i - 2] <= nums[i]) {
					nums[i - 1] = nums[i];
				} else {
					nums[i] = nums[i - 1];
				}
			}
		}

		return true;
	}

}
