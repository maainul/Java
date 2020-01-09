package collectionsInJava;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorInterface {

	public static void main(String[] args) {
		List<String> al = new ArrayList<String>();
		al.add("mubin");
		al.add("jafar");
		al.add("faruk");
		
		ListIterator<String> itr = al.listIterator();
		// forward
		//0 1 2 3
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		// backward
		// 3 2 1 0
		System.out.println();
		while(itr.hasPrevious()) {
			System.out.println(itr.previous());
		}
 		
	}

}
/*
	Traversing elements in forward direction
	index:0 value:Amit
	index:1 value:Sachin
	index:2 value:Vijay
	index:3 value:Kumar
	
	Traversing elements in backward direction
	index:3 value:Kumar
	index:2 value:Vijay
	index:1 value:Sachin
	index:0 value:Amit
*/
