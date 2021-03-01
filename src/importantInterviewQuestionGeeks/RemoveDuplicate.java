package importantInterviewQuestionGeeks;

import java.util.Arrays;

public class RemoveDuplicate {
    public static void main(String[] args) {
        int a[] = { 5, 2, 6, 8, 6, 7, 5, 2, 8 };
        int n = a.length;

        int[] count = new int[a.length];

        for (int i = 0; i < a.length; i++){

            if (count[a[i]] > 0){
                System.out.println(a[i]);
                a[i] = 0;
            }
            count[a[i]]++;
        }
        System.out.println(Arrays.toString(a));

    }
}
