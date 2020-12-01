package dataStructureAndAlgorithm._1_array.sorting._8_SortAnArrayContainingTwoTypesOfElements;

import java.util.Arrays;

/*
Segregate 0s and 1s in an array


You are given an array of 0s and 1s in random order.

Segregate 0s on left side and 1s on right side of the array. Traverse array only once.

Input array   =  [0, 1, 0, 1, 0, 0, 1, 1, 1, 0]

Output array =  [0, 0, 0, 0, 0, 1, 1, 1, 1, 1]

 */
public class _1_Segregrate_0_And_1 {
    public static void main(String[] args) {
        int array[] = {0, 1, 0, 1, 0, 0, 1, 1, 1, 0};
        segregrate(array);
    }

    private static void segregrate(int[] array) {
        // count 0;
        int count = 0;
        for (int i = 0; i < array.length; i++){
            if (array[i] == 0){
                count++;
            }
        }

        // fill with 0 in the array
        for (int i = 0; i < count; i++){
            array[i ] = 0;
        }
        // fill with 0 in the array
        for (int i = count; i < array.length; i++){
            array[i] = 1;
        }

        System.out.println(Arrays.toString(array));

    }
}
