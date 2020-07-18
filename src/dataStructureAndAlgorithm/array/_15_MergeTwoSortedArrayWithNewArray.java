package dataStructureAndAlgorithm.array;
/*
Merge two sorted arrays
Given two sorted arrays, the task is to merge them in a sorted manner.

Examples:

Input: arr1[] = { 1, 3, 4, 5}, arr2[] = {2, 4, 6, 8}
Output: arr3[] = {1, 2, 3, 4, 4, 5, 6, 8}

Input: arr1[] = { 5, 8, 9}, arr2[] = {4, 7, 8}
Output: arr3[] = {4, 5, 7, 8, 8, 9}

 */

   public class _15_MergeTwoSortedArrayWithNewArray
    {
        // Merge arr1[0..n1-1] and arr2[0..n2-1]
        // into arr3[0..n1+n2-1]
        public static void mergeArrays(int[] arr1, int[] arr2, int n1,
                                       int n2, int[] arr3)
        {
            int i = 0, j = 0, k = 0;

            // Traverse both array
            while (i<n1 && j <n2) {
                // Check if current element of first
                // array is smaller than current element
                // of second array. If yes, store first
                // array element and increment first array
                // index. Otherwise do same with second array
                if (arr1[i] < arr2[j]){
                    arr3[k] = arr1[i];
                k++;
                i++;
            }
                else {
                    arr3[k] = arr2[j];
                    k++;
                    j++;
                }
            }

            // Store remaining elements of first array
            while (i < n1) {
                arr3[k] = arr1[i];
                k++;
                i++;
            }
            // Store remaining elements of second array
            while (j < n2) {
                arr3[k] = arr2[j];
                k++;
                j++;
            }
        }

        public static void main (String[] args)
        {
            int[] arr1 = {1, 3, 5, 7};
            int n1 = arr1.length;

            int[] arr2 = {2, 4, 6, 8};
            int n2 = arr2.length;

            int[] arr3 = new int[n1+n2];

            mergeArrays(arr1, arr2, n1, n2, arr3);

            System.out.println("Array after merging");
            for (int i=0; i < n1+n2; i++)
                System.out.print(arr3[i] + " ");
        }
    }

/* This code is contributed by Mr. Somesh Awasthi */
