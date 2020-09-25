package leetcode;

import java.util.HashSet;
import java.util.Iterator;

public class _1539_KthMissingPositiveNumber {

	public static void main(String[] args) {
		int[] arr = { 2, 3, 4, 7, 11 };
		int k = 5;
		System.out.println(missingNumber(arr, k));

	}

	private static int missingNumber(int[] arr, int k) {

		int[] newArray = new int[arr.length];
		
		for (int i = 0; i < arr[arr.length - 1]; i++) {
			newArray[i] = i;
		}
	
		return 0;
	}

}
