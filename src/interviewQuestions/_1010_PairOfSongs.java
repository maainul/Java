package interviewQuestions;

/*
1010. Pairs of Songs With Total Durations Divisible by 60

In a list of songs, the i-th song has a duration of time[i] seconds. 

Return the number of pairs of songs for which their total duration in seconds is divisible by 60.  
Formally, we want the number of indices i, j such that i < j with (time[i] + time[j]) % 60 == 0.

Example 1:

Input: [30,20,150,100,40]
Output: 3

Explanation: Three pairs have a total duration divisible by 60:
(time[0] = 30, time[2] = 150): total duration 180
(time[1] = 20, time[3] = 100): total duration 120
(time[1] = 20, time[4] = 40): total duration 60
Example 2:

Input: [60,60,60]
Output: 3
Explanation: All three pairs have a total duration of 120, 
which is divisible by 60.

 */
public class _1010_PairOfSongs {

	public static void main(String[] args) {
		int[] nums = { 30, 20, 150, 100, 40 };
		System.out.println(numPairsDivisibleBy60(nums));
		// System.out.println(30 % 60);

	}

	public static int numPairsDivisibleBy60(int[] time) {

		int[] cnt = new int[60];
		int total = 0;
		for (int num : time) {
			int remainder = num % 60;
			System.out.println("reminder " + remainder);
			int comp = (60 - remainder) % 60;
			System.out.println("comp " + comp);
			total += cnt[comp];
			System.out.println("cnt " + cnt[comp]);
			System.out.println("total " + total);
			cnt[remainder]++;
			System.out.println("cnt reminder " + cnt[remainder]);
		}

		return total;
	}

}
