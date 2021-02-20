package dataStructureAndAlgorithm.geekforgeeks._3_OrderStatistics;
import java.util.*;
public class KthELement {
    public static void main(String[] args) {
        int arr[] = {3, 1, 4, 4, 5, 2, 6, 1};
        kthelecount(arr);
    }
    private static void kthelecount(int[] arr) {
        Map<Integer, Integer> map = new HashMap<>();
        int n = arr.length;
        for (int j : arr) {
           map.put(j, map.getOrDefault(j,0)+1);
        }
        List<Map.Entry<Integer, Integer>> list = new ArrayList<>(map.entrySet());
        list.sort((l1, l2) -> l2.getValue().compareTo(l1.getValue()));
        System.out.println(list);
        int i = 0;
        while (i < 3){
            System.out.println(list.get(i));
            i++;
        }
    }
}
