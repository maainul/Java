package array_important_50_geeksforgeeks.level2;

import java.util.Arrays;

public class _4_FindDuplicate {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 1, 3, 6, 6,100,100 };
        findDuplicateElement(arr);
    }

    private static void findDuplicateElement(int[] arr) {
        int max = 100;
        int freq[] = new int[max+1];
        for (int i = 0; i < arr.length; i++){
            freq[arr[i]]++;
        }
        //System.out.println(Arrays.toString(freq));
        for (int i =0; i < freq.length; i++){
            if (freq[i] >= 2){
                System.out.println(i);
            }
        }
    }
}
