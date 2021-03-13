package interviewQuestions.countFrequencyOfArray;

import java.util.Arrays;

/*
Given an array which may contain duplicates, print all elements and their frequencies.

Examples:

Input :  arr[] = {10, 20, 20, 10, 10, 20, 5, 20}
Output : 10 3
         20 4
         5  1

Input : arr[] = {10, 20, 20}
Output : 10 1
         20 2
 */
public class _1_Countingfrequenciesofarrayelements {


	public static void main(String[] args) {
		int[] arr = { 10, 20, 20, 10, 10, 20, 5, 20 };
		contFreq(arr, arr.length);

	}

	private static void contFreq(int[] arr, int n) {

		boolean[] visited = new boolean[n];
		Arrays.fill(visited, false);

		for (int i = 0; i < n; i++) {
			if (visited[i]) {
				continue;
			}

			int count = 1;
			for (int j = i + 1; j < n; j++) {
				if (arr[i] == arr[j]) {
					visited[j] = true;
					count++;

				}
			}

			System.out.println(arr[i] + " ----> " + count);

		}

	}

}
