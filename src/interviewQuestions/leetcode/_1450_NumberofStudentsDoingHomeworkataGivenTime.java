/**
 * @Author Md. Mainul Hasan
 * 
 * 2:20:08 AM
 * 
 * Sep 28, 2020
 *
 */
package interviewQuestions.leetcode;

public class _1450_NumberofStudentsDoingHomeworkataGivenTime {

	public static void main(String[] args) {

		int[] startTime = { 1, 2, 3 };
		int[] endTime = { 3, 2, 7 };
		int queryTime = 4;
		int result = busyStudent(startTime, endTime, queryTime);

		System.out.println(result);
	}

	public static int busyStudent(int[] startTime, int[] endTime, int queryTime) {
		int count = 0;

		for (int i = 0; i < startTime.length; i++) {
			if (queryTime >= startTime[i] && queryTime <= endTime[i]) {
				count++;
			}
		}
		return count;
	}
}