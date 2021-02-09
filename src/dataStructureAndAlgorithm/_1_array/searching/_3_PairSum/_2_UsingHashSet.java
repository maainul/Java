package dataStructureAndAlgorithm._1_array.searching._3_PairSum;

import java.util.HashSet;

public class _2_UsingHashSet {
	public static void main(String[] args) {
		int A[] = { 1, 4, 45, 6, 10, -8 };
		int sum = 55;
		HashSet set = new HashSet();

		for (int i = 0; i < A.length; i++) {
			int temp = sum - A[i];
			if (set.contains(temp)) {
				System.out.println(temp + " " + A[i]);
			}
			set.add(A[i]);
		}

		System.out.println(set);
	}
}
