package array_important_50_geeksforgeeks.level1;

import java.util.Arrays;

public class _10_FindUnionAndIntersectionOfSortedArray {
    public static void main(String[] args) {
        int arr1[] = {1, 3, 4, 5, 7};
        int arr2[] = {2, 3, 5, 6};
        int res1[] = union(arr1,arr2);
        int res2[] = intersection(arr1,arr2);
        System.out.println(Arrays.toString(res1));
        System.out.println(Arrays.toString(res2));
    }

    private static int[] union(int[] arr1, int[] arr2) {
        int m = arr1.length;
        int n = arr2.length;
        int i = 0, j = 0,index = 0;
        int newArray[] = new int[m + n];
        while (i < m && j < n){
            if (arr1[i] < arr2[j]){
                newArray[index++] = arr1[i++];
            }else if(arr1[i] > arr2[j]){
                newArray[index++] = arr2[j++];
            }
            else {
                newArray[index++] = arr2[j++];
                i++;
            }
        }
        while (i < m){
            newArray[index++] = arr1[i++];
        }
        while (j < n){
            newArray[index++] = arr2[j++];
        }

        return newArray;
    }

    private static int[] intersection(int[] arr1, int[] arr2) {
        int[] newArray = new int[arr2.length];
        int i=0,j=0,m = arr1.length, n = arr2.length,index = 0;
        while (i < m && j < n){
            if (arr1[i] < arr2[j]){
                i++;
            }else if (arr1[i] > arr2[j]){
                j++;
            }else {
                newArray[index++] = arr1[i];
                i++;
                j++;
            }
        }
        return newArray;
    }
}
