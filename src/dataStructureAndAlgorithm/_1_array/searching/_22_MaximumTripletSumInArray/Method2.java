package dataStructureAndAlgorithm._1_array.searching._22_MaximumTripletSumInArray;

/*
Time complexity : O(nlogn)
Space complexity : O(1)
*/
import java.util.Arrays;

public class Method2 {

	public static void main(String[] args) {
		int arr[] = { 1, 0, 8, 6, 4, 2 };
		int n = arr.length;
		System.out.println(maxTripletSum(arr, n));

	}

	private static int maxTripletSum(int[] arr, int n) {
		Arrays.parallelSort(arr);

		return arr[n - 1] + arr[n - 2] + arr[n - 3];
	}

}
