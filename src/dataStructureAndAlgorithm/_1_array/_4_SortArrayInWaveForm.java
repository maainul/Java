package dataStructureAndAlgorithm._1_array;

/*
Sort an array in wave form
Given an unsorted array of integers, sort the array into a wave like array. An array �arr[0..n-1]� is sorted in wave form if arr[0] >= arr[1] <= arr[2] >= arr[3] <= arr[4] >= �..
Examples:

 Input:  arr[] = {10, 5, 6, 3, 2, 20, 100, 80}
 Output: arr[] = {10, 5, 6, 2, 20, 3, 100, 80} OR
                 {20, 5, 10, 2, 80, 6, 100, 3} OR
                 any other array that is in wave form

 Input:  arr[] = {20, 10, 8, 6, 4, 2}
 Output: arr[] = {20, 8, 10, 4, 6, 2} OR
                 {10, 8, 20, 2, 6, 4} OR
                 any other array that is in wave form

 Input:  arr[] = {2, 4, 6, 8, 10, 20}
 Output: arr[] = {4, 2, 8, 6, 20, 10} OR
                 any other array that is in wave form

 Input:  arr[] = {3, 6, 5, 10, 7, 20}
 Output: arr[] = {6, 3, 10, 5, 20, 7} OR
                 any other array that is in wave form
 */
import java.util.Arrays;

public class _4_SortArrayInWaveForm {

	public static void main(String[] args) {
		_4_SortArrayInWaveForm obj = new _4_SortArrayInWaveForm();
		int arr[] = { 10, 90, 49, 2, 1, 5, 23 };
		obj.printArray(arr);
		obj.sortwave(arr);
		System.out.println();
		obj.printArray(arr);
		System.out.println();
		_4_SortArrayInWaveForm obj2 = new _4_SortArrayInWaveForm();
		 int array[] = {10, 90, 49, 2, 1, 5, 23}; 
		obj2.printArray(array);
		obj2.sortSwap(array);
		System.out.println();
		obj2.printArray(array);
		
		

	}

	private void sortwave(int[] arr) {
		Arrays.sort(arr);
		// swap adjacent element
		for (int i = 0; i < arr.length - 1; i += 2) {
			swap(arr, i, i + 1);
		}

	}



	private void printArray(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
	
	
	
	// Method 2
	private void sortSwap(int[] array) {
		
		for (int i = 0; i < array.length; i+=2) {
			if (i > 0 && array[i-1] > array[i]) {
				swap(array, i-1, i);
			}
			
			if (i < array.length-1 && array[i] < array[i+1]) {
				swap(array, i, i+1);
			}
		}
		
	}
	
	
	
	private void swap(int[] arr, int a, int b) {
		int temp = arr[a];
		arr[a] = arr[b];
		arr[b] = temp;
	}

}
