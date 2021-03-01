package interviewQuestions.leetcode;

public class _1550_ThreeConsecutiveOdds {

	public static void main(String[] args) {
		int arr[] = { 1, 2, 34, 3, 4, 5, 7, 23, 12 };
		System.out.println(threeConsecutiveOdds(arr));

	}

	public static boolean threeConsecutiveOdds(int[] arr) {
		int count = 0;
		for (int i = 0; i < arr.length; i++) {

			count = (arr[i] % 2 == 1) ? count + 1 : 0;

			if (count == 3)
				return true;
		}

		return false;
	}

}
