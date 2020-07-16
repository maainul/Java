package array;

public class SecondLargestUsingRecursion {

	public static void main(String[] args) {
		int[] array = { 14, 85, 90, 14, 25, 36, 70, 50 };
		int i = 0;
		int second_largest = Integer.MIN_VALUE;
		int first_largest = Integer.MIN_VALUE;
		secondlargest(array, first_largest, second_largest, i);

	}

	private static void secondlargest(int[] array, int first_largest, int second_largest, int i) {
		// base case
		if (i == array.length-1) {
			System.out.println("\nSecond largest :" + second_largest);
			return;
		}
		if (array[i] > first_largest) {
			second_largest = first_largest;
			first_largest = array[i];
		}
		if (array[i] != first_largest && array[i] > second_largest) {
			second_largest = array[i];
		}
		secondlargest(array, first_largest, second_largest, i + 1);

	}

}
