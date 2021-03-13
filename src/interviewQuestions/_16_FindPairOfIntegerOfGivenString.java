package interviewQuestions;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class _16_FindPairOfIntegerOfGivenString {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 10, 5, 6, 10, 7, 8};
        findPairOfGivenSum(arr, 15);

        System.out.println("--------------");
        findPairUsingSet(arr, 15);
        System.out.println("--------------");
        findPairUsingSetII(arr,15);

        System.out.println("--------------");
        findPairUsingSorting(arr, 15);


    }

    private static void findPairOfGivenSum(int[] arr, int result) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == result) {
                    System.out.println(arr[i] + " " + arr[j]);
                }
            }
        }
    }


    private static void findPairUsingSet(int[] numbers, int n) {
        if (numbers.length < 2) {
            return;
        }
        Set<Integer> set = new HashSet<>(numbers.length);
        for (int value : numbers){
            set.add(value);
        }
        for (int value : numbers) {
            int target = n - value; // if target number is not in set then add
            if (set.contains(target)) {
                System.out.printf("(%d, %d) %n", value, target);
            }
        }
        // Read more: https://javarevisited.blogspot.com/2014/08/how-to-find-all-pairs-in-array-of-integers-whose-sum-equal-given-number-java.html#ixzz6oPhF3sYh
    }

    private static void findPairUsingSetII(int[] numbers, int n){
        Set<Integer> set = new HashSet<>();
        for (int i : numbers)
        {
            int target = n - i;
            if (!set.contains(target)){
                set.add(i);
            }else {
                System.out.println(i +" "+target);
            }
        }
    }


    private static void findPairUsingSorting(int[] arr, int sum) {
        Arrays.sort(arr);
        int left = 0;
        int right = arr.length - 1;
        for (int i : arr) {
            if (arr[left] + arr[right] == sum) {
                System.out.println(arr[left] + " " + arr[right]);
            }
            if (arr[left] + arr[right] > sum) {
                right--;
            } else {
                left++;
            }
        }
    }


}
