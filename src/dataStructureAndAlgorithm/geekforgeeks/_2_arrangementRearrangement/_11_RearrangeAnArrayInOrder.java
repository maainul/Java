package dataStructureAndAlgorithm.geekforgeeks._2_arrangementRearrangement;

import java.util.Arrays;

public class _11_RearrangeAnArrayInOrder {
    public static void main(String[] args) {
        int arr[] = {5, 8, 1, 4, 2, 9, 3, 7, 6};
        int n = arr.length;
        rearrangeArray(arr, n);
    }

    private static void rearrangeArray(int[] arr, int n) {
        // Sorting the array elements
        Arrays.sort(arr);

        int[] tempArr = new int[n]; // To store modified array

        // Adding numbers from sorted array to
        // new array accordingly
        int start = 0;
        int end = n-1;

        for (int i = 0; i < n; i++){
            if (i % 2 == 0 ){
                tempArr[i] = arr[start];
                start++;
            }else {
                tempArr[i] = arr[end];
                end--;
            }
        }

        for (int i = 0; i < n; i++)
            System.out.print(tempArr[i] + " ");

    }
}
