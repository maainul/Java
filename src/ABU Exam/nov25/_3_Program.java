package nov25;
// 3. Java Program for Binary Search (Recursive and Iterative)
public class _3_Program {
	private int binarySearchIter(int[] arr, int val) {
		int left = 0;
		int right = arr.length;
		while (left < right) {
			int middle = (left + right) / 2;
			if (arr[middle] == val) {
				return middle;
			} else if (arr[middle] < val) {
				left = middle + 1;
			} else if (arr[middle] > val) {
				right = middle - 1;
			}
		}
		return -1;
	}

	private int binarySearchRecursive(int[] arr, int left, int right, int val) {

		while (left < right) {
			int middle = (left + right) / 2;
			if (arr[middle] == val) {
				return middle;
			}

			else if (arr[middle] < val) {
				return binarySearchRecursive(arr, middle + 1, right, val);
			} else if (arr[middle] > val) {
				return binarySearchRecursive(arr, left, middle - 1, val);
			}

		}
		return -1;
	}

	public static void main(String[] args) {
		_3_Program obj = new _3_Program();
		int[] arr = { 2, 5, 7, 9, 11, 19, 20, 25 };
		int val = 205;
		int index = obj.binarySearchIter(arr, val);
		System.out.println(index);

		int left = 0;
		int right = arr.length - 1;
		int val2 = 1;
		int index2 = obj.binarySearchRecursive(arr, left, right, val2);
		System.out.println(index2);

	}

}
