package recursion.Problem25;

public class Problem25 {

	public static void main(String[] args) {
		int[] arr = { 2, 4, 0, 6, 0 };
		int count = 0;
		int i = 0;
		int result = countZero(arr, count, i);
		System.out.println(result);
	}

	private static int countZero(int[] arr, int count, int i) {

		if (i == arr.length) {
			return count;
		}

		if (arr[i] == 0) {
			count++;
		}
		return countZero(arr, count, i + 1);

	}

}
