package dataStructureAndAlgorithm._1_array.searching._12_LeadersInAnArray;

public class LeadersInAnArray2 {

	/* Driver program to test above functions */
	public static void main(String[] args) {
		int arr[] = new int[] { 16, 17, 4, 3, 5, 2 };
		int n = arr.length;
		printLeaders(arr, n);
	}

	private static void printLeaders(int[] arr, int n) {
		int max_from_right = arr[n - 1];
		System.out.print(max_from_right + " ");

		for (int i = n - 2; i >= 0; i--) {
			if (max_from_right < arr[i]) {
				max_from_right = arr[i];
				System.out.print(max_from_right + " ");
			}
		}

	}
}
