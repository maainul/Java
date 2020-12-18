package dataStructureAndAlgorithm._1_array.searching._11_EquilibriumIndexOfAnArray;
/*
Equilibrium index of an array

Last Updated: 30-10-2020

Equilibrium index of an array is an index such that the sum of elements at lower indexes is equal to the sum of elements at higher indexes.

For example, in an array A:

Example :

Input: A[] = {-7, 1, 5, 2, -4, 3, 0}

Output: 3

3 is an equilibrium index, because:

A[0] + A[1] + A[2] = A[4] + A[5] + A[6]

Input: A[] = {1, 2, 3}

Output: -1

Write a function int equilibrium(int[] arr, int n); that given a sequence arr[] of size n,

returns an equilibrium index (if any) or -1 if no equilibrium indexes exist.
 */

public class Main {
    public static void main(String[] args) {
        int arr[] = { -7, 1, 5, 2, -4, 3, 0 };
        int arr_size = arr.length;
        System.out.println(equilibrium(arr, arr_size));
        System.out.println(equilibrium2(arr, arr_size));
    }

    private static int equilibrium(int[] arr, int n) {
        int i, j;
        int leftsum, rightsum;

        /* Check for indexes one by one until
           an equilibrium index is found */
        for (i = 0; i < n; ++i) {

            /* get left sum */
            leftsum = 0;
            for (j = 0; j < i; j++)
                leftsum += arr[j];

            /* get right sum */
            rightsum = 0;
            for (j = i + 1; j < n; j++)
                rightsum += arr[j];

            /* if leftsum and rightsum are same,
               then we are done */
            if (leftsum == rightsum)
                return i;

        }
        /* return -1 if no equilibrium index is found */
        return -1;

    }


    static int equilibrium2(int arr[], int n)
    {
        int sum = 0; // initialize sum of whole array
        int leftsum = 0; // initialize leftsum

        /* Find sum of the whole array */
        for (int i = 0; i < n; ++i)
            sum += arr[i];
        System.out.println(sum);
        for (int i = 0; i < n; ++i) {
            sum -= arr[i]; // sum is now right sum for index i

            if (leftsum == sum)
                return i;

            leftsum += arr[i];
        }

        /* If no equilibrium index found, then return 0 */
        return -1;
    }
}
