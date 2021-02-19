package dataStructureAndAlgorithm.geekforgeeks._3_OrderStatistics;

import java.util.*;

public class _14KMaximunSumOfCombinationArray {
    public static void main(String[] args) {
        int A[] = { 4, 2, 5, 1 };
        int B[] = { 8, 0, 3, 5 };
        int N = A.length;
        int K = 3;

        // Function Call
        KMaxCombinations(A, B, N, K);
    }

    private static void KMaxCombinations(int[] a, int[] b, int n, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for (int i = 0; i < n; i++){
            for (int j = 0; j < n; j++){
                pq.add(a[i] + b[j]);
            }
        }

        int count = 0;
        while(count < k){
            System.out.println(pq.peek());
            pq.remove();
            count++;
        }
    }

}
