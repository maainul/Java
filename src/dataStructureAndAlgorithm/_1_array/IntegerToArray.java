package dataStructureAndAlgorithm._1_array;

import java.util.Arrays;

public class IntegerToArray {

	public static void main(String[] args) {
		int x = 123;

		System.out.println(x);

		System.out.println("\nAfter Convert to Array");
		int[] result = intToArray(x);
		System.out.println(Arrays.toString(result));

	}

	private static int[] intToArray(int number) {
		// count array length;
		int temp = number;
		int count = 0;
		while (temp > 0) {
			temp = temp / 10;
			count++;
		}
		// Declare an array
		int[] resultArray = new int[count];
		int index = 0;
		while (number > 0) {
			int rem = number % 10;
			resultArray[index++] = rem;
			number = number / 10;

		}
		Arrays.sort(resultArray);
		return resultArray;
	}

}
