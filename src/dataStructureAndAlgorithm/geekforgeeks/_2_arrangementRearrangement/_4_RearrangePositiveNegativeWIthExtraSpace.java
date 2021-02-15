package dataStructureAndAlgorithm.geekforgeeks._2_arrangementRearrangement;

/*
 * first take a temp array and store value from d to n
 * 	[3,4,5,6,7]
 * 	
 * then copy first two element
 * 
 * [3,4,5,6,7,1,2]
 * 
 *
 */
import java.util.Arrays;

public class _4_RearrangePositiveNegativeWIthExtraSpace {

	private static void rearrangeArray(int[] arr, int n, int d) {

		int[] positiveArray = new int[4];
		int[] negativeArray = new int[2];
		int posIndex = 0;
		int negIndex = 0;
		for (int i = 0; i < n; i++){
			if (arr[i] > 0){
				positiveArray[posIndex] = arr[i];
				posIndex++;
			}
			else{
				negativeArray[negIndex] = arr[i];
				negIndex++;
			}
		}
		System.out.println(Arrays.toString(positiveArray));
		System.out.println(Arrays.toString(negativeArray));
		System.out.println(Arrays.toString(arr));
	}

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, -4, -1, 4};

		int n = arr.length;
		int d = 2;
		rearrangeArray(arr, n, d);

	}

}
