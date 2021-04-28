package array_important_50_geeksforgeeks.level2;

public class _8_FirstNonRepeatingElementInAnArrayOfIntegers {
    public static void main(String[] args) {
        int arr[] = {10, 5, 3, 4, 3, 5, 6};
        int res2 = firstRepeating(arr);
        System.out.println(res2);
    }

    private static int firstRepeating(int[] arr) {
        int max = Integer.MIN_VALUE;
        for (int i : arr) {
            if (max < i) {
                max = i;
            }
        }

        int freq[] = new int[max + 1];
        for (int i = 0; i < arr.length; i++) {
            freq[arr[i]]++;
        }
        for (int i = 0; i < arr.length; i++) {
            if (freq[arr[i]] == 1) {
                return arr[i];
            }
        }
        return 0;

    }
}
