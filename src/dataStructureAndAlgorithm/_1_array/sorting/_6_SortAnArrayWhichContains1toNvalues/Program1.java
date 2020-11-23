package dataStructureAndAlgorithm._1_array.sorting._6_SortAnArrayWhichContains1toNvalues;

/*
Sort an array which contain 1 to n values

You have given an array which contain 1 to n element, 

your task is to sort this array in an efficient way and without replace with 1 to n numbers.

Examples :

Input : arr[] = {10, 7, 9, 2, 8, 3, 5, 4, 6, 1};
Output : 1 2 3 4 5 6 7 8 9 10
 */
public class Program1 {

	public static void main(String[] args) {
		int[] arr = { 10, 7, 9, 2, 8, 3, 5, 4, 6, 1 };
		int n = arr.length;

		// for sort an array
		sortit(arr, n);

		// for print all the
		// element in sorted way
		for (int i = 0; i < n; i++)
			System.out.print(arr[i] + " ");

	}

	private static void sortit(int[] arr, int n) {
		for (int i = 0; i < arr.length; i++) {
			arr[i] = i + 1;
		}

	}

}
