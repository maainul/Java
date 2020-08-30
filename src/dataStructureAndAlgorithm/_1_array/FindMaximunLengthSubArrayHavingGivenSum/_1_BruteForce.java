package dataStructureAndAlgorithm._1_array.FindMaximunLengthSubArrayHavingGivenSum;

/*
 
 For example consider below array
	A[] = {5,6,-5,5,3,5,3,-2,0
	Sum = 8
	
	Sub-arrays with sum 8 are
	
	{-5,5,3,5}
	{3,5}
	{5,3}
	
	The longest subarray is {-5.5.3.5}
 
 
 */
public class _1_BruteForce {

	public static void main(String[] args) {
		int[] A = { 5, 6, -5, 5, 3, 5, 3, -2, 0 };
		int sum = 8;

		maxLengthSubArray(A, sum);

	}

	private static void maxLengthSubArray(int[] a, int s) {
		int len = 0;
		int ending_index = -1;
		for (int i = 0; i < a.length; i++) {
			int sum = 0;
			for (int j = i; j < a.length; j++) {
				sum += a[i];

				if (sum == s) {
					if (len < j - i + 1) {
						len = j - i + 1;
						ending_index = j;
					}
				}
			}
		}

		System.out.println("[" + (ending_index - len + 1) + "," + ending_index + "]");

	}

}
