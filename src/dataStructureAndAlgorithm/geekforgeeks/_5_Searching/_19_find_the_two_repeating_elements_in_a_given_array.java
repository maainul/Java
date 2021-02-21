package dataStructureAndAlgorithm.geekforgeeks._5_Searching;

public class _19_find_the_two_repeating_elements_in_a_given_array {
    public static void main(String[] args) {
        int[] arr = {4, 2, 4, 5, 2, 3, 1};
        int arr_size = arr.length;
        printRepeating(arr, arr_size);

    }

    private static void printRepeating(int[] arr, int size) {
        int i, j;
        System.out.println("Repeated Elemetns are");
        for (i = 0; i < size; i++) {
            for (j = i + 1; j < size; j++) {
                if (arr[i] == arr[j]) {
                    System.out.println(arr[i]);
                }
            }
        }
    }


}
