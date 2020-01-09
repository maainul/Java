package collectionsInJava;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListExampletoReverseaListofElements {

	public static void main(String[] args) {
		LinkedList<String> al = new LinkedList<String>();
		al.add("Anik");
		al.add("manik");
		al.add("sonik");
		
		Iterator<String> itrIterator = al.descendingIterator();
		while(itrIterator.hasNext()) {
			System.out.println(itrIterator.next());
		}
	}

}
