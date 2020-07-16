package array;

public class SecondSmallestValueOfAnArray {

	public static void main(String[] args) {
		int[] array = {-5, -4, 0, 2, 10, 30, -3};
		secondSmallest(array);

	}

	private static void secondSmallest(int[] array) {
		int second_smallest = Integer.MAX_VALUE;
		int first_smallest = Integer.MAX_VALUE;

		for (int i = 0; i < array.length; i++) {
			if (array[i] < first_smallest) {
				second_smallest = first_smallest;
				first_smallest = array[i];
			}
			if (array[i] != first_smallest && array[i] < second_smallest) {
				second_smallest = array[i];
			}
		}
		System.out.println("\nSecond Smalles Number of an Array :" + second_smallest);

	}
}
