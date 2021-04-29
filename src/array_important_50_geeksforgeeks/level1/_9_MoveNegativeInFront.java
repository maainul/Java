package array_important_50_geeksforgeeks.level1;

import java.util.Arrays;

public class _9_MoveNegativeInFront {
    public static void main(String[] args) {
        System.out.println("Hello World");
        int arr[] = {-12, 11, -13, -5, 6, -7, 5, -3, -6};
        int result[] = moveFront(arr);
        System.out.println(Arrays.toString(result));
    }

    private static int[] moveFront(int[] arr) {
        int left = 0, right = arr.length - 1;
        while (left < right) {
            if (arr[left] < 0) {
                left++;
            } else if (arr[right] > 0) {
                right--;
            } else {
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
                right--;
            }
        }
        return arr;
    }
}
