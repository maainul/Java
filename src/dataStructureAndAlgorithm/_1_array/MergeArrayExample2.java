package dataStructureAndAlgorithm._1_array;

public class MergeArrayExample2 {

	public static void main(String[] args) {
		int firstArray[] = { 11, 22, 33, 44, 55, 98, 76, 54, 60 };
		int secondArray[] = { 66, 77, 88, 99, 22, 67, 21, 90, 80, 70 };

		int source_arr[], sourcePos, dest_arr[], destPos, len;
		source_arr = firstArray;
		dest_arr = secondArray;
		sourcePos = 2;
		destPos = 4;
		len = 3;

		// print elements of sources
		System.out.println("Source array :");
		for (int i = 0; i < source_arr.length; i++) {
			System.out.print(source_arr[i] + " ");
		}
		System.out.println();
		System.out.println("Source positon : " + sourcePos);

		System.out.println();
		// destination array
		System.out.println("Des array :");
		for (int i = 0; i < dest_arr.length; i++) {
			System.out.print(dest_arr[i] + " ");
		}
		System.out.println();
		System.out.println("dest position : " + destPos);
		// print length
		System.out.println();
		System.out.println("len :" + len);

		// invoking arraycopy() mehthod
		System.arraycopy(source_arr, sourcePos, dest_arr, destPos, len);

		System.out.println();
		// print element of destination after
		System.out.println("Resultant array");
		for (int i = 0; i < secondArray.length; i++) {
			System.out.print(secondArray[i] + " ");
		}

		source_arr = secondArray;
		dest_arr = firstArray;
		sourcePos = 2;
		destPos = 4;
		len = 3;

		// invoking arraycopy() mehthod
		System.arraycopy(source_arr, sourcePos, dest_arr, destPos, len);

		System.out.println();
		// print element of destination after
		System.out.println("Resultant array");

		for (int i = 0; i < firstArray.length; i++) {
			System.out.print(firstArray[i] + " ");
		}

	}

}
