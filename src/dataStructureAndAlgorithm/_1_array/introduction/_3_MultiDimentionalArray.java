package dataStructureAndAlgorithm._1_array.introduction;

public class _3_MultiDimentionalArray {

	public static void main(String[] args) {
		int arr[][] = {{2,3,5},{3,6,9},{7,2,1}};
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}

	}

}
