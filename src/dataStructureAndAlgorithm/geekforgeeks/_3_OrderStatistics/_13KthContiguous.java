package dataStructureAndAlgorithm.geekforgeeks._3_OrderStatistics;

import java.util.ArrayList;
import java.util.Arrays;

public class _13KthContiguous {
    public static void main(String[] args) {
        int[] a = {10, -10, 20, -40};
        kthContiguousArray(a);
    }

    private static void kthContiguousArray(int[] a) {
        int n  = a.length;
        int index = 0;
        int[] arr = new int[20];
        ArrayList<Integer> arrayList = new ArrayList<Integer>();


        for (int i = 0; i < a.length; i++){
            int sum = 0;
            for (int j = i; j < a.length; j++){
                sum = a[j] + sum;
                arr[index++] = sum;
                arrayList.add(sum);
            }
        }
        System.out.println(arrayList);
        System.out.println(Arrays.toString(arr));
    }
}
