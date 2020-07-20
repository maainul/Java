package dataStructureAndAlgorithm._1_array;

public class _3_SelectionSort {

	public static void main(String[] args) {
		_3_SelectionSort obj = new _3_SelectionSort();
		int array[] = { 10, 17, 91, 20, 80, 33};
		obj.printArray(array);
		obj.sort(array);
		System.out.println();
		obj.printArray(array);
	}  

	private void sort(int[] array) {
		for (int i = 0; i < array.length-1; i++) {
			int index = i;
			for (int j = i+1; j < array.length; j++) {
				if (array[j] < array[index]) {
					index = j;
				}
			}
			
			int temp = array[i];
			array[i] = array[index];
			array[index] = temp;
		}
	}

	private void printArray(int[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
	}

}
