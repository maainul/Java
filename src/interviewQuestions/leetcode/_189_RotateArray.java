package interviewQuestions.leetcode;

public class _189_RotateArray {
	public static void main(String[] args) {

		int[] nums = new int[] { 1, 2, 3, 4, 5, 6, 7 };
		int k = 3;
		System.out.println("Original array: ");
		PrintArray(nums);

		rotate2(nums, k);

		System.out.println("\n\nArray after right rotation: ");
		PrintArray(nums);

		System.out.println("\n\nOriginal array: Method 2");
		PrintArray(nums);

		rotate(nums, k);

		System.out.println("\n\nArray after right rotation: ");
		PrintArray(nums);

	}

	public static void rotate(int[] nums, int k) {
		int temp, previous;
		for (int i = 0; i < k; i++) {
			previous = nums[nums.length - 1];
			for (int j = 0; j < nums.length; j++) {
				temp = nums[j];
				nums[j] = previous;
				previous = temp;
			}
		}
	}

	public static void rotate2(int[] nums, int k) {
		k = k % nums.length;
		reverse(nums, 0, nums.length - 1);
		reverse(nums, 0, k - 1);
		reverse(nums, k, nums.length - 1);
	}

	private static void reverse(int[] nums, int start, int end) {
		int temp;
		while (start < end) {
			temp = nums[start];
			nums[start] = nums[end];
			nums[end] = temp;
			start++;
			end--;
		}

	}

	private static void PrintArray(int[] nums) {
		for (int i = 0; i < nums.length; i++) {
			System.out.print(nums[i] + " ");
		}

	}
}