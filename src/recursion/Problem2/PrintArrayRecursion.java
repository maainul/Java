package recursion.Problem2;

// print array using recursion method
/*
	Output:
	Index0 : 2
	Index1 : 5
	Index2 : 9
	Index3 : 8
	Index4 : 98
	Index5 : 0
	Index6 : 45
	Index7 : 7
*/

public class PrintArrayRecursion {
	public static void main(String[] args) {
		int array[] = { 2, 5, 9, 8, 98, 0, 45, 7 };
		reverse(array, 0);
		printarray(array, 0);
	}

	// preferable solution
	private static void printarray(int[] array, int i) {
		System.out.println(array[i]);
		if (i == array.length - 1)
			return;
		printarray(array, i + 1);

	}

	private static void reverse(int[] array, int i) {
		System.out.println("Index" + i + " : " + array[i]);
		if (i == array.length - 1) {
			return;
		} else {
			reverse(array, i + 1);
		}

	}

}
