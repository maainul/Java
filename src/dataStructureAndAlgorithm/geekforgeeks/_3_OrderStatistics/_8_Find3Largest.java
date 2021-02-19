package dataStructureAndAlgorithm.geekforgeeks._3_OrderStatistics;

import java.util.Arrays;
import java.util.PriorityQueue;

public class _8_Find3Largest {
    public static void main(String[] args) {
        int arr[] = {12, 13, 1, 10, 34, 1};
        int n = arr.length;
        print3largest(arr, n);
        printmul4(arr);
        printmulpq(arr);
    }

    private static void printmulpq(int[] arr) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int i = 0; i < arr.length; i++){
            pq.add(arr[i]);
        }
        System.out.println(pq);
        int ans = 1, count = 0;
        while(!pq.isEmpty() && count < 4){
            ans = ans * pq.element();
            pq.remove();
            count++;
        }
        System.out.println(ans);

    }

    private static void printmul4(int[] array) {
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
        int i = 0;
        int mul = 1;
        while (i < 4) {
            mul = array[i] * mul;
            i++;
        }
        System.out.println(mul);


    }

    private static void print3largest(int[] arr, int n) {
        int first, second, third;
        first = second = third = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            if (arr[i] > first) {
                third = second;
                second = first;
                first = arr[i];
            } else if (arr[i] > second) {
                third = second;
                second = arr[i];
            } else if (arr[i] > third) {
                third = arr[i];
            }
        }
        System.out.println(first);
        System.out.println(second);
        System.out.println(third);

    }
}
