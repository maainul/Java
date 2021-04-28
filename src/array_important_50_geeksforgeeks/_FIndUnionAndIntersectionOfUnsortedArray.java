package array_important_50_geeksforgeeks;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class _FIndUnionAndIntersectionOfUnsortedArray {
    public static void main(String[] args) {
        int arr1[] = {7, 1, 5, 2, 3, 6};
        int arr2[] = {3, 8, 6, 20, 7};
        
        findUnion(arr1,arr2);
        System.out.println("\nIntersection = ");
        findIntersection(arr1,arr2);
    }

    private static void findUnion(int[] arr1, int[] arr2) {
        Map<Integer,Integer> map = new HashMap<>();
        for (int i  = 0; i < arr1.length; i++){
            map.put(arr1[i], i);
        }
        for (int i = 0; i < arr2.length; i++){
            map.put(arr2[i],i );
        }

        System.out.println("The Union of Both Arrays = ");
        for (Map.Entry entry : map.entrySet()){
            System.out.print(entry.getKey()+" ");
        }
    }

    private static void findIntersection(int[] arr1, int[] arr2) {
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < arr1.length; i++){
            set.add(arr1[i]);
        }
        for (int i = 0;i < arr2.length; i++){
            if (set.contains(arr2[i])){
                System.out.print(arr2[i] + " ");
            }
        }
    }
}
