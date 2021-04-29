package array_important_50_geeksforgeeks.level1;

public class _2_FindMaximumAndMinimumElement {
    public static void main(String[] args) {
        int arr[] = { 02, 5, 2, 4, 9, 3, 1, 7, 3, 11, 12, 3};
        findMaxAndMin(arr);

    }

    private static void findMaxAndMin(int[] arr) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int i : arr){
            if (i > max){
                max = i;
            }
            if (i < min){
                min = i;
            }
        }
        System.out.println("Min element = "+ min +" "+"Max Element = "+max);
    }

}
