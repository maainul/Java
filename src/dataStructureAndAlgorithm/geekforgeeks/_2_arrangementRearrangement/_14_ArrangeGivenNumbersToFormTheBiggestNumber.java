package dataStructureAndAlgorithm.geekforgeeks._2_arrangementRearrangement;

import java.util.*;

public class _14_ArrangeGivenNumbersToFormTheBiggestNumber {
    public static void main(String[] args) {
        List<String> arr = new ArrayList<>();
        arr.add("54");
        arr.add("546");
        arr.add("548");
        arr.add("60");
        printLargest(arr);
    }

    private static void printLargest(List<String> arr) {
        Collections.sort(arr, new Comparator<String>() {
            @Override
            public int compare(String x, String y) {
                String xy = x + y;
                String yx = y +x;
                return -xy.compareTo(yx);
            }
        });

        System.out.println(arr);

        Iterator iterator = arr.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next());
        }

    }
}
