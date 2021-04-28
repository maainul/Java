package array_important_50_geeksforgeeks.level2;

import java.util.Arrays;

public class _1CyclicallyRotateAnArrayByOne {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5};
        int rotateOne[] = rotateArrayOne(arr);
        System.out.println(Arrays.toString(rotateOne));
    }

    private static int[] rotateArrayOne(int[] arr) {
        int x = arr[arr.length -1];
        int i = arr.length-1;
        while (i >= 1){
            arr[i] = arr[i-1];
            i--;
        }
        arr[i] = x;
        return arr;
    }
}
