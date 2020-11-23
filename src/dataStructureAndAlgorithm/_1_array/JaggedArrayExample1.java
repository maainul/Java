package dataStructureAndAlgorithm._1_array;

public class JaggedArrayExample1 {

	public static void main(String[] args) {
		int n = 5;

		// Declaring 2-D array with 5 row.
		int arr[][] = new int[n][];

		// Creating a 2-D array such that
		// First row 1 element
		// Second row 2 element
		// third row 3 element
		// Fourth row 4 element
		// Fifth row 5 element

		for (int i = 0; i < arr.length; i++) {
			arr[i] = new int[i + 1];
			// arr[0] = [0]
			// arr[1] = [0,0]
			// arr[2] = [0,0,0]
			// arr[3] = [0,0,0,0]
			// arr[4] = [0,0,0,0,0]
		}
		// initializing array
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = count++;
			}
		}

		// Display array
		System.out.println("\nJagged Array");
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}

	}

}
/*

Jagged Array
0 
1 2 
3 4 5 
6 7 8 9 
10 11 12 13 14 
*/
