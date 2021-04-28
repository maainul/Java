package array_important_50_geeksforgeeks.level2;

public class _7_FirstRepeatingElementInAnArrayOfIntegers {
    public static void main(String[] args) {
        int arr[] = {10, 5, 3, 4, 3, 5, 6};
        int res = firstRepeatingBruteForce(arr);
        System.out.println(res);
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
            if (freq[arr[i]] >= 2) {
                return arr[i];
            }
        }
        return 0;

    }

    private static int firstRepeatingBruteForce(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    return arr[i];
                }
            }
        }
        return 0;
    }
}
