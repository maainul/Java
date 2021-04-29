package array_important_50_geeksforgeeks.level1;

public class _6_FindOccurrenceOfAGivenNumber {
    public static void main(String[] args) {
        int arr[] = { 02, 5, 2, 4, 9, 3, 1, 7, 3, 11, 12, 3};
        int x = 2;
        int res = findOccurance(arr,x);
        System.out.println(res);

    }

    private static int findOccurance(int[] arr, int x) {
        int count = 0;
        for(int i : arr){
            if (i == x){
                count++;
            }
        }
        return count;
    }
}
