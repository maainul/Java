package array_important_50_geeksforgeeks.level1;

import java.util.Arrays;

public class _3_ReverseArray {
    public static void main(String[] args) {
        int arr[] = {02, 5, 2, 4, 9, 3, 1, 7, 3, 11, 12, 3};
        int result[] = reverseArray(arr);
        System.out.println(Arrays.toString(result));

    }

    private static int[] reverseArray(int[] arr) {
        int left = 0;
        int right = arr.length-1;
        while (left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
        return arr;
    }
}
