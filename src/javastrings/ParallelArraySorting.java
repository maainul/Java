package javastrings;

import java.util.Arrays;

public class ParallelArraySorting {

	public static void main(String[] args) {
		int[] arr = { 5, 6, 81, 10, 9, 12, 3, 45, 2 };
		for (int i : arr) {
			System.out.print(i + " ");
		}
		Arrays.parallelSort(arr);
		System.out.println("\nAfter sorting");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		// sorting string
		// chase sensitive
		// replace all white space and make it one word... e.i ....Bangla
		// Desh---->BanglaDesh
		// so at first we have to make all upper or all lower case..
		// if don't do this sort will not be correct order..
		System.out.println();
		String s = "Mainul hasan";
		String string = s.replaceAll("\\s", "");
		char[] array = string.toCharArray();
		System.out.println(array);
		Arrays.sort(array);
		System.out.println(array);

		// with upper/lower method for precise result
		char[] array2 = string.toLowerCase().toCharArray();
		Arrays.parallelSort(array2);
		System.out.println(array2);

	}

}
/*
 * 5 6 81 10 9 12 3 45 2 After sorting 2 3 5 6 9 10 12 45 81 Mainulhasan
 * Maaahilnnsu aaahilmnnsu
 */
