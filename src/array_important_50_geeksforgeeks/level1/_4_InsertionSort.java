package array_important_50_geeksforgeeks.level1;

import java.util.Arrays;

public class _4_InsertionSort {
    public static void main(String[] args) {
        int arr[] = { 02, 5, 2, 4, 9, 3, 1, 7, 3, 11, 12, 3};
        int result[] = insertionSort(arr);
        System.out.println(Arrays.toString(result));

    }

    private static int[] insertionSort(int[] arr) {
        int j = 0;
        for (int i = 0; i <arr.length; i++){
            int endOfI = i;
            while (endOfI > 0 && arr[endOfI-1] > arr[endOfI]){
                int temp = arr[endOfI];
                arr[endOfI] = arr[endOfI-1];
                arr[endOfI-1] = temp;
                endOfI--;
            }
        }
        return arr;
    }
}
