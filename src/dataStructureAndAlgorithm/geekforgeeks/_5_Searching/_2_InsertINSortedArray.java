package dataStructureAndAlgorithm.geekforgeeks._5_Searching;

import java.util.Arrays;

public class _2_InsertINSortedArray {
    public static void main(String[] args) {
        int[] arr = new int[20];
        arr[0]= 1;
        arr[1]= 2;
        arr[2]= 3;
        arr[3]= 5;
        arr[4]= 6;
        arr[5]= 7;
        arr[6]= 8;
        int n = 7;
        insertNumber(arr,4,n);


    }

    private static void insertNumber(int[] arr, int k,int n) {
        int i;
        for (i = n-1; i >= 0; i--){
            if (arr[i] < k){
              break;
            }
            arr[i+1] = arr[i];
        }
        arr[i+1] = k;
        System.out.println(Arrays.toString(arr));

    }
}
