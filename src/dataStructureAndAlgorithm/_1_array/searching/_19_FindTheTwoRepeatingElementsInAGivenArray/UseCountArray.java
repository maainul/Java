package dataStructureAndAlgorithm._1_array.searching._19_FindTheTwoRepeatingElementsInAGivenArray;

public class UseCountArray {

	public static void main(String[] args) {
		int arr[] = { 4, 2, 4, 5, 2, 3, 1 };
		int arr_size = arr.length;
		printRepeating(arr, arr_size);

	}

	private static void printRepeating(int[] arr, int arr_size) {
		int count[] = new int[arr_size];
		int i;
		for (i = 0; i < count.length; i++) {
			if (count[arr[i]] == 1) {
				System.out.println(count[arr[i]]);
				//System.out.println(arr[i]+ " ");
			}else {
				System.out.println(count[arr[i]]);
				count[arr[i]]++;
				
			}
		}
		
	}

}
