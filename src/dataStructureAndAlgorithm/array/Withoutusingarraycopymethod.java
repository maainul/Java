package dataStructureAndAlgorithm.array;

import java.util.Arrays;

public class Withoutusingarraycopymethod {

	public static void main(String[] args) {
		int[] firstArray = {23,45,12,78,4,90,1};
		int[] secondArray = {77,11,45,88,32,56,3};
		// length of two array...
		int length = firstArray.length + secondArray.length;
		// destination array...
		int[] mergedArray = new int[length];
		int pos = 0;
		
		for (int i : firstArray) {
			mergedArray[pos] = i;
			pos++;
		}
		
		for (int i : secondArray) {
			mergedArray[pos] = i;
			pos++;
		}
		
		System.out.println(Arrays.toString(mergedArray));
	}

}
