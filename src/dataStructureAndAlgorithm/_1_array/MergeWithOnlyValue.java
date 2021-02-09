package dataStructureAndAlgorithm._1_array;

import java.util.Arrays;

class MergeArray {
	public static void merge(int[] nums1, int[] nums2, int m, int n) {

		m = nums1.length;
		n = nums2.length;

		System.out.println(m);
		System.out.println(n);

		int[] result = new int[m + n];

		System.arraycopy(nums1, 0, result, 0, m);
		System.arraycopy(nums2, 0, result, m, n);

		System.out.println(Arrays.toString(result));

		Arrays.sort(result);
		System.out.println(Arrays.toString(result));
	}

}

public class MergeWithOnlyValue {
	public static void main(String[] args) {

		int nums1[] = { 2, 5, 7, 8 };
		int nums2[] = { 2, 4, 6 };

		int m = nums1.length;
		int n = nums2.length;

		MergeArray.merge(nums1, nums2, m, n);

	}

}
