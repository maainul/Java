package collections.Class.ArrayList;

import java.util.ArrayList;

public class _2_Extra_ArrayListOfArrayList {

	public static void main(String[] args) {
	
		ArrayList<ArrayList<Integer>> mainArrayList = new ArrayList<ArrayList<Integer>>();
		
		ArrayList<Integer> arraylist1 = new ArrayList<Integer>();
		arraylist1.add(11);
		arraylist1.add(23);
		
		mainArrayList.add(arraylist1);
		
		
		ArrayList<Integer> arrayList2 = new ArrayList<Integer>();
		
		arrayList2.add(15);
		arrayList2.add(12);
		
		mainArrayList.add(arrayList2);
		
		
		
		ArrayList<Integer> arrayList3 = new ArrayList<Integer>();
		
		arrayList3.add(45);
		
		mainArrayList.add(arrayList3);
		
		ArrayList<Integer> arrayList4 = new ArrayList<Integer>();
		
		arrayList4.add(10);
		arrayList4.add(10);
		
		mainArrayList.add(arrayList4);
		
		
		for (int i = 0; i < mainArrayList.size(); i++) {
			for (int j = 0; j < mainArrayList.get(i).size(); j++) {
				System.out.print(mainArrayList.get(i).get(j)+" ");
				
			}
			System.out.println();
		}
		
		
	}

}
/*
11 23
15 12 
19 71 
45 
10 10 
*/
