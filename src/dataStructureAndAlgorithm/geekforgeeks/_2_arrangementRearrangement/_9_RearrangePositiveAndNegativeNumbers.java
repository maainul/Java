package dataStructureAndAlgorithm.geekforgeeks._2_arrangementRearrangement;

import java.util.Arrays;

public class _9_RearrangePositiveAndNegativeNumbers {
    public static void main(String[] args) {
        // pass
//        int[] arr = { -12, 11, -13, -5,
//                6, -7, 5, -3, -6 };

        // pass
//        int[] arr = { -12, -11, -13, -5,
//                -6, -7, -5, 3, 6 };
        // pass
//        int[] arr = { -12, -11, -13, -5,
//                -6, -7, -5, 3, 6 };
        // pass
//        int[] arr = { -12, 1, -13, 5,
//                -6, 7, -5, 3, -6 };
        // pass
        int[] arr = { -12, -1, 0, 5,
                -6, 0, -5, 3, -6 };
        rearragne(arr);

    }

    private static void rearragne(int[] arr) {
        int start = 0;
        int end = 1;
        while(end < arr.length){
            if(arr[end] < 0 && arr[start] >= 0){
                swap(arr,start,end);
                start++;
                end++;
            }
            else if(arr[start] < 0 ){
                start++;
                end++; // important line for this line test case will be failed
            }
            else if (arr[end] >= 0 ){
                end++;
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    private static void swap(int[] arr, int start, int end) {
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
    }
}
