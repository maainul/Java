package dataStructureAndAlgorithm._1_array._4_searching._1_SearchInsertDeleteUnsortedArray;

public class Delete {

	public static void main(String[] args) {
		int i; 
        int arr[] = {10, 50, 30, 40, 20}; 
       
        int n = arr.length; 
        int key = 30; 
       
        System.out.println("Array before deletion"); 
        for (i=0; i<n; i++) 
			System.out.print(arr[i] + " ");

        n = deleteElement(arr, n, key); 
       
        System.out.println("\n\nArray after deletion"); 
        for (i=0; i<n; i++) 
          System.out.print(arr[i]+" "); 

	}

	private static int deleteElement(int[] arr, int n, int key) {
		int index = findIndex(arr,n,key);
		if (index == -1) {
			System.out.println("data not found");
		}else {
			for (int i = index; i < arr.length-1; i++) {
				arr[i] = arr[i+1];
			}
		}
		return n-1;
	}

	private static int findIndex(int[] arr, int n, int key) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == key) {
				return i;
			}
		}
		return -1;
	}

}
