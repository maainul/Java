package quiz_2021_March;

import java.util.Arrays;

public class _6_Program_1_N_PrimeArrangeMent {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};

        permutation(arr, 0, arr.length - 1);

        primeArrangement(12);
    }


    private static void permutation(int[] arr, int left, int right) {
        if (left == right) {
            System.out.println(Arrays.toString(arr));
        } else {
            for (int i = left; i <= right; i++) {
                arr = swap(arr, left, i);
                permutation(arr, left + 1, right);
                arr = swap(arr, left, i);
            }
        }

    }

    private static int[] swap(int[] ch, int left, int right) {

        int temp = ch[left];
        ch[left] = ch[right];
        ch[right] = temp;
        return ch;
    }



    private static void primeArrangement(int number) {
        int i,j;
        boolean isPrime;
        for (i = 1; i <=number;i++){
            isPrime = true;
            for ( j = 2; j <= i/2; j++){
                if (i % j == 0){
                    isPrime = false;
                    break;
                }
            }
            if (isPrime){
                System.out.println(i+" ");
            }
        }
    }
}
