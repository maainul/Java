package dataStructureAndAlgorithm.geekforgeeks._5_Searching;

import java.util.HashSet;

public class _19_UpdatedSolutions {
    public static void main(String[] args) {
        int[] arr = {4, 2, 4, 5, 2, 3, 1};
        int arr_size = arr.length;
        printRepeating(arr, arr_size);

    }



    private static void printRepeating(int[] arr, int arr_size) {
        HashSet<Integer> hashSet = new HashSet<>();
        for (int i = 0; i < arr_size; i++) {
            if (hashSet.contains(arr[i])) {
                System.out.println(arr[i]);
            }
            hashSet.add(arr[i]);
        }
    }
}
