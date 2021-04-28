package array_important_50_geeksforgeeks.level2;

import java.util.HashMap;
import java.util.Map;

public class _3_CountPairWithGivenSum {
    public static void main(String[] args) {
        int arr[] = {1, 5, 7, 3, -1, 3};
        int sum = 6;
        int res = foundPairWithBruteForce(arr, sum);
        System.out.println(res);
        int res2 = foundPair(arr, sum);
        System.out.println(res2);
    }

    private static int foundPair(int[] arr, int sum) {

        // Returns number of pairs in arr[0..n-1] with sum equal
        // to 'sum'
        int n = arr.length;
        Map<Integer, Integer> hm = new HashMap<>();

        // Store counts of all elements in map hm
        for (int i = 0; i < n; i++) {

            // initializing value to 0, if key not found
            if (!hm.containsKey(arr[i]))
                hm.put(arr[i], 0);

            hm.put(arr[i], hm.get(arr[i]) + 1);
        }
        int twice_count = 0;

        // iterate through each element and increment the
        // count (Notice that every pair is counted twice)
        for (int i = 0; i < n; i++) {
            if (hm.get(sum - arr[i]) != null)
                twice_count += hm.get(sum - arr[i]);

            // if (arr[i], arr[i]) pair satisfies the
            // condition, then we need to ensure that the
            // count is decreased by one such that the
            // (arr[i], arr[i]) pair is not considered
            if (sum - arr[i] == arr[i])
                twice_count--;
        }

        // return the half of twice_count
        return twice_count / 2;
    }

    private static int foundPairWithBruteForce(int[] arr, int sum) {
        int count = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i] + arr[j] == sum) {
                    count++;
                }
            }
        }
        return count;
    }
}
