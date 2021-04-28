package array_important_50_geeksforgeeks.level2;

import java.util.HashSet;
import java.util.Set;

public class _6_FindCommonElementsInThreeSortedArrays {
    public static void main(String[] args) {
        int ar1[] = {1, 5, 10, 20, 40, 80};
        int ar2[] = {6, 7, 20, 80, 100};
        int ar3[] = {3, 4, 15, 20, 30, 70, 80, 120};
        findCommon(ar1, ar2, ar3);
    }

    private static void findCommon(int[] ar1, int[] ar2, int[] ar3) {
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < ar1.length; i++) {
            set.add(ar1[i]);
        }
        Set<Integer> set2 = new HashSet<>();
        for (int i = 0; i < ar2.length; i++) {
            if (set.contains(ar2[i])) {
                set2.add(ar2[i]);
            }
        }
        for (int i = 0; i < ar3.length; i++) {
            if (set2.contains(ar3[i])) {
                System.out.println(ar3[i]);
            }
        }


    }
}
