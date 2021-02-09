package dataStructureAndAlgorithm._1_array.FindDuplicateElementsInLimitedRange;

import java.util.HashSet;
import java.util.Set;

public class _2_SetMethod {

	public static void main(String[] args) {
		// input array contains n numbers between [1 to n - 1]
		// with one duplicate, where n = A.length
		int[] A = { 1, 2, 3, 4, 4 };

		System.out.println("Duplicate element is " + findDuplicate(A));

	}

	private static int findDuplicate(int[] a) {
		Set<Integer> set = new HashSet<Integer>();

		for (int i : a) {
			if (set.contains(i)) {
				return i;
			}
			set.add(i);
		}
		System.out.println(set);

		return -1;
	}

}
