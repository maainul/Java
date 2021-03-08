package new_100_Problems;

public class _29_FindSecondLargestElement {
    public static void main(String[] args) {
        int[] arr = {12,3,45,32,1,67,89};
        System.out.println(secondLargest(arr));

    }

    private static int secondLargest(int[] arr) {
        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++){
            if (arr[i] > first){
                second = first;
                first = arr[i];
            }
            else if (arr[i] > second){
                second = arr[i];
            }
        }
        return second;
    }
}
