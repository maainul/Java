package interviewQuestions;

public class _747_LargestNumberAtLeastTwiceOfOther {

	public static void main(String[] args) {
		int nums[] = { 3, 6, 1, 0 };
		System.out.println(dominantIndex(nums));

	}

	private static int dominantIndex(int[] nums) {

		int max = -1;
		int index = -1;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] > max) {
				max = nums[i];
				index = i;
			}
		}

		for (int i = 0; i < nums.length; i++) {
			if (nums[i] != max && (2 * nums[i]) > max)
				return -1;
		}
		return index;
	}

}
