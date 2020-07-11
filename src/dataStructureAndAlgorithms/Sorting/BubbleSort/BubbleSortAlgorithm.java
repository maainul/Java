// https://www.javatpoint.com/bubble-sort-in-java

package dataStructureAndAlgorithms.Sorting.BubbleSort;

import java.util.Arrays;

public class BubbleSortAlgorithm {

	public static void main(String[] args) {
		BubbleSortAlgorithm obj = new BubbleSortAlgorithm();
		int array[] = { 10, 7, 9, 2, 8, 3, 5, 4, 6, 1 };
		obj.printArray(array);
		obj.sort(array);
		System.out.println("\nAfter Bubble SOrt");
		obj.printArray(array);
		System.out.println("\nTo String method ");
		System.out.println(Arrays.toString(array));
	}  

	private void sort(int[] array) {
		for (int i = 0; i < array.length-1; i++) {
			for (int j = 0; j < array.length-i-1; j++) {
				if (array[j] > array[j+1]) {
					int temp = array[j];
					array[j] = array[j+1];
					array[j+1] = temp;
				}
				
			}
		}
		
	}

	private void printArray(int[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
	}

}
