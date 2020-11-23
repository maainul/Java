package dataStructureAndAlgorithm._1_array;

import java.util.Arrays;

public class _6_CloneArray {

	public static void main(String[] args) {
		int array[] = { 1, 2, 3 };

		int cloneArray[] = array.clone();

		System.out.println(Arrays.equals(array, cloneArray));

		System.out.println(array.equals(cloneArray));

		System.out.println(array == cloneArray);

		for (int i = 0; i < cloneArray.length; i++) {
			System.out.println(cloneArray[i]);
		}

	}

}
