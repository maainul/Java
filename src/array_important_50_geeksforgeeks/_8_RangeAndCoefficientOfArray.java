package array_important_50_geeksforgeeks;

public class _8_RangeAndCoefficientOfArray {
    public static void main(String[] args) {
        int arr[] = {02, 5, 2, 4, 9, 3, 1, 7, 3, 11, 12, 3};
        int res = findCoefficent(arr);
        System.out.println(res);
    }

    private static int findCoefficent(int[] arr) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int i : arr) {
            if (i > max) {
                max = i;
            }
            if (i < min) {
                min = i;
            }
        }
        return ((max - min) / (max + min));
    }
}

