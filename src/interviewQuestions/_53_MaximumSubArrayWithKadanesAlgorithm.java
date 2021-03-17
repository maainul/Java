package interviewQuestions;

/**********************************************************************************
  53. Maximum Subarray

	Given an integer array nums, 
	find the contiguous subarray (containing at least one number) which has the largest sum and return its sum.

	Example:
	
	Input: [-2,1,-3,4,-1,2,1,-5,4],
	Output: 6
	Explanation: [4,-1,2,1] has the largest sum = 6.
	
*************************************************************************************/
import java.util.Scanner;

public class _53_MaximumSubArrayWithKadanesAlgorithm {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter number of elements in array");
		int N = scan.nextInt();
		int[] arr = new int[N];
		/* Accept N elements */
		System.out.println("Enter " + N + " elements");
		for (int i = 0; i < N; i++)
			arr[i] = scan.nextInt();
		System.out.println("Max sub array sum  = " + max_sum(arr));
		scan.close();

	}

	public static int max_sum(int[] nums) {
		int msf = Integer.MIN_VALUE; // msf = max so far
		int meh = 0; // meh = maximum ending here
		for (int num : nums) {
			meh = meh + num;
			if (meh < num)
				meh = num;
			if (msf < meh)
				msf = meh;
		}
		return msf;
	}

}
