package dataStructureAndAlgorithm._1_array._1_arrayRotations;

import java.util.Arrays;
/*
Program to cyclically rotate an array by one
Last Updated: 06-02-2019
Given an array, cyclically rotate the array clockwise by one.

Examples:

Input:  arr[] = {1, 2, 3, 4, 5}
Output: arr[] = {5, 1, 2, 3, 4}
 */
/*
Following are steps.
	1) Store last element in a variable say x.
	2) Shift all elements one position ahead.
	3) Replace first element of array with x.
 */
public class _4_ProgramToCyclicallyRotateAnArrayByOne {

	public static void main(String[] args) {
		int[] array = {1,2,3,4,5};
		
		int x = array[array.length-1];
		for (int i = array.length-1; i > 0; i--) {
			array[i] = array[i-1];
		}
		array[0] = x;

		System.out.println(Arrays.toString(array));
	}

}
