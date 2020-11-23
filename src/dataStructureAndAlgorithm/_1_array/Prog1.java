package dataStructureAndAlgorithm._1_array;
import java.util.Arrays;

public class Prog1 {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5, 6, 7 };
		int n = arr.length;
		int d = 2;
		rotateArray(arr, n, d);

	}

	private static void rotateArray(int[] arr, int n, int d) {
		int[] temp = new int[n];
		int index = 0;
		for (int i = d; i < n; i++) {
			temp[index++] = arr[i];
		}
		System.out.println(Arrays.toString(temp));
		
		for (int i = 0; i < d; i++) {
		temp[index++] = arr[i];	
		}
		System.out.println(Arrays.toString(temp));
	}
}

/*
[3, 4, 5, 6, 7, 0, 0]

[3, 4, 5, 6, 7, 1, 2]

  */
