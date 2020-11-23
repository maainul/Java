package dataStructureAndAlgorithm._1_array;

/*
Jagged array is array of arrays such that member arrays can be of different sizes, i.e., 

we can create a 2-D arrays but with variable number of columns in each row. 

These type of arrays are also known as Jagged arrays.

Following are Java programs to demonstrate the above concept.
*/
public class JaggedArray {

	public static void main(String[] args) {
		// Declaring 2-D array with 2 rows
		int arr[][] = new int[3][];
		// we don't know the size of column so it is empty
		// Making the above array jagged
		// First Row 3 element...1 2 3
		arr[0] = new int[3];

		// Second Row 2 ta element
		arr[1] = new int[2];

		arr[2] = new int[3];
		// initializing array
		int count = 1;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = count++;
			}
		}
		// print value
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}

	}

}
