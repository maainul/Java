package collectionsInJava;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListExample {

	public static void main(String[] args) {
		LinkedList<String> al = new LinkedList<String>();
		al.add("Anik");
		al.add("manik");
		al.add("sonik");
		
		System.out.println(al);
		// iterator 
		Iterator<String> itrIterator = al.iterator();
		while(itrIterator.hasNext()) {
			System.out.println(itrIterator.next());
		}
	}

}
