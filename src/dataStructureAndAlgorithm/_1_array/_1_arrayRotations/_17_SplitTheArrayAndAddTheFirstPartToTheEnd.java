package dataStructureAndAlgorithm._1_array._1_arrayRotations;

/*

Split the array and add the first part to the end

There is a given an array and split it from a specified position, 

and move the first part of array add to the end.

Split the array and add the first part to the end

Examples:

Input : arr[] = {12, 10, 5, 6, 52, 36}
            k = 2
Output : arr[] = {5, 6, 52, 36, 12, 10}
Explanation : Split from index 2 and first 
part {12, 10} add to the end .

Input : arr[] = {3, 1, 2}
           k = 1
Output : arr[] = {1, 2, 3}
Explanation : Split from index 1 and first
part add to the end.

 */

public class _17_SplitTheArrayAndAddTheFirstPartToTheEnd {
	public static void main(String[] args) {
		int[] arr = { 12, 10, 5, 6, 52, 36 };
		int n = arr.length;
		int position = 2;
		splitArray(arr, n, position);

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

	private static void splitArray(int[] arr, int n, int position) {
		for (int j = 0; j < position; j++) {
			int x = arr[0];
			for (int k = 0; k < arr.length - 1; k++) {
				arr[k] = arr[k + 1];
			}
			arr[n - 1] = x;
		}

	}

}
