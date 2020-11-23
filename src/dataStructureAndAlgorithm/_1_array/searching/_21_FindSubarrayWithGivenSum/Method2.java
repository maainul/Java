package dataStructureAndAlgorithm._1_array.searching._21_FindSubarrayWithGivenSum;

public class Method2 {
	private static void subArraySum(int[] arr, int n, int sum) {
		int cur_sum, i, start = 0;
		cur_sum = arr[0];
		for (i = 1; i < arr.length; i++) {

			if (cur_sum > sum && start < i - 1) {
				cur_sum = cur_sum - arr[start];
				start++;
			}

			if (cur_sum == sum) {
				int p = i - 1;
				System.out.println("Sum found between indexes " + start + " to " + p);

			}

			if (i < n) {
				cur_sum = cur_sum + arr[i];
			}
		}
	}
	public static void main(String[] args) {
		int arr[] = { 15, 2, 4, 8, 9, 5, 10, 23 };
		int n = arr.length;
		int sum = 23;
		subArraySum(arr, n, sum);
	}


}
