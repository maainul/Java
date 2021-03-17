package interviewQuestions;

public class _53_MaximumSubArrayWithBruteForceMethod {
	public static void main(String[] args) {

		int[] nums = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };
		System.out.println(maxSubArray(nums));

	}

	public static int maxSubArray(int[] nums) {
		int msf = Integer.MIN_VALUE;
		int meh = 0;
		for (int num : nums) {
			meh += num;
			if (meh < num) {
				meh = num;
			}
			if (msf < meh) {
				msf = meh;
			}
		}
		return msf;
	}
}