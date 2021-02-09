package dataStructureAndAlgorithm._1_array;

/*
 */
public class BubbleSortPrac {

	public static void main(String[] args) {
		BubbleSortPrac obj = new BubbleSortPrac();

		int array[] = { 4, 3, 2, 6, 89, 53, 33, 20, 8 };
		obj.printArray(array);
		obj.sort(array);
		System.out.println();
		obj.printArray(array);
	}

	private void sort(int[] array) {

		for (int i = 0; i < array.length - 1; i++) {
			for (int j = 0; j < array.length - i - 1; j++) {
				if (array[j] > array[j + 1]) {
					int temp = array[j];
					array[j] = array[j + 1];
					array[j + 1] = temp;
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
