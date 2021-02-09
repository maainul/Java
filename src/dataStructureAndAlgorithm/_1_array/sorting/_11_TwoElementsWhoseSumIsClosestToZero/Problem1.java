package dataStructureAndAlgorithm._1_array.sorting._11_TwoElementsWhoseSumIsClosestToZero;

/*
Question: An Array of integers is given, both +ve and -ve. 

You need to find the two elements such that their sum is closest to zero.

For the below array, program should print -80 and 85.
 */
public class Problem1 {

	public static void main(String[] args) {
		int arr[] = { 1, 60, -10, 70, -80, 85 };
		minAbsSumPair(arr, 6);

	}

	private static void minAbsSumPair(int[] arr, int i) {
		if (arr.length < 2) {
			System.out.println("Invalid input");
			return;
		}
		int arr_size = arr.length;
		int min_l, min_r;
		int sum = 0;
		/* Initialization of values */
		min_l = 0;
		min_r = 1;

		int min_sum = arr[0] + arr[1];

		for (int l = 0; l < arr_size - 1; l++) {
			for (int r = l + 1; r < arr_size; r++) {
				sum = arr[l] + arr[r];
				if (Math.abs(min_sum) > Math.abs(sum)) {
					min_sum = sum;
					min_l = l;
					min_r = r;
				}
			}
		}

		System.out.println(" The two elements whose " + "sum is minimum are " + arr[min_l] + " and " + arr[min_r]);
	}
}
