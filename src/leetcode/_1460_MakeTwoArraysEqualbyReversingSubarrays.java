package leetcode;

import java.util.HashSet;

public class _1460_MakeTwoArraysEqualbyReversingSubarrays {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4 };
		int[] target = { 4, 1, 2, 3 };

		// int[] arr = { 1, 1, 1, 1 };
		// int[] target = { 1, 1, 1, 1 };

		System.out.println(findArray(arr, target));

		System.out.println(canBeEqual(arr, target));

	}

	public static boolean canBeEqual(int[] target, int[] arr) {
		int[] count1 = new int[1001];
		int[] count2 = new int[1001];
		for (int i = 0; i < target.length; i++) {

			System.out.println(i + " ===" + count1[target[i]]++);

			System.out.println(i + " ====" + count2[arr[i]]++);
		}
		for (int i = 0; i < 1001; i++) {
			if (count1[i] != count2[i])
				return false;
		}
		return true;
	}

	private static boolean findArray(int[] arr, int[] target) {

		if (target.length != arr.length) {
			return false;
		}

		HashSet<Integer> targetValues = new HashSet<>();
		for (int i = 0; i < target.length; i++) {
			targetValues.add(target[i]);
		}

		// Faster than hashset.equals
//        for(int i = 0; i < arr.length; i++) {
//            if(!targetValues.contains(arr[i])) {
//                return false;
//            }
//        }

		for (int i : arr) {
			if (!targetValues.contains(i)) {
				return false;
			}
		}

		HashSet<Integer> arrValues = new HashSet<>();
		for (int i = 0; i < arr.length; i++) {
			arrValues.add(arr[i]);
		}

		// Faster than hashset.equals
		for (int i = 0; i < target.length; i++) {
			if (!arrValues.contains(target[i])) {
				return false;
			}
		}

		return true;

	}

}
