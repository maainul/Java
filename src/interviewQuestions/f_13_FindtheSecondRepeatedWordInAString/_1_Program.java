
package interviewQuestions.f_13_FindtheSecondRepeatedWordInAString;

import java.util.HashMap;

import java.util.Map;

/**
 * @author mainul Nov 19, 2020
 */
public class _1_Program {

    public static void main(String[] args) {
        String[] A = {"aaa", "bb", "bb", "aaa", "aaa", "c"};
        //System.out.println("String with second highest frequency is: " + stringWithSecondHighestFrequency(A));
        System.out.println(stringSecond(A));

    }

    private static String stringSecond(String[] a) {
        Map<String, Integer> map = new HashMap<>();
        for (String s : a) {
            if (map.containsKey(s)) {
                map.put(s, map.get(s) + 1);
            } else {
                map.put(s, 1);
            }
        }
        // find the second highest frequency
        int highest_frequency = 0;
        int second_higest_frequency = 0;

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (entry.getValue() > highest_frequency) {
                second_higest_frequency = highest_frequency;
                highest_frequency = entry.getValue();
            } else if (second_higest_frequency < entry.getValue()) {
                second_higest_frequency = entry.getValue();
            }
        }
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (entry.getValue() == second_higest_frequency) {
                return entry.getKey();
            }
        }
        return null;
    }

    private static String stringWithSecondHighestFrequency(String[] a) {
        // 1. Create Hash Map
        HashMap<String, Integer> hashMap = new HashMap<>();

        for (String s : a) {

            // Fetch how many times this string repeated
            Integer occuranceInteger = hashMap.get(s);

            // if not repeated then put 1 otherwise put repetition+1;
            hashMap.put(s, (occuranceInteger == null) ? 1 : occuranceInteger + 1);
        }

        // find the second highest frequency
        int highest_frequency = 0;
        int second_higest_frequency = 0;

        for (Map.Entry<String, Integer> entry : hashMap.entrySet()) {
            highest_frequency = Math.max(highest_frequency, entry.getValue());

            if (second_higest_frequency < entry.getValue() && entry.getValue() < highest_frequency) {
                second_higest_frequency = entry.getValue();
            }
        }

        for (Map.Entry<String, Integer> entry : hashMap.entrySet()) {
            if (entry.getValue() == second_higest_frequency) {
                return entry.getKey();
            }
        }

        return null;
    }

}
