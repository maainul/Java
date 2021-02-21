package dataStructureAndAlgorithm.geekforgeeks._5_Searching;

public class _21_FindSubarrayWIthGivenSum {
    public static void main(String[] args) {
        int[] a = {1, 4, 20, 3, 10, 5};
        findSubarray(a, 33);
    }

    private static void findSubarray(int[] a, int result) {

        for (int i = 0; i < a.length; i++) {
            int sum = 0;
            for (int j = i; j < a.length; j++) {
                sum = sum + a[j];
                if (sum == result){
                    System.out.println("index ="+ i+"--to---"+j);
                }
            }
        }
    }
}
