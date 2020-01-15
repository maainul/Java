package array;

import java.util.Arrays;

public class Exampleofarraycopymethod {

	public static void main(String[] args) {
		// we have created two integer arrays firstArray and secondArray
		int[] firstArray = {23,45,12,78,4,90,1};
		int[] secondArray = {77,11,45,88,32,56,3};
		// In order to merge two arrays, we find its length and stored in fal and sal variable respectively.
		int fal = firstArray.length;
		int sal = secondArray.length;
		// we create a new integer array result which stores the sum of length of both arrays.
		int[] result = new int[fal +sal];
		
		// Now, copy each elements of both arrays to the result array by using arraycopy() function.
		System.arraycopy(firstArray, 0, result, 0, 4);
		System.arraycopy(secondArray, 0, result, fal, 4);
		System.out.println(Arrays.toString(result));

	}

}
