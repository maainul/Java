package dataStructureAndAlgorithm._1_array;

import java.util.ArrayList;

public class ArrayListOfArrayList {

	public static void main(String[] args) {
		int n = 5;

		// Here aList is an ArrayList of ArrayLists

		ArrayList<ArrayList<Integer>> aList = new ArrayList<ArrayList<Integer>>(n);

		// Create n lists one by one and append to the
		// master list (ArrayList of ArrayList)
		ArrayList<Integer> alinside = new ArrayList<Integer>();
		alinside.add(1);
		alinside.add(2);
		// add value to aList
		aList.add(alinside);

		ArrayList<Integer> alinside2 = new ArrayList<Integer>();
		alinside2.add(5);

		// add value to aList
		aList.add(alinside2);

		ArrayList<Integer> alinside3 = new ArrayList<Integer>();
		alinside3.add(10);
		alinside3.add(20);
		alinside3.add(30);

		// add value to list
		aList.add(alinside3);

		// display
		for (int i = 0; i < aList.size(); i++) {
			for (int j = 0; j < aList.get(i).size(); j++) {
				System.out.print(aList.get(i).get(j) + " ");
			}
			System.out.println();
		}
	}

}
/*
 * 1 2 5 10 20 30
 */
