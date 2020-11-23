package dataStructureAndAlgorithm._1_array.searching._14_MajorityElement;

/*
Write a function which takes an array and prints the majority element (if it exists), 

otherwise prints “No Majority Element”. 

A majority element in an array A[] of size n is an element that appears more than n/2 times 

(and hence there is at most one such element).

Examples :

Input : {3, 3, 4, 2, 4, 4, 2, 4, 4}

Output : 4

Explanation: The frequency of 4 is 5 which is greater

than the half of the size of the array size. 

Input : {3, 3, 4, 2, 4, 4, 2, 4}

Output : No Majority Element

Explanation: There is no element whose frequency is

greater than the half of the size of the array size. 

 */
/*
METHOD 1

Approach: The basic solution is to have two loops and keep track of the maximum count for all different elements.
 
If maximum count becomes greater than n/2 then break the loops and return the element having maximum count. 

If the maximum count doesn’t become more than n/2 then majority element doesn’t exist.

Algorithm:

Create a variable to store the max count, count = 0

Traverse through the array from start to end.

For every element in the array run another loop to find the count of similar elements in the given array.

If the count is greater than the max count update the max count and store the index in another varaible.

If the maximum count is greater than the half the size of the array, print the element. 

Else print there is no majority element.

Implementation:
 */
public class _1_MajorityElement {

	private static void findMajority(int[] arr, int n) {
		int max_value = Integer.MIN_VALUE;
		int index = -1;
		for (int i = 0; i < arr.length; i++) {
			int count = 1;
			for (int j = i+1; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					count++;
				}
			}
			if (max_value < count) {
				max_value = count;
				index = i;
			}
		}
		if (max_value >= (n/2)) {
			System.out.println("Majority element : "+index);
		}else {
			System.out.println("No majority element");
		}
	}

	public static void main(String[] args) {
		int arr[] = { 1, 1, 2, 1, 3, 5, 1 };
		int n = arr.length;

		// Function calling
		findMajority(arr, n);

	}

}
