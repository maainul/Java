package array_important_50_geeksforgeeks.level1;

public class _1_EverySegmentInSizeArray {
    public static void main(String[] args) {
        int arr[] = { 0, 5, 2, 4, 9, 3, 1, 7, 3, 11, 12, 3};
        int k = 3, x= 3;
        boolean res = segmentedArray(arr,k,x);
        if (res){
            System.out.println("Yes");
        }else {
            System.out.println("No");
        }
    }

    private static boolean segmentedArray(int[] arr,int k,int x) {
        boolean foundX = false;
        for (int i = 0; i < arr.length; i++){
            for (int j = i; j < k; j++){
                if (arr[j] == x){ foundX = true; }
            }
            if (!foundX){ return false; }
        }
        return true;
    }
}
