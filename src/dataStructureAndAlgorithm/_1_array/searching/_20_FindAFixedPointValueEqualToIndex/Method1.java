package dataStructureAndAlgorithm._1_array.searching._20_FindAFixedPointValueEqualToIndex;

public class Method1 {

	public static void main(String[] args) {
		int arr[] = { -10, -1, 0, 3, 10, 11, 30, 50, 100 };
		int n = arr.length;
		System.out.println("Fixed Point is " + linearSearch(arr, n));
	}

	private static int linearSearch(int[] arr, int n) {
		int i;
		for (i = 0; i < arr.length; i++) {
			if (arr[i] == i) {
				return i;
			}
		}
		return -1;
	}

}
