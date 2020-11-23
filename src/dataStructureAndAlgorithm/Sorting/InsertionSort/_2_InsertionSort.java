package dataStructureAndAlgorithm.Sorting.InsertionSort;

public class _2_InsertionSort {

	public static void main(String[] args) {
		_2_InsertionSort obj = new _2_InsertionSort();
		int array[] = { 10, 7, 9, 2, 8, 3, 5, 4, 6, 1 };
		obj.printArray(array);
		obj.sort(array);
		System.out.println();
		obj.printArray(array);
	}  

	private void sort(int[] array) {
		for (int i = 0; i < array.length; i++) {
			int j = i;
			while (j > 0 && array[j-1] > array[j]) {
				int temp = array[j];
				array[j] = array[j-1];
				array[j-1] = temp;
				j--;
				
			}
		}
	}

	private void printArray(int[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
	}

}
