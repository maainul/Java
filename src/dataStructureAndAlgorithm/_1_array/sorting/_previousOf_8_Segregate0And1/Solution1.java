package dataStructureAndAlgorithm._1_array.sorting._previousOf_8_Segregate0And1;

import java.util.Arrays;

/*
Method 1 (Count 0s or 1s)

Thanks to Naveen for suggesting this method.

1) Count the number of 0s. Let count be C.

2) Once we have count, we can put C 0s at the beginning and 1s at the remaining n – C positions in array.
 */
public class Solution1 {

	public static void main(String[] args) {
		int[] array = { 0, 1, 0, 1, 0, 0, 1, 1, 1, 0 };
		segreagate(array);

	}

	private static void segreagate(int[] array) {
		int count = 0;
		for (int i = 0; i < array.length; i++) {
			if (array[i] == 0) {
				count++;
			}
		}

		for (int i = 0; i < count; i++) {
			array[i] = 0;
		}
		for (int j = count; j < array.length; j++) {
			array[j] = 1;
		}

		System.out.println(Arrays.toString(array));
	}

}
