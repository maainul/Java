package dataStructureAndAlgorithm.geekforgeeks._2_arrangementRearrangement;

import java.util.Arrays;

public class _17_RearrangeArrayMinimunAndMaximum {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 6};
        rearr(arr);
    }

    private static void rearr(int[] arr) {
        int index = 0;
        int[] temp = new int[arr.length];
        int i = 0;
        int j = arr.length-1;
        while (i <= j){
            if (index % 2 == 0){
                temp[index++] = arr[j--];
            }else{
                temp[index++] = arr[i++];
            }
        }
        System.out.println(Arrays.toString(temp));
    }
}
