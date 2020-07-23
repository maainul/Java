package dataStructureAndAlgorithm._1_array._1_arrayRotations;

public class _6_PairInSortedRotate {

	public static void main(String[] args) {
		int[] arr = { 11, 15, 6, 8, 9, 10 };
		int n = arr.length;
		int sum = 19;

		if (ispairSorted(arr, n, sum))
			System.out.print("Array has two elements" + " with sum " + sum);
		else
			System.out.print("Array doesn't have two" + " elements with sum  " + sum);
	}

	private static boolean ispairSorted(int[] arr, int n, int x) {

		int pivot;
		int i;
		for (i = 0; i < arr.length - 1; i++) {
			if (arr[i] > arr[i + 1]) {
				break;
			}
		}

		int low = (i + 1) % n;
		// System.out.println(low);
		int hight = i;
		// System.out.println(hight);

		while (low != hight) {
			if (arr[low] + arr[hight] == x) {
				return true;
			}

			if (arr[low] + arr[hight] < x) {
				low = (low + 1) % n;
			} else {
				hight = (n + hight - 1) % n;
			}

		}

		return false;
	}

}
