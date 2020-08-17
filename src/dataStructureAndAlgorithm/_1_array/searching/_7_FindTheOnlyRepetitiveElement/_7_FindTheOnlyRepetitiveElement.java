package dataStructureAndAlgorithm._1_array.searching._7_FindTheOnlyRepetitiveElement;

public class _7_FindTheOnlyRepetitiveElement {

	public static void main(String[] args) {
		int[] arr = { 9, 8, 2, 6, 1, 8, 5, 3, 4, 7 };
		int n = arr.length;
		System.out.println(findRepeating(arr, n));
	}

	private static int findRepeating(int[] arr, int n) {
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		return sum - (((n - 1) * n) / 2);
	}
}
