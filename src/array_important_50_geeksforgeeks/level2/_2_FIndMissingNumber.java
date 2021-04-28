package array_important_50_geeksforgeeks.level2;

public class _2_FIndMissingNumber {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3,4, 5,7};
        int res = findMissing(arr);
        System.out.println(res);

    }

    private static int findMissing(int[] arr) {
        int n = arr.length+1;
        int total = n * (n+1)/2;
        for (int i : arr) {
            total -= i;
        }
        return total;
    }
}
