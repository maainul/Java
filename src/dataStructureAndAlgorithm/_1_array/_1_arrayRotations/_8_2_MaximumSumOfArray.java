package dataStructureAndAlgorithm._1_array._1_arrayRotations;

/*
 next_val = curr_val - (cum_sum - arr[i-1]) + arr[i-1] * (n-1);

next_val = Value of ∑i*arr[i] after one rotation.
curr_val = Current value of ∑i*arr[i] 
cum_sum = Sum of all array elements, i.e., ∑arr[i].

Lets take example {1, 2, 3}. Current value is 1*0+2*1+3*2
= 8. Shifting it by one will make it {2, 3, 1} and next value
will be 8 - (6 - 1) + 1*2 = 5 which is same as 2*0 + 3*1 + 1*

 */
public class _8_2_MaximumSumOfArray {

	private static int maxSum(int[] arr, int n) {
		// Compute sum of all array elements
		int cum_sum = 0;
		for (int i = 0; i < n; i++)
			cum_sum += arr[i];

		// Compute sum of i*arr[i] for
		// initial configuration.
		int curr_val = 0;
		for (int i = 0; i < n; i++) {
			curr_val += i * arr[i];
		}
		// Initialize result
		int res = curr_val;

		// Compute values for other iterations
		for (int i = 1; i < n; i++) {
			// Compute next value using previous
			// value in O(1) time
			int next_val = curr_val - (cum_sum - arr[i - 1]) + arr[i - 1] * (n - 1);

			// Update current value
			curr_val = next_val;

			// Update result if required
			res = Math.max(res, next_val);
		}

		return res;
	}

	public static void main(String[] args) {
		int arr[] = { 8, 3, 1, 2 };
		int n = arr.length;
		System.out.println(maxSum(arr, n));

	}

}
