package interviewQuestions.leetcode;

public class MyMaxFuntion {

	public static void main(String[] args) {
		int[] arr = { 2, 3, 5, 1, 3 };

		System.out.println(maxfunction(arr));

	}

	private static int maxfunction(int[] arr) {
		int max = -1;
		for (int i = 0; i < arr.length; i++) {

			if (max < arr[i]) {
				max = arr[i];
			}

		}
		return max;

	}

}
