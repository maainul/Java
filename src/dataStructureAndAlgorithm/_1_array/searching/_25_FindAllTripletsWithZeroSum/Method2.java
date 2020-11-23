package dataStructureAndAlgorithm._1_array.searching._25_FindAllTripletsWithZeroSum;

import java.util.Arrays;

public class Method2 {

	public static void main(String[] args) {
		int arr[] = { 0, -1, 2, -3, 1 };
		int n = arr.length;
		findTriplets(arr, n);

	}

	private static void findTriplets(int[] arr, int n) {
		boolean found = false;
		Arrays.sort(arr);

		for (int i = 0; i < arr.length; i++) {
			int l = i + 1;
			int r = n - 1;
			int x = arr[i];
			while (l < r) {
				if (x + arr[l] + arr[r] == 0) {
					// print elements if it's sum is zero
					System.out.print(x + " ");
					System.out.print(arr[l] + " ");
					System.out.println(arr[r] + " ");

					l++;
					r--;
					found = true;
				} else if (x + arr[l] + arr[r] < 0) {
					l++;
				} else {
					r--;
				}
			}
		}
		if (found == false)
			System.out.println(" No Triplet Found");
	}

}
