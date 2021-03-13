package interviewQuestions;

import java.util.HashMap;
import java.util.Map;

public class _CountFrequencyOfArray {
    public static void main(String[] args) {
        int[] arr = {11, 12, 45, 67, 22, 12, 10, 13, 67, 14, 11};
        countFreq(arr);
    }

    private static void countFreq(int[] arr) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i< arr.length; i++){
            if (map.containsKey(arr[i])){
                map.put(arr[i], map.get(arr[i])+1);
            }else {
                map.put(arr[i],1);
            }
        }

        for (Map.Entry<Integer,Integer> entry : map.entrySet()){
            System.out.println(entry.getKey()+"-----"+ entry.getValue());
        }
    }

}
