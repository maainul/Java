package interviewQuestions;

public class Array_RotedSortedMinimumValue {
    public static void main(String[] args) {
        int[] arr = {4, 5, 6, 7, 1, 2};
        System.out.println(findMinimum(arr));
    }

    private static int findMinimum(int[] arr) {
        return findMinimum(arr, 0, arr.length - 1);
    }

    private static int findMinimum(int[] arr, int left, int right) {
        if (left == right) {
            return arr[left];
        }
        if (right - left == 1) {
            return Math.min(arr[left], arr[right]);
        }

        int middle = left + (right - left) / 2;

        // not roted
        if (arr[left] < arr[right]) {
            return arr[left];
        }
        // got to right side
        else if (arr[left] < arr[middle]) {
            return findMinimum(arr, middle, right);
        } else {
            return findMinimum(arr, left, middle);
        }
    }
}
