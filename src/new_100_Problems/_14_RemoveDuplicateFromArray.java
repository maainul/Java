package new_100_Problems;

import java.util.Arrays;

public class _14_RemoveDuplicateFromArray {
    public static void main(String[] args) {
        int[] arr = {1,2,2,3,4,4,5,6,7,7};
        System.out.println(removeDuplicate(arr));
        System.out.println(Arrays.toString(arr));
    }

    private static int removeDuplicate(int[] arr) {
        int index = 0;
        for(int i = 1; i < arr.length; i++){
            if (arr[index] != arr[i]){
                index++;
                arr[index] = arr[i];
            }
        }
        return index+1;
    }

}
