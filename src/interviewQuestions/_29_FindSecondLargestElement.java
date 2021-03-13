package interviewQuestions;

public class _29_FindSecondLargestElement {
    public static void main(String[] args) {
        int[] arr = {12,3,45,32,1,67,89};
        System.out.println(secondLargest(arr));

    }

    private static int secondLargest(int[] arr) {
        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;
        for (int j : arr) {
            if (j > first) {
                second = first;
                first = j;
            } else if (j > second) {
                second = j;
            }
        }
        return second;
    }
}
