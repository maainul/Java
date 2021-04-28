package array_important_50_geeksforgeeks;

import java.util.Arrays;

public class _4_SortTheGivenArray_BubbleSort {
    public static void main(String[] args) {
        int arr[] = {5, 2, 4, 9, 3, 1, 7, 3, 11, 12, 3};
        int result[] = bubbleSort(arr);
        System.out.println(Arrays.toString(result));

    }

    private static int[] bubbleSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        return arr;
    }
}
