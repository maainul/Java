package array_important_50_geeksforgeeks.level1;

import java.util.Arrays;

public class _10_FindUnionAndIntersectionFromSortedDuplicateElement {
    public static void main(String[] args) {
        int arr1[] = {1, 2, 2, 2, 3, 7};
        int arr2[] = {2, 3, 4, 5};
        union(arr1, arr2);
        System.out.println();
        intersection(arr1, arr2);
    }

    private static void intersection(int[] arr1, int[] arr2) {
        int m = arr1[arr1.length - 1];
        int n = arr2[arr2.length - 1];
        int ans = (m > n) ? m : n;
        int freqTable[] = new int[ans + 1];
        freqTable[arr1[0]]++;
        for (int i = 1; i < arr1.length; i++) {
            if (arr1[i - 1] != arr1[i]) {
                freqTable[arr1[i]]++;
            }
        }

        for (int j = 0; j < arr2.length; j++) {
            if (freqTable[arr2[j]] == 1) {
                System.out.print(arr2[j] + " ");
            }
        }
    }


    private static void union(int[] arr1, int[] arr2) {
        int m = arr1[arr1.length - 1];
        int n = arr2[arr2.length - 1];
        int ans = (m > n) ? m : n;
        int freqTable[] = new int[ans + 1];
        System.out.print(arr1[0] + " ");
        freqTable[arr1[0]]++;
        for (int i = 1; i < arr1.length; i++) {
            if (arr1[i - 1] != arr1[i]) {
                System.out.print(arr1[i] + " ");
                freqTable[arr1[i]]++;
            }
        }

        for (int j = 0; j < arr2.length; j++) {
            if (freqTable[arr2[j]] == 0) {
                System.out.print(arr2[j] + " ");
                freqTable[arr2[j]]++;
            }
        }
    }
}
