package array;

public class MergeTwoArrayIntoThird {

	public static void main(String[] args) {
		int array1[] = { 1, 3, 5, 7 };
		int array2[] = { 2, 4, 8, 10, 11 };
		int result[] = new int[array1.length + array2.length];
		mergeArray(array1, array2, result);

		System.out.println("After merging");
		for (int i = 0; i < result.length; i++) {
			System.out.print(result[i] + " ");
		}

	}

	private static void mergeArray(int[] array1, int[] array2, int[] result) {

		int i = 0;
		int j = 0;
		int k = 0;

		while (i < array1.length && j < array2.length) {
			if (array1[i] < array2[j]) {
				result[k] = array1[i];
				i++;
				k++;
			} else {
				result[k] = array2[j];
				k++;
				j++;
			}
		}

		while (i < array1.length) {
			result[k] = array1[i];
			k++;
			i++;
		}
		while (j < array2.length) {
			result[k] = array2[j];
			k++;
			j++;
		}

	}

}
