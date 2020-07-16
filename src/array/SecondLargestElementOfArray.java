package array;

public class SecondLargestElementOfArray {

	public static void main(String[] args) {
		int[] array = { 14, 85, 90, 14, 25, 36, 70, 50 };
		secondlargest(array);
	}

	private static void secondlargest(int[] array) {
		int second_largest = Integer.MIN_VALUE;
		int first_largest = Integer.MIN_VALUE;

		for (int i = 0; i < array.length; i++) {
			if (array[i] > first_largest) {
				second_largest = first_largest;
				first_largest = array[i];
			}
			if (array[i] != first_largest && array[i] > second_largest) {
				second_largest = array[i];
			}
		}
		System.out.println("\nSecond Largest :" + second_largest);
	}

}
