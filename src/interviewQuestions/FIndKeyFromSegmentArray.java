package interviewQuestions;

// https://www.geeksforgeeks.org/check-if-a-key-is-present-in-every-segment-of-size-k-in-an-array/
/*
Given an array arr[] and size of array is n and one another key x, and give you a segment size k. The task is to find that the key x present in every segment of size k in arr[].
Examples:

Input :
arr[] = { 3, 5, 2, 4, 9, 3, 1, 7, 3, 11, 12, 3}
x = 3
k = 3
Output : Yes
There are 4 non-overlapping segments of size k in the array, {3, 5, 2}, {4, 9, 3}, {1, 7, 3} and {11, 12, 3}. 3 is present all segments.
Input :
arr[] = { 21, 23, 56, 65, 34, 54, 76, 32, 23, 45, 21, 23, 25}
x = 23
k = 5
Output :Yes
There are three segments and last segment is not full {21, 23, 56, 65, 34}, {54, 76, 32, 23, 45} and {21, 23, 25}.
23 is present all window.
Input :arr[] = { 5, 8, 7, 12, 14, 3, 9}
x = 8
k = 2
Output : No
 */
public class FIndKeyFromSegmentArray {
    public static void main(String[] args) {
        int arr[] = {30, 30};
        int key = 3;
        int k = 3;
        boolean res = findSeg(arr, key, k);
        System.out.println(res);
    }

    private static boolean findSeg(int[] arr, int key, int k) {
        int i;
        boolean b = false;
        int N = arr.length;
        // Iterate from 0 to N - 1
        for (i = 0; i < N; i = i + k) {

            // Iterate from 0 to k - 1
            int j = 0;
            for (j = 0; j < k; j++) {
                if (i + j < N && arr[i + j] == key)
                    break;
            }
            if (j == k)
                return false;
            if (i + j >= N)
                return false;
        }

        if (i >= N)
            return true;
        else
            return b;
    }
}
