/*

977. Squares of a Sorted Array

Given an array of integers A sorted in non-decreasing order, 
return an array of the squares of each number, 
also in sorted non-decreasing order.
	
	Example 1:
	
		Input: [-4,-1,0,3,10]
		Output: [0,1,9,16,100]
	
	Example 2:
	
		Input: [-7,-3,2,3,11]
		Output: [4,9,9,49,121]
		
// leetcode solution		
		
class Solution {
    public int[] sortedSquares(int[] A) {
        for (int i = 0; i < A.length; i++) {
			A[i] = A[i] * A[i];
		}
        Arrays.sort(A);
        return A;
        
    }
    
}		
		
*/


package leetcode.array;

import java.util.Arrays;


class Solution{
	public static void squareofSortedArray(int A[]) {
		System.out.println("Original Arrays :"+Arrays.toString(A));
		// First convert each array elements 
        // into its square 
		for (int i = 0; i < A.length; i++) {
			A[i] = A[i] * A[i];
		}
		// Sort an array using "inbuild sort function" 
        // in Arrays class. 
		Arrays.parallelSort(A);
        System.out.println("Sorted Array : "+Arrays.toString(A));
    }
}




public class SquareOfSortedArray {

	public static void main(String[] args) {
		int A[] = {-7,-3,2,3,11};
		
		Solution.squareofSortedArray(A);
		
		
	}

}
