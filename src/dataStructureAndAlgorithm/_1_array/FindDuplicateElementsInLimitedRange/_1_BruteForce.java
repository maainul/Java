package dataStructureAndAlgorithm._1_array.FindDuplicateElementsInLimitedRange;

public class _1_BruteForce {

	public static void main(String[] args) {
		// input array contains n numbers between [1 to n - 1]
		// with one duplicate, where n = A.length
		int[] A = { 1, 2, 3, 4, 4 };

		System.out.println("Duplicate element is " + findDuplicate(A));

	}

	private static int findDuplicate(int[] a) {

		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] == a[j]) {
					return a[i];
				}
			}
		}

		return -1;
	}

}
