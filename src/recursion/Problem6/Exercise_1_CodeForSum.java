/*
 * Sum of array elements using recursion
Given an array of integers, find sum of array elements using recursion.

Examples:

Input : A[] = {1, 2, 3}
Output : 6
1 + 2 + 3 = 6

Input : A[] = {15, 12, 13, 10}
Output : 50
 */
// https://www.geeksforgeeks.org/sum-array-elements-using-recursion/
package recursion.Problem6;

public class Exercise_1_CodeForSum {

	public static void main(String[] args) {
		int[] array = {2,4,6};
		int i = array.length;
		 System.out.println("Sum Iterative way :" +sumOfArrayIterativeWay(array));
		 
		 System.out.println("Sum recursive way :" +sumOfArrayRecursiveWay(array,i));

	}

	private static int sumOfArrayRecursiveWay(int[] A,int N) {
		if (N <= 0) 
            return 0; 
        return (sumOfArrayRecursiveWay(A, N - 1) + A[N - 1]); 
    
		
	}

	private static int sumOfArrayIterativeWay(int[] array) {
		int sum = 0;
		for (int i = 0; i < array.length; i++) {
			sum+=array[i];
		}
		
		return sum;
	}

}
