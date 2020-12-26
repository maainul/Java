package dataStructureAndAlgorithm._1_array.searching._19_FindTheTwoRepeatingElementsInAGivenArray;
/*
Find the two repeating elements in a given array

Last Updated: 14-10-2019

You are given an array of n+2 elements. All elements of the array are in range 1 to n.

And all elements occur once except two numbers which occur twice.

Find the two repeating numbers.

For example, array = {4, 2, 4, 5, 2, 3, 1} and n = 5

The above array has n + 2 = 7 elements with all elements occurring once

except 2 and 4 which occur twice. So the output should be 4 2.
 */
public class UseCountArray {

	public static void main(String[] args) {
		int arr[] = { 4, 2, 4, 5, 2, 3, 1 };
		int arr_size = arr.length;
		printRepeating(arr, arr_size);

	}

	private static void printRepeating(int[] arr, int arr_size) {
		int count[] = new int[arr_size];
		int i;
		for (i = 0; i < count.length; i++) {
			if (count[arr[i]] == 1) {
				System.out.println(count[arr[i]]);
				//System.out.println(arr[i]+ " ");
			}else {
				System.out.println(count[arr[i]]);
				count[arr[i]]++;
				
			}
		}
		
	}

}
