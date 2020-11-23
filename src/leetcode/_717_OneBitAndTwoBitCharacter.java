package leetcode;

public class _717_OneBitAndTwoBitCharacter {

	public static void main(String[] args) {
		int nums[] = { 0, 1, 0 };
		System.out.println(oneBit(nums));

	}

	private static boolean oneBit(int[] nums) {

		boolean isOneBit = false;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == 0) {
				isOneBit = true;
			} else {
				isOneBit = false;
				i++;
			}
		}

		return isOneBit;
	}

}
