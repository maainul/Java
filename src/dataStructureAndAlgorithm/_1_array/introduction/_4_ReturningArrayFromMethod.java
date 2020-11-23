package dataStructureAndAlgorithm._1_array.introduction;

public class _4_ReturningArrayFromMethod {

	public static void main(String[] args) {
		int arr[] = m1();
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i] + " ");
		}

	}

	private static int[] m1() {

		return new int[] { 1, 2, 3 };
	}

}
