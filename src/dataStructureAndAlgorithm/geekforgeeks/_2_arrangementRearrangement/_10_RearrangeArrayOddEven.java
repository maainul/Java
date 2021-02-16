package dataStructureAndAlgorithm.geekforgeeks._2_arrangementRearrangement;

import java.util.Arrays;

public class _10_RearrangeArrayOddEven {
    public static void main(String[] args) {
        int A[] = { 1, 3, 2, 2, 5 };
        int n = A.length;
        assign(A, n);
    }

    private static void assign(int[] a, int n) {
        Arrays.sort(a);
        int p = 0;
        int q = a.length-1;
        int[] ans = new int[a.length];
        for (int i = 0; i < n; i++){
            // even
            if ((i +1) % 2 == 0){
                ans[i] = a[q--];
            }else {
                ans[i] = a[p++];
            }
        }
        System.out.println(Arrays.toString(ans));
    }
}
