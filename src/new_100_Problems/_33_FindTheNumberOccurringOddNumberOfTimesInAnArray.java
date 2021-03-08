package new_100_Problems;

import java.util.HashMap;

public class _33_FindTheNumberOccurringOddNumberOfTimesInAnArray {
    public static void main(String[] args) {
        int array[] = new int[]{20, 40, 50, 40, 50, 20, 30, 30, 50, 20, 40, 40, 20};
        findOddOccur(array);
    }

    private static int findOddOccur(int[] array) {
        HashMap<Integer, Integer> elements = new HashMap<>();
        for (int i = 0; i < array.length; i++){
            int element = array[i];
            if (elements.get(element) == null){
                elements.put(element,1);
            }else {
                elements.put(element,elements.get(element)+1);
            }
        }
        return 0;
    }
}
