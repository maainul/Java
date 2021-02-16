package dataStructureAndAlgorithm.geekforgeeks._2_arrangementRearrangement;

public class _12_DoubleFIrstElement {
    public static void main(String[] args) {


        int arr[] = {0, 2, 2, 2, 0, 6, 6, 0, 0, 8};
        int n = arr.length;

        System.out.print("Original array: ");
        printArray(arr, n);

        modifyAndRearrangeArr(arr, n);

        System.out.print("Modified array: ");
        printArray(arr, n);

    }

    private static void modifyAndRearrangeArr(int[] arr, int n) {
        if (n == 1){
            return;
        }


        for (int i = 0; i < n-2; i++){
            if ((arr[i] != 0) && (arr[i] == arr[i+1])){
                arr[i] = arr[i] * 2;

                arr[i+1]= 0;
                i++;
            }
        }

        pushZerosToEnd(arr, n);

    }

    private static void pushZerosToEnd(int[] arr, int n) {
        int index = 0;
        for (int i = 0; i <n; i++){
            if (arr[i] != 0){
                arr[index] = arr[i];
                index++;
            }
        }
        for (int i = index; i <n; i++){
            arr[i] = 0;
        }
    }

    // function to print the array elements
    static void printArray(int arr[], int n)
    {
        for (int i = 0; i < n; i++)
            System.out.print(arr[i] + " ");
        System.out.println();
    }
}
