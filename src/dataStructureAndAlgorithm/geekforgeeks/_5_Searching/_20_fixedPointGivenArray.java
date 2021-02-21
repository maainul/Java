package dataStructureAndAlgorithm.geekforgeeks._5_Searching;

public class _20_fixedPointGivenArray {
    public static void main(String[] args) {
        int[] arr = {-10, -1, 0, 3, 10, 11, 30, 50, 100};
        int n = arr.length;
        System.out.println(printRepeatingBinarySearch(arr, 0, n - 1));
    }

    private static int printRepeatingBinarySearch(int[] arr, int low, int high) {
        if (low > high) {
            return -1;
        }
        int mid = (low + high) / 2;
        if (mid == arr[mid]) {
            return mid;
        }
        if (mid < arr[mid]) {
            return printRepeatingBinarySearch(arr, low, mid - 1);
        }
        return printRepeatingBinarySearch(arr, mid + 1, high);
    }
}
