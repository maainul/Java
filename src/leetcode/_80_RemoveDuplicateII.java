package leetcode;

/*
80. Remove Duplicates from Sorted Array II

Given a sorted array nums,

remove the duplicates in-place such that duplicates appeared at most twice and return the new length.

Do not allocate extra space for another array,
you must do this by modifying the input array in-place with O(1) extra memory.

Example 1:

Given nums = [1,1,1,2,2,3],

Your function should return length = 5,
with the first five elements of nums being 1, 1, 2, 2 and 3 respectively.

It doesn't matter what you leave beyond the returned length.
Example 2:

Given nums = [0,0,1,1,1,1,2,3,3],

Your function should return length = 7,
with the first seven elements of nums being modified to 0, 0, 1, 1, 2, 3 and 3 respectively.

It doesn't matter what values are set beyond the returned length.
Clarification:

Confused why the returned value is an integer but your answer is an array?

Note that the input array is passed in by reference,
which means modification to the input array will be known to the caller as well.

Internally you can think of this:

// nums is passed in by reference. (i.e., without making a copy)
int len = removeDuplicates(nums);

// any modification to nums in your function would be known by the caller.
// using the length returned by your function, it prints the first len elements.
for (int i = 0; i < len; i++) {
    print(nums[i]);
}
 */
// https://leetcode.com/problems/remove-duplicates-from-sorted-array-ii/discuss/906706/Java-Extension-of-remove-duplicates-from-sorted-array-1-oror-O(n)-time-and-O(1)-space
public class _80_RemoveDuplicateII {
	public static int removeDuplicates(int[] nums) {
		if (nums == null) {
			return 0;
		}

		if (nums.length <= 2) {
			return nums.length;
		}
		int i = 1; // point to previous
		int j = 2; // point to current

		while (j < nums.length) {
			if (nums[j] != nums[i] || nums[j] != nums[i - 1]) {
				i++;
				nums[i] = nums[j];
			}
			j++;
		}

		return i + 1;
	}

	public static int removeDuplicatess(int[] nums) {
		if (nums.length == 0 || nums == null) {
			return 0;
		}
		int count = 1;
		int index = 1;
		int cur = nums[0];

		for (int i = 1; i < nums.length; i++) {
			if (nums[i] == cur) {
				count++;
				if (count <= 2) {
					nums[index++] = nums[i];
				}
			} else {
				cur = nums[i];
				count = 1;
				nums[index++] = nums[i];
			}
		}
		return index;

	}

	public static void main(String[] args) {
		int[] nums = { 1, 1, 1, 1, 2, 2, 3 };
		System.out.println((removeDuplicates(nums)));

	}
}