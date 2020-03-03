package leetcode;

public class _1_TwoSum {

	public static int[] twosumsolution(int nums[], int target) {
		int[] result = new int[2];
		for (int i = 0; i < nums.length; i++) {
			for (int j = i + 1; j < nums.length; j++) {
				if (nums[i] + nums[j] == target) {
					result[0] = i;
					result[1] = j;
				}
			}
		}
		return result;
	}

	public static void main(String args[]) {
		int[] nums = { 2, 5, 9, 11, 7, 13 };// declaration and instantiation
		int target = 13;
		int[] result = twosumsolution(nums, target);

		if (result.length == 2) {
			System.out.println(result[0] + "  " + result[1]);
		} else {
			System.out.println("No solution found...");
		}
		System.out.println();
	}

}
