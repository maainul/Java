package interviewQuestions;

import java.util.HashSet;
import java.util.Set;

public class _PariUsing {
    public static void main(String[] args) {
        int arr[] = {17,9,5,3,11,7,1};
        parirsum(arr,12);
    }

    private static void parirsum(int[] arr, int n) {
        Set<Integer> set = new HashSet<>();
        for(int i = 0; i < arr.length; i++){
            int target = n - arr[i];

            if (!set.contains(target)){
                set.add(arr[i]);
            }else {
                System.out.println(target +"----"+arr[i]);
            }
        }
    }
}
