package dataStructureAndAlgorithm._1_array.searching._17_TwoPointersTechnique;

/*

Two Pointers Technique

Last Updated: 16-10-2020

Two pointers is really an easy and effective technique which is typically used for searching pairs in a sorted array.

Given a sorted array A (sorted in ascending order), having N integers,

find if there exists any pair of elements (A[i], A[j]) such that their sum is equal to X.

Let’s see the naive solution.

*/
public class Main {
	public static void main(String[] args) {
		int arr[] = { 2, 3, 4, 5, 6, 7, 8 };
		System.out.println(pariSum(arr, 138));

	}

	private static boolean pariSum(int[] arr, int i) {

		int left = 0;
		int right = arr.length - 1;
		while (left < right) {
			if (arr[left] + arr[right] > i) {
				right--;
			} else if (arr[left] + arr[right] < i) {
				left++;
			} else {
				return true;
			}
		}
		return false;
	}
}
