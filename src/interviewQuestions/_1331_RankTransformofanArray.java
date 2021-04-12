package interviewQuestions;

import java.util.*;

public class _1331_RankTransformofanArray {
    public static void main(String[] args) {
        int[] arr = {100,100,100};
        int[] result = randFinder(arr);
        System.out.println(Arrays.toString(result));
    }


    private static int[] randFinder(int[] arr) {
        int[] nar = new int[arr.length];

        int index = 0;
        for(int i : arr){
            nar[index++] = i;
        }

        Arrays.sort(nar);

        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < nar.length; i++){
            if (!map.containsKey(nar[i])){
                map.put(nar[i],i+1);
            }else {
                nar[i]= 0;
            }
        }

        index = 0;
        int[] result = new int[arr.length];
        for(int i = 0; i <arr.length; i++){
            result[i] = map.get(arr[i]);
        }
        return result;
    }
}
