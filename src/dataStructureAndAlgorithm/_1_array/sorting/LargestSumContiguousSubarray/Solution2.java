package dataStructureAndAlgorithm._1_array.sorting.LargestSumContiguousSubarray;

/*
Kadane’s Algorithm:

Initialize:

    max_so_far = 0
    
    max_ending_here = 0

Loop for each element of the array
  
   max_ending_here = max_ending_here + a[i]; 
        if (max_ending_here < 0)  
            max_ending_here = 0;  
          
        Do not compare for all 
           elements. Compare only  
           when max_ending_here > 0 
        else if (max_so_far < max_ending_here)  
            max_so_far = max_ending_here;  

return max_so_far
 */

public class Solution2 {

	public static void main(String[] args) {
		int[] a = { -2, -3, 4, -1, -2, 1, 5, -3 };
		System.out.println("Maximum contiguous sum is " + maxSubArraySum(a));
	}

	private static int maxSubArraySum(int[] a) {
		int maximun_ending_here = 0;
		int maximum_so_far = Integer.MIN_VALUE;
		for (int i = 0; i < a.length; i++) {
			maximun_ending_here = maximun_ending_here + a[i];
			if (maximum_so_far < maximun_ending_here) {
				maximum_so_far = maximun_ending_here;
			} else if (maximun_ending_here < 0) {
				maximun_ending_here = 0;
			}
		}
		return maximum_so_far;
	}

}
