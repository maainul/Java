package dataStructureAndAlgorithm._1_array.sorting._9_SortElementsByFrequency;

import java.util.*;

public class ShortByFreq {
    public static void main(String[] args) {
        int[] array = {4, 4, 2, 2, 2, 2, 3, 3, 1, 1, 6, 7, 5};
        int[] result = frequencySort(array);
        System.out.println(Arrays.toString(result));
    }

    private static int[] frequencySort(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        List<Integer> list = new ArrayList<>();

        for (int num : nums) {
            if (map.containsKey(num)) {
                map.put(num, map.get(num) + 1);
            } else {
                map.put(num, 1);
            }
            list.add(num);
        }

        list.sort((a, b) -> {
            if (map.get(a).equals(map.get(b))) {
                return a.compareTo(b);
            } else if (map.get(a) < map.get(b)) {
                return +1;
            }
            return -1;


            // return map.get(a) - map.get(b);
        });
        for (int i = 0; i < list.size(); i++) {
            nums[i] = (Integer) list.get(i);
        }
        return nums;
    }
}

// [2, 2, 2, 2, 1, 1, 3, 3, 4, 4, 5, 6, 7]

