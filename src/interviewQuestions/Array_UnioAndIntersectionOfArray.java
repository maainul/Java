package interviewQuestions;

import java.util.HashMap;
import java.util.Map;

public class Array_UnioAndIntersectionOfArray {
    public static void main(String[] args) {
        int a[] = { 1, 2, 5, 6, 2, 3, 5 };
        int b[] = { 2, 4, 5, 6, 8, 9, 4, 6, 5 };

        printUnion(a, 7, b, 9);
    }

    private static void printUnion(int[] a, int m, int[] b, int n) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0;i < m; i++){
            map.put(a[i], i);
        }
        for (int j = 0; j < n; j++){
            map.put(b[j], j);
        }

        for (Map.Entry<Integer,Integer> entry : map.entrySet()){
            System.out.print(entry.getKey()+" ");
        }



    }
}
