package interviewQuestions;

import java.util.Arrays;

public class ReverseAnArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3};
        int[] rest = reverse(arr);
        System.out.println(Arrays.toString(rest));

    }

    private static int[] reverse(int[] arr) {
        int left = 0;
        int right = arr.length-1;
        while (left < right){
            int temp = arr[left];
            arr[left]  = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
        return arr;
    }
}
