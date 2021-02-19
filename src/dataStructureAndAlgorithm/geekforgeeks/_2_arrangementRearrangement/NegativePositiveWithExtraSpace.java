package dataStructureAndAlgorithm.geekforgeeks._2_arrangementRearrangement;

import java.util.Arrays;

public class NegativePositiveWithExtraSpace {
    static void rearrange(int arr[], int n) {
        int i = 0, j = arr.length;
        int[] temp = new int[arr.length];
        int index = 0;
        for (i = 0; i < j; i++) {
            if (arr[i] < 0) {
                temp[index++] = arr[i];
            }
        }
        for (int k = 0; k < j; k++) {
            if (arr[k] >= 0) {
                temp[index++] = arr[k];
            }

        }


        System.out.println(Arrays.toString(temp));


    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    // A utility function to print an array
    static void printArray(int arr[], int n) {
        for (int i = 0; i < n; i++)
            System.out.print(arr[i] + " ");
    }

    // Driver code
    public static void main(String args[]) {
        int arr[] = {-1, 2, -3, -4, -5, 6, -7, 8, -9};
        int n = arr.length;

        rearrange(arr, n);

    }
}
