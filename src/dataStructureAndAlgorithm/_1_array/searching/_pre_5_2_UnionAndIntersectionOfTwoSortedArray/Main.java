package dataStructureAndAlgorithm._1_array.searching._pre_5_2_UnionAndIntersectionOfTwoSortedArray;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {


        int arr1[] = {7, 1, 5, 2, 3, 6};

        int arr2[] = {3, 8, 6, 20, 7};
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        unionOfTwo(arr1, arr2);
        System.out.println();
        unionIntersection(arr1, arr2);
    }

    private static void unionOfTwo(int[] arr1, int[] arr2) {


        int i = 0;
        int j = 0;
        int m = arr1.length;
        int n = arr2.length;

        while (i < m && j < n) {
            if (arr1[i] < arr2[j])
                System.out.print(arr1[i++] + " ");
            else if (arr2[j] < arr1[i])
                System.out.print(arr2[j++] + " ");
            else {
                System.out.print(arr2[j++] + " ");
                i++;
            }

            /* Print remaining elements of
         the larger array */
            while (i < m)
                System.out.print(arr1[i++] + " ");
            while (j < n)
                System.out.print(arr2[j++] + " ");
        }
    }

    private static void unionIntersection(int[] arr1, int[] arr2) {


        int i = 0;
        int j = 0;
        int m = arr1.length;
        int n = arr2.length;
        while (i < m && j < n) {
            if (arr1[i] < arr2[j]) {
                i++;

            } else if (arr1[i] > arr2[j]) {
                j++;
            } else {
                System.out.println(arr1[i]);
                i++;
                j++;
            }
        }


    }
}
