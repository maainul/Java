package leetcode;

public class _1588_SumOfAllOddLengthSubarrays {

	public static void main(String[] args) {
		int[] arr = { 1, 4, 2, 5, 3 };
		int result = sumOddLengthSubarrays(arr);
		System.out.println(result);

	}

	public static int sumOddLengthSubarrays(int[] arr) {
		if (arr == null || arr.length == 0)
			return 0;
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			int tempsum = 0;
			for (int j = i; j < arr.length; j++) {
				tempsum += arr[j];
				if ((j - i) % 2 == 0)
					sum += tempsum;
			}
		}
		return sum;
	}

}
