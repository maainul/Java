/**
 * @Author Md. Mainul Hasan
 * 
 * 8:37:35 PM
 * 
 * Oct 1, 2020
 *
 */
package interviewQuestions;

public class _1010_PairsofSongsWithTotalDurationsDivisibleby60 {

	public static void main(String[] args) {
		int[] time = { 60, 60, 60 };
		System.out.println(numPairsDivisibleBy60(time));

	}

	/*
	 * Oops, I get the Time Limit Exceeded error. Our code is inefficient. We should
	 * notice that 1 <= time.length <= 60000tell us this time list might be very
	 * long. If the list have 40000 elements, we have to run at
	 * (1+40000)*40000/2=800020000 times! We have to find some way to reduce this
	 * operation.
	 */
	public static int numPairsDivisibleBy60(int[] time) {
		int count = 0;
		for (int i = 0; i < time.length - 1; i++) {
			for (int j = i + 1; j < time.length; j++) {
				if ((time[i] + time[j]) % 60 == 0) {
					// System.out.println(count);
					count++;
				}
			}
		}
		return count;

	}

}
