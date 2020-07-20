package dataStructureAndAlgorithm._1_array;

public class FindLargestNumberOfAnArray {

	public static void main(String[] args) {
		int[] array = { 3, 2, 9, 11, 30, 22, 19 };
		System.out.println(findLargest(array));
	}

	private static int findLargest(int[] array) {
		int max_number = Integer.MIN_VALUE;
		for (int i = 0; i < array.length; i++) {
			if (max_number < array[i]) {
				max_number = array[i];
			}
		}
		return max_number;
	}

}
