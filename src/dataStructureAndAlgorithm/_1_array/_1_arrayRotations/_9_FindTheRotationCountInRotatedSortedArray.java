package dataStructureAndAlgorithm._1_array._1_arrayRotations;
/*
Input : arr[] = {15, 18, 2, 3, 6, 12}
Output: 2
Explanation : Initial array must be {2, 3,
6, 12, 15, 18}. We get the given array after
rotating the initial array twice.

Input : arr[] = {7, 9, 11, 12, 5}
Output: 4

Input: arr[] = {7, 9, 11, 12, 15};
Output: 0
 */
public class _9_FindTheRotationCountInRotatedSortedArray {

	public static void main(String[] args) {
		int arr[] = {15, 18, 2, 3, 6, 12}; 
        int n = arr.length; 
      
		System.out.println(countRotations(arr, n));

	}

	private static int countRotations(int[] arr, int n) {
		int min = arr[0];
		int min_index = -1;
		for (int i = 0; i < arr.length; i++) {
			if (min > arr[i]) {
				min = arr[i];
				min_index = i;
			}
		}
		return min_index;

}
}
