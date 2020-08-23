package dataStructureAndAlgorithm._1_array.sorting._5_MagreAnArrayofNInM;

import java.util.Arrays;

public class Method2 {

	public static void main(String[] args) {
		int mPlusN[] = {2,8,13,15,20,0,0,0,0}; 
        int N[] = {5, 7, 9, 25}; 
        int m = 5;
        int n = 4;
        mergeMandN(mPlusN,N,m,n);
        
        // test case error
        // problem with current >0 and current >= 0
        // current >= 0 dile error ase

	}

	private static void mergeMandN(int[] bigArray,int[] smallArray,int m, int n) {
		// bigArray is supposed to have enough capacity to hold m + n elements.
	    int currentIndex = (m + n) - 1;
	    int bigArrayIndex = m - 1;
	    int smallArrayIndex = n - 1;
	    while (currentIndex > 0) {
	        if (bigArray[bigArrayIndex] > smallArray[smallArrayIndex]) {
	            bigArray[currentIndex] = bigArray[bigArrayIndex];
	            --bigArrayIndex;
	        }
	        else {
	            bigArray[currentIndex] = smallArray[smallArrayIndex];
	            --smallArrayIndex;
	        }
	        --currentIndex;
	    }
		System.out.println(Arrays.toString(bigArray));
		
	}

}
