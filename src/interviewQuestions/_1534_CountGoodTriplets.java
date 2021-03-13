package interviewQuestions;
/*
 * /* My thought process 

Since we are given only a small array of maximum size 100, we can use 3 loops here which makes TC O(n^3), but its ok to do that.
SO the idea is simple, we use 3 loops,
1. Go from 1st element to lastelemnt-2 elements
2. Go from next element to lastelement-1 elements
3. Go from next element to lastelement elements

Now we apply the given condition for us and increase the count.
0 <= i < j < k < arr.length
|arr[i] - arr[j]| <= a
|arr[j] - arr[k]| <= b
|arr[i] - arr[k]| <= c

Finally return this count.

*/

public class _1534_CountGoodTriplets {

	public static void main(String[] args) {
		int[] arr = { 3, 0, 1, 1, 9, 7 };
		int a = 7, b = 2, c = 3;
		int r = countGoodTriplets(arr, a, b, c);

		System.out.println(r);
	}

	public static int countGoodTriplets(int[] arr, int a, int b, int c) {
		int length = arr.length;
		int count = 0;
		for (int i = 0; i < arr.length - 2; i++) {
			for (int j = i + 1; j < arr.length - 1; j++) {
				for (int k = j + 1; k < arr.length; k++) {
					int t1 = Math.abs(arr[i] - arr[j]);
					int t2 = Math.abs(arr[j] - arr[k]);
					int t3 = Math.abs(arr[k] - arr[i]);

					if (t1 <= a && t2 <= b && t3 <= c) {
						count += 1;
					}

				}
			}
		}
		return count;

	}

}
