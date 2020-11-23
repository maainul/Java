package dataStructureAndAlgorithm._1_array._1_arrayRotations;

import java.util.Arrays;
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
