package array;

public class SmallestNumberOfAnArray {

	public static void main(String[] args) {
		int[] array = { -2, 54, -6, 34, 2, 12, 90, 6 };
		findSmallest(array);

	}

	private static void findSmallest(int[] array) {
		int min = Integer.MAX_VALUE;
		for (int i = 0; i < array.length; i++) {
			if (array[i] < min) {
				min = array[i];
			}
		}
		System.out.println("\nSmallest Value of the array :" + min);

	}

}
