package dataStructureAndAlgorithm.geekforgeeks.optimizedProblem;

public class KadaneAlgorithm {
    public static void main(String[] args) {
        int[] a = {-2, -3, 4, -1, -2, 1, 5, -3};
        System.out.println("Maximum contiguous sum is " + maxSubArraySum(a));
        System.out.println("Maximum contiguous sum is " + maxSubArraySumOptimized(a));

    }

    private static int maxSubArraySumOptimized(int[] a) {
        int meh  = 0, msf =0, n = a.length;
        for (int j : a) {
            meh = msf + j;
            if (meh < 0){
                meh = 0;
            }
            else if (msf < meh){
                msf = meh;
            }
        }

        return msf;
    }

    private static int maxSubArraySum(int[] a) {
        int meh = 0,start = 0, end = 0,s= 0,e=0;
        int msf = 0;
        int n = a.length;
        for (int i = 0; i < n; i++) {
            meh = meh + a[i];
            if (msf < meh) {
                msf = meh;
                start = s;
                end = i;

            } else if (meh < 0) {
                meh = 0;
                s = i +1;
            }
        }
        System.out.println("Starting index " + start);
        System.out.println("Ending index " + end);
        return msf;
    }
}
