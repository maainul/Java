package dataStructureAndAlgorithm.geekforgeeks._5_Searching;

import java.util.Arrays;

public class _22_MaximumTripletSum {
    public static void main(String[] args) {
        int[] arr = {1, 0, 8, 6, 4, 2};
        int n = arr.length;
        System.out.println(maxTripletSum(arr, n));
        System.out.println(maxTripletSumsorted(arr, n));
        System.out.println(maxTripletSums3Max(arr, n));
    }
    private static int maxTripletSums3Max(int[] arr, int n) {
        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;
        int third = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            if (arr[i] > first) {
                third = second;
                second = first;
                first = arr[i];
            } else if (arr[i] > second) {
                third = second;
                second = arr[i];
            } else {
                third = arr[i];
            }
        }
        return second + first + third;
    }

    private static int maxTripletSumsorted(int[] arr, int n) {
        Arrays.sort(arr);
        return arr[n - 1] + arr[n - 2] + arr[n - 3];
    }

    private static int maxTripletSum(int[] arr, int n) {
        int sum = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                for (int k = j + 1; k < n; k++) {
                    if (sum < arr[i] + arr[j] + arr[k]) {
                        sum = arr[i] + arr[j] + arr[k];
                    }
                }
            }
        }
        return sum;
    }
}
