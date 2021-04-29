package array_important_50_geeksforgeeks.level2;
// https://www.techiedelight.com/rearrange-array-positive-negative-numbers-alternate-positions/
import java.util.Arrays;

public class _10_RearrangeArrayNegativeAndPositive {
    public static void main(String[] args) {
        int[] A = {-5, -2, 5, 2, 4, 7, 1, 8, 0, -8};
        rearrange(A);
        // print the rearranged array
        System.out.println(Arrays.toString(A));
    }

    private static void rearrange(int[] a) {
        int p = rearrangePositiveAndNegative(a);
        for (int n = 1; (p < a.length && n < p); p++, n += 2) {
            int temp = a[n];
            a[n] = a[p];
            a[p] = temp;
        }
    }

    private static int rearrangePositiveAndNegative(int[] a) {
        int left = 0;
        int right = a.length - 1;
        while (left < right) {
            if (a[left] < 0) {
                left++;
            } else if (a[right] > 0) {
                right--;
            } else {
                int temp = a[left];
                a[left] = a[right];
                a[right] = temp;
                left++;
                right--;
            }
        }

        for (int i = 0; i < a.length; i++) {
            if (a[i] >= 0) {
                return i;
            }
        }
        return 0;
    }

}

