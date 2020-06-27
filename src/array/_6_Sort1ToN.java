package array;
/*
Sort an array which contain 1 to n values
You have given an array which contain 1 to n element, 
your task is to sort this array in an efficient way and without replace with 1 to n numbers.

Examples :

Input : arr[] = {10, 7, 9, 2, 8, 3, 5, 4, 6, 1};
Output : 1 2 3 4 5 6 7 8 9 10

.
Native approach :
Sort this array with the use of any type of sorting method. 
it takes O(nlogn) minimum time.

Efficient approach :
Replace every element with it’s position. it takes O(n) efficient time and give you the sorted array. 
Let’s understand this approach with the code below
 */
public class _6_Sort1ToN {

	public static void main(String[] args) {
		int arr[] = {10, 7, 9, 2, 8, 3, 5, 4, 6, 1};
		_6_Sort1ToN  obj = new _6_Sort1ToN();

		obj.printArray(arr);
		obj.sortArray(arr);
		System.out.println();
		obj.printArray(arr);
	}

	private void sortArray(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			arr[i] = i+1;
		}
		
	}

	void printArray(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+ " ");
		}
		
	}

}
