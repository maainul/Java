package dataStructureAndAlgorithm._1_array.diagonalArray;

public class ProgramToPrintTheDiagonalsOfAMatrix {
	public static void main(String[] args) {
		int n = 4;
		int arr[][] = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 1, 2, 3, 4 }, { 5, 6, 7, 8 } };

		printPrincipalDiagonal(arr, n);

		printSecondaryDiagonal(arr, n);
	}

	static void printPrincipalDiagonal(int arr[][], int n) {
		System.out.println("Principal diagonal: ");

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (i == j) {
					System.out.print(arr[i][j] + ", ");
				}
			}
		}

	}

	static void printSecondaryDiagonal(int arr[][], int n) {
		System.out.println("\nSecondary Diagonal :");

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if ((i + j) == (n - 1)) {
					System.out.print(arr[i][j] + " ,");
				}
			}
		}

	}
}
