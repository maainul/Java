package dataStructureAndAlgorithm._1_array.sorting._9_SortElementsByFrequency;

import java.util.Arrays;

/*
Print the elements of an array in the decreasing frequency if 2 numbers have same 

frequency then print the one which came first.

Examples:

Input:  arr[] = {2, 5, 2, 8, 5, 6, 8, 8}

Output: arr[] = {8, 8, 8, 2, 2, 5, 5, 6}

Input: arr[] = {2, 5, 2, 6, -1, 9999999, 5, 8, 8, 8}

Output: arr[] = {8, 8, 8, 2, 2, 5, 5, 6, -1, 9999999}

METHOD 1 (Use Sorting):

    Use a sorting algorithm to sort the elements O(nlogn)
    
    Scan the sorted array and construct a 2D array of element and count O(n).
    
    Sort the 2D array according to count O(nlogn).

Example:

  Input 2 5 2 8 5 6 8 8

  After sorting we get
  
  2 2 5 5 6 8 8 8

  Now construct the 2D array as
  
  2, 2
  5, 2
  6, 1
  8, 3

  Sort by count
  
  8, 3
  2, 2
  5, 2
  6, 1

How to maintain the order of elements if the frequency is the same?:

The above approach doesn’t make sure order of elements if the frequency is the same. 

To handle this, we should use indexes in step 3, 

if two counts are same then we should first process(or print) the element with a lower index. 

In step 1, we should store the indexes instead of elements.

  Input 5  2  2  8  5  6  8  8

  After sorting we get
  
  Element 2 2 5 5 6 8 8 8
  
  Index   1 2 0 4 5 3 6 7

  Now construct the 2D array as
  Index, Count
  
  1,      2
  0,      2
  5,      1
  3,      3

  Sort by count (consider indexes in case of tie)
  
  3, 3
  0, 2
  1, 2
  5, 1
  
Print the elements using indexes in the above 2D array.

Below is the implementation of above approach.

 */
public class Program1 {

	public static void main(String[] args) {
		int arr[] = { 2, 5, 2, 8, 5, 6, 8, 8 };
		int[] reslt = frequency(arr);
		System.out.println(Arrays.toString(reslt));

	}

	private static int[] frequency(int[] arr) {
		Arrays.sort(arr);
		return arr;

	}

}
