package leetcode;
/*
1013. Partition Array Into Three Parts With Equal Sum

Given an array A of integers, 
return true if and only if we can partition the array into three non-empty parts with equal sums.

Formally, we can partition the array if we can find indexes 
i+1 < j with (A[0] + A[1] + ... + A[i] == A[i+1] + A[i+2] + ... + A[j-1] == A[j] + A[j-1] + ... + A[A.length - 1])

 

Example 1:

Input: A = [0,2,1,-6,6,-7,9,1,2,0,1]
Output: true
Explanation: 0 + 2 + 1 = -6 + 6 - 7 + 9 + 1 = 2 + 0 + 1
Example 2:

Input: A = [0,2,1,-6,6,7,9,-1,2,0,1]
Output: false
Example 3:

Input: A = [3,3,6,5,-2,2,5,1,-9,4]
Output: true
Explanation: 3 + 3 = 6 = 5 - 2 + 2 + 5 + 1 - 9 + 4
 */
public class _1013_PartitionIntoThreeParts {

	public static void main(String[] args) {
		int[] A = {0,2,1,-6,6,7,9,-1,2,0,1};
		System.out.println(canThreePartsEqualSum(A));

	}
	  public static boolean canThreePartsEqualSum(int[] A) {
	        int sum = 0;
	        for(int i = 0; i < A.length; i++){
	            sum +=A[i];
	        }
	        if(sum % 3 != 0){
	            return false;
	        }
	        int x = sum /3;
	        int count = 0;
	        int curr_num = 0;
	        for(int i = 0; i < A.length; i++){
	            curr_num += A[i];
	            if(curr_num == x){
	                count++;
	                curr_num = 0;
	            }
	        }
	        return count >= 3;
	    }

}
