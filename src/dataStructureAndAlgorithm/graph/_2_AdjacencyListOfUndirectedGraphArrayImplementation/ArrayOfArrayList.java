package dataStructureAndAlgorithm.graph._2_AdjacencyListOfUndirectedGraphArrayImplementation;

import java.util.ArrayList;

public class ArrayOfArrayList {

	public static void main(String[] args) {

		// create arraylist object
		int v = 3;
		ArrayList<ArrayList<Integer>> aList = new ArrayList<ArrayList<Integer>>(v);

		// create how many vertex inside the aray
		// [[], [], [], [], []]
		for (int i = 0; i < v; i++) {
			aList.add(new ArrayList<Integer>());
		}

		// inside value array inside array
		aList.get(0).add(5);
		aList.get(0).add(10);
		aList.get(0).add(20);

		aList.get(1).add(4);
		aList.get(1).add(30);
		aList.get(1).add(80);

		aList.get(2).add(25);
		aList.get(2).add(55);

		System.out.println(aList);

		for (int i = 0; i < v; i++) {
			System.out.println("head");
			for (int j = 0; j < aList.get(i).size(); j++) {
				System.out.print(aList.get(i).get(j) + "-->");
			}
			System.out.println();
		}

		// now convert it a good formate ....
		// see the Graph.java for more convnient method and clean code.

	}

}
/*
 * [[5, 10, 20], [4, 30, 80], [25, 55]]
 * 
 * head 5-->10-->20-->
 * 
 * head 4-->30-->80-->
 * 
 * head 25-->55-->
 * 
 */
