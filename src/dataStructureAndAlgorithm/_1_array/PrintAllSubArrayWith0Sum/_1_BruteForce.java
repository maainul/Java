package dataStructureAndAlgorithm._1_array.PrintAllSubArrayWith0Sum;

public class _1_BruteForce {

	public static void main(String[] args) {
		int[] A = { 3, 4, -7, 3, 1, 3, 1, -4, -2, -2 };
		printallSubarrays(A);
	}

	private static void printallSubarrays(int[] A) {
		// Function to print all sub-arrays with 0 sum present
		// in the given array

		// consider all sub-arrays starting from i
		for (int i = 0; i < A.length; i++) {
			int sum = 0;

			// consider all sub-arrays ending at j
			for (int j = i; j < A.length; j++) {
				// sum of elements so far
				sum += A[j];

				// if sum is seen before, we have found a subarray with 0 sum
				if (sum == 0) {
					System.out.println("Subarray [" + i + ".." + j + "]");
				}
			}
		}

	}
}
