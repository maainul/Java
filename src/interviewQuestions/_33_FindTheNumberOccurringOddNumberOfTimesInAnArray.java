package interviewQuestions;

import java.util.HashMap;
import java.util.Map;

public class _33_FindTheNumberOccurringOddNumberOfTimesInAnArray {
    public static void main(String[] args) {
        int[] array = new int[]{20, 40, 50, 40, 50, 20, 30, 30, 50, 20, 40, 40, 20};
        findOddOccur(array);
    }

    private static void findOddOccur(int[] array) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i : array) {
            if (!map.containsKey(i)) {
                map.put(i, map.get(i) + 1);
            } else {
                map.put(i, 1);
            }
        }

        for (Map.Entry<Integer,Integer> entry : map.entrySet()){
            System.out.println(entry.getKey());
        }


    }
}
