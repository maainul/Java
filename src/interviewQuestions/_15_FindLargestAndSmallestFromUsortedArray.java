package interviewQuestions;

public class _15_FindLargestAndSmallestFromUsortedArray {
    public static void main(String[] args) {
        int[] arr = {20, 34, 55, -1, -34, 17};
        findLargestAndSmallest(arr);
    }

    private static void findLargestAndSmallest(int[] arr) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int i : arr) {
            if (i > max) {
                max = i;
            } else if (i < min) {
                min = i;
            }
        }
        System.out.println("Max value is = " + max);
        System.out.println("Min value is = " + min);
    }
}
