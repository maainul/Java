package dataStructureAndAlgorithm._1_array.sorting._4_SortAnArrayInWaveForm;
/*
This can be done in O(n) time by doing a single traversal of given array. 

The idea is based on the fact that if we make sure that all even positioned (at index 0, 2, 4, ..) 

elements are greater than their adjacent odd elements, 

we don’t need to worry about odd positioned element. Following are simple steps.

1) Traverse all even positioned elements of input array, and do following.

….a) If current element is smaller than previous odd element, swap previous and current.

….b) If current element is smaller than next odd element, swap next and current.

Below are implementations of above simple algorithm.
 */

public class Method2 {

    public static void main(String[] args) {
        int[] arr = {10, 90, 49, 2, 1, 5, 23};
        int n = arr.length;
        sortInWave(arr, n);
        for (int i : arr)
            System.out.print(i + " ");

    }

    private static void sortInWave(int[] arr, int n) {
        for (int i = 0; i < n - 1; i += 2) {
            if (i > 0 && arr[i - 1] > arr[i]) {
                swap(arr, i - 1, i);
            }
            if (i < n - 1 && arr[i] < arr[i + 1]) {
                swap(arr, i, i + 1);
            }
        }

    }

    private static void swap(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

}
