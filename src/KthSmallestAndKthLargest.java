import java.util.Arrays;

public class KthSmallestAndKthLargest {
    public static void main(String[] args) {
        int[] arr = {7, 10, 4, 3, 20, 15};
        int res = findKthSmallest(arr,3);
        System.out.println(res);
        int max = findKthLargest(arr,3);
        System.out.println(max);
    }

    private static int findKthLargest(int[] arr,int k) {
        Arrays.sort(arr);

        return arr[k-1];
    }

    private static int findKthSmallest(int[] arr, int k) {
        Arrays.sort(arr);
            return 0;
    }
}
