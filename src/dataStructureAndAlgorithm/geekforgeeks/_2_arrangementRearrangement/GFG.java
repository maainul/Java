package dataStructureAndAlgorithm.geekforgeeks._2_arrangementRearrangement;// Java program to put all negative
// numbers before positive numbers
import java.io.*;

class GFG {

	static void rearrange(int arr[], int n)
	{
		int i = 0, j = arr.length-1;
		while (i < j){
			if (arr[i] >= 0 && arr[j] < 0){
				swap(arr,i,j);
				i++;
				j--;
			}
			else if(arr[i] < 0){
				i++;
			}else if(arr[j] >= 0){
				j--;
			}
		}


	}

	private static void swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}

	// A utility function to print an array
	static void printArray(int arr[], int n)
	{
		for (int i = 0; i < n; i++)
			System.out.print(arr[i] + " ");
	}

	// Driver code
	public static void main(String args[])
	{
		int arr[] = { -1, 2, -3, -4, -5, 6, -7, 8, -9 };
		int n = arr.length;

		rearrange(arr, n);
		printArray(arr, n);
	}
}
