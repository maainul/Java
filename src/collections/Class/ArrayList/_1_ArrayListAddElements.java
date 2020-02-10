package collections.Class.ArrayList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class _1_ArrayListAddElements {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("Mohammad");
		list.add("Manik");
		list.add("Motiur");
		list.add("Mizzan");
		
		// invoke arraylist object
		System.out.println(list);
		
		
		/*	
		Ways to iterate the elements of the collection in java
		There are various ways to traverse the collection elements:

		1.By Iterator interface.
		2.By for-each loop.
		3.By ListIterator interface.
		4.By for loop.
		5.By forEach() method.
		6.By forEachRemaining() method.
*/
		
		//1. By Iterator interface
		System.out.println("\n-------------Iterator by interface----------");
		Iterator<String> itrIterator = list.iterator();
		while(itrIterator.hasNext()) {
			System.out.println(itrIterator.next());
		}
		//2.By for-each loop.
		System.out.println("\n-------------for each by ----------");
		for (String string : list) {
			System.out.println(string);
		}
		
		//3.By ListIterator interface.
		System.out.println("\n-------------ListIterator interface ----------");
		ListIterator<String> list1 = list.listIterator(list.size());
		while(list1.hasPrevious()) {
			String string = list1.previous();
			System.out.println(string);
		}
		
		// 4.By for loop.
		System.out.println("\n----By for loop----");
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
				
		// 5.By for each method.
		System.out.println("\n----By for each method----");
		list.forEach(a->{
			System.out.println(a);
		});
				
		// 6.By forEachRemaining() method.
		System.out.println("\n----By forEachRemaining() method.----");
		Iterator<String> itrIterator2 = list.iterator();
		itrIterator2.forEachRemaining(a->{
			System.out.println(a);
		});
		
	}

}
