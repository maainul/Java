package interviewQuestions;

public class FindMaximumAndMinimum {
    public static void main(String[] args) {
        int[] arr = {9,21,9,3,78,90};
        findMaxAndMin(arr);
    }

    private static void findMaxAndMin(int[] arr) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(int i : arr){
            if (i > max){
                max = i;
            }
            if (i < min){
                min = i;
            }
        }
        System.out.println("Max value = "+ max+","+ "Min Value = "+ min);
    }
}
