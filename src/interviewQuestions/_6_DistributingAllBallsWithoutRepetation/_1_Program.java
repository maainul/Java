/**
 * @Author Md. Mainul Hasan
 * 
 * 6:53:30 PM
 * 
 * Nov 21, 2020
 *
 */
package interviewQuestions._6_DistributingAllBallsWithoutRepetation;

public class _1_Program {
	static int MAX_CHAR = 26;

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		long n = 5, k = 2;
		String str = "aaabb";

		if (distributingBalls(k, n, str))
			System.out.println("YES");
		else
			System.out.println("NO");
	}

	// function to find if its possible
	// to distribute balls or not
	static boolean distributingBalls(long k, long n, String str) {

		// count array to count how many
		// times each color has occurred
		int[] a = new int[MAX_CHAR];

		for (int i = 0; i < n; i++) {

			// increasing count of each
			// color every time it appears
			a[str.charAt(i) - 'a']++;
		}

		for (int i = 0; i < MAX_CHAR; i++)

			// to check if any color appears
			// more than K times if it does
			// we will print NO
			if (a[i] > k)
				return false;

		return true;
	}

}
