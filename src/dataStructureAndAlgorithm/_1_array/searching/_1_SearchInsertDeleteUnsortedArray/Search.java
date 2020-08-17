package dataStructureAndAlgorithm._1_array.searching._1_SearchInsertDeleteUnsortedArray;

// liner search item 
// if found return index otherwise return -1
public class Search {

	public static void main(String[] args) {
		int[] arr = { 12, 54, 10, 5, 36, 90 };

		int result = searchFromArray(arr, 36);

		if (result == -1) {
			System.out.println("Data not found");
		} else {
			System.out.println("Data found in index = " + result);
		}

	}

	private static int searchFromArray(int[] arr, int key) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == key) {
				return i;
			}
		}
		return -1;
	}

}
