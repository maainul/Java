package dataStructureAndAlgorithm.array;

import java.util.ArrayList;

/*
We often come across 2D arrays where most of the part in the array is empty. 

Since space is a huge problem, we try different things to reduce the space. 

One such solution is to use jagged array when we know the length of each row in the array, 

but the problem arises when we do not specifically know the length of each of the rows. 

Here we use ArrayList since the length is unknown.

Following is a Java program to demonstrate the above concept
 */
public class ArrayOfArrayList {

	public static void main(String[] args) {
		int n = 5;

		ArrayList<Integer>[] arrayLists = new ArrayList[n];

		// initialize the array
		for (int i = 0; i < n; i++) {
			arrayLists[i] = new ArrayList<Integer>();
		}
		// We can add any number of columns to each
		// rows as per our wish
		arrayLists[0].add(1);
		arrayLists[0].add(2);
		arrayLists[0].add(5);
		arrayLists[1].add(10);
		arrayLists[1].add(6);
		arrayLists[2].add(12);
		arrayLists[2].add(5);
		arrayLists[2].add(3);
		arrayLists[2].add(4);

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < arrayLists[i].size(); j++) {
				System.out.print(arrayLists[i].get(j)+" ");
			}
			System.out.println();
		}
	}

}
/*
1 2 5 
10 6 
12 5 3 4 

The above code works fine, but shows below warning.

warning: [unchecked] unchecked conversion
        ArrayList[] arrayLists = new ArrayList[n];
                                  ^
  required: ArrayList[]
  found:    ArrayList[]
1 warning


The warning comes basically due to below line.

ArrayList<Integer>[] al = new ArrayList[n];

We have to use : ArrayList of ArrayList in Java

*/
