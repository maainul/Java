package dataStructureAndAlgorithm._1_array.sorting._4_SortAnArrayInWaveForm;

import java.util.Arrays;

public class Method_0_ {
    public static void main(String[] args) {
        int[] arr = { 10, 5, 6, 3, 2, 20, 100, 80 };
        sortarray(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static  void sortarray(int[] arr) {
        Arrays.sort(arr);
        for (int i = 0; i < arr.length-1; i +=2 ){
            swap(arr,i,i+1);
        }
    }

    private static void swap(int[] arr, int a, int b) {

        int temp = arr[a];
        arr[a] =  arr[b];
        arr[b] = temp;

    }
}
