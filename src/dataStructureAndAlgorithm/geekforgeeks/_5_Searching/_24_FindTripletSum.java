package dataStructureAndAlgorithm.geekforgeeks._5_Searching;

public class _24_FindTripletSum {
    public static void main(String[] args) {
        int A[] = { 1, 4, 45, 6, 10, 8 };
        int sum = 22;
        int arr_size = A.length;
        find3Numbers(A, arr_size, sum);
    }

    private static void find3Numbers(int[] a, int arr_size, int sum) {
        for (int i = 0; i < arr_size; i++){
            for (int j = i + 1; j < arr_size; j++){
                for (int k = j + 1; k < arr_size; k++){
                    if (a[i] + a[j] + a[k] == sum){
                        System.out.println("Triplet sum index is "+ i +" "+ j+ " "+k);
                    }
                }
            }
        }

    }
}
