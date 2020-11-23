package dataStructureAndAlgorithm._1_array.searching._15_CheckForMajorityElementInASortedArray;

public class Method1 {

	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 4, 4, 4, 4 };
		int n = arr.length;
		int x = 4;
		if (isMajority(arr, n, x) == true)
			System.out.println(x + " appears more than " + n / 2 + " times in arr[]");
		else
			System.out.println(x + " does not appear more than " + n / 2 + " times in arr[]");

	}

	private static boolean isMajority(int[] arr, int n, int x) {
		int count = 0;
		for (int i = 0; i < arr.length; i++) {

			if (arr[i] == x) {
				count++;
			}
		}
		if (count >= n / 2) {
			return true;
		}
		return false;
	}
}
