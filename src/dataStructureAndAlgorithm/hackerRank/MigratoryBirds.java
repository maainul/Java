package dataStructureAndAlgorithm.hackerRank;

import java.util.HashMap;
import java.util.Map;

public class MigratoryBirds {
    public static void main(String[] args) {
        int birds[] = {10,3,4,5,4,3,2,10,3,4};
        System.out.println(migrationBird(birds));

    }

    private static int migrationBird(int[] birds) {

        HashMap<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i <birds.length; i++) {
            if (map.containsKey(birds[i])) {
                map.put(birds[i], map.get(birds[i]) + 1);
            } else {
                map.put(birds[i], 1);
            }
            }
            int max = Integer.MIN_VALUE;

            for (Map.Entry<Integer,Integer> e : map.entrySet()){
                System.out.println(e.getKey() +" "+ e.getValue());
                if (max < e.getValue()){
                    max = e.getValue();
                }
            }
            for (Map.Entry<Integer,Integer> e : map.entrySet()) {
                if (max == e.getValue()) {
                    return e.getKey();
                }
            }
        return 0;
    }
}
