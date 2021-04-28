package interviewQuestions;

public class _Sorted_0_1_2 {
    public static void main(String[] args) {
        int[] arr = {0,1,2,0,1,2,2,1,0};
        int[] result = dutchNationalProblem(arr);
       printArray(result);
    }


    private static void printArray(int[] result) {
        for (int element : result){
            System.out.println(element);
        }
    }


    private static int[] dutchNationalProblem(int[] arr) {
        int low = 0;
        int mid = 0;
        int high = arr.length -1;
        while(mid <= high){
            switch (arr[mid]){
                case 0:
                    swap(arr[low], arr[mid]);
                    low++;
                    mid++;
                    break;
                case 1:
                    mid++;
                    break;
                case 2 :
                    swap(arr[mid], arr[high]);
                    high--;
                    break;

            }
        }

        return arr;
    }

    private static void swap(int left, int right) {
        int temp = left;
        left = right;
        right = temp;
    }

}
