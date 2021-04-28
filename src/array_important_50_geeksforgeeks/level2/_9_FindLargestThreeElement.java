package array_important_50_geeksforgeeks.level2;

public class _9_FindLargestThreeElement {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 6,100,300 };
        findThreeLargest(arr);
    }

    private static void findThreeLargest(int[] arr) {
        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;
        int third = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++){
            if (arr[i] > first){
                third = second;
                second = first;
                first = arr[i];
            }
            else if (arr[i] > second){
                third = second;
                second = arr[i];
            }
            else {
                third = arr[i];
            }
        }
        System.out.println(first+"----"+second+"------"+third);
    }
}
