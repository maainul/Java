package interviewQuestions;

import java.util.Arrays;

public class _14_RemoveDuplicateFromArray {
    public static void main(String[] args) {
        int[] arr = {1,2,2,3,4,4,5,6,7,7};
        removeDuplicate(arr);

    }

    private static void removeDuplicate(int[] arr) {
        int index = 0;
        for(int i = 1; i < arr.length; i++){
            if (arr[index] != arr[i]){
                index++;
                arr[index] = arr[i];
            }
        }
        for (int i = 0; i < index+1; i++){
            System.out.print(arr[i]);
        }
    }

}
