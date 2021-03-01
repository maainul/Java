package interviewQuestions.leetcode;

import java.util.ArrayList;

public class _1539_KthMissingPositiveNumber {

	public static void main(String[] args) {
		int[] arr = { 2, 3, 4, 7, 11 };
		int k = 5;
		System.out.println(missingNumber(arr, k));

	}

	private static int missingNumber(int[] arr, int k) {

		int target = 0, start = 1, count = 0;

		ArrayList<Integer> al = new ArrayList<Integer>();
		for (int a : arr) {
			al.add(a);
		}

		while (count != k) {
			if (!al.contains(start)) {
				target = start;
				count++;
			}
			start++;
		}

		return target;
	}

}
