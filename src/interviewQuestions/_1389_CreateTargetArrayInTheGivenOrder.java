package interviewQuestions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class _1389_CreateTargetArrayInTheGivenOrder {

	public static void main(String[] args) {
		int[] nums = { 5, 3, 8, 9, 7 };
		int[] index = { 0, 1, 2, 2, 1 };
		int[] rs = createTargetArray(nums, index);
		System.out.println(Arrays.toString(rs));
	}

	public static int[] createTargetArray(int[] nums, int[] index) {
		List<Integer> x = new ArrayList<>();
		for (int i = 0; i < nums.length; i++) {
			x.add(index[i], nums[i]);
		}

		for (int i = 0; i < nums.length; i++) {
			nums[i] = x.get(i);
			System.out.println(i + " ------" + x.get(i));
		}
		return nums;
	}

}
