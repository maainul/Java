package array_important_50_geeksforgeeks.level1;

public class _7_Sorted_0_1_2 {
    public static void main(String[] args) {
        int[] arr = {0,1,2,0,1,2,2,1,0};
        int[] result = dutchNationalProblem(arr);
       printArray(result);
    }


    private static void printArray(int[] result) {
        for (int element : result){
            System.out.print(element);
        }
    }


    private static int[] dutchNationalProblem(int[] arr) {
        int low = 0;
        int mid = 0;
        int high = arr.length -1;
        int temp = 0;
        while(mid <= high){
            switch (arr[mid]){
                case 0:
                    temp = arr[low];
                    arr[low] = arr[mid];
                    arr[mid] = temp;
                    low++;
                    mid++;
                    break;
                case 1:
                    mid++;
                    break;
                case 2 :
                    temp = arr[mid];
                    arr[mid] = arr[high];
                    arr[high] = temp;
                    high--;
                    break;
            }
        }

        return arr;
    }

}
