package collectionsInJava;

import java.util.*;

public class ExampleOfArrayListAndLinkedList {

	public static void main(String[] args) {
		List<String> al = new ArrayList<String>(); // creating arraylist
		al.add("anik");
		al.add("manik");
		al.add("samud");
		System.out.println("Array list :"+al);
		
		List<String> ll = new ArrayList<String>(); // creating linkedlist
		ll.add("monika");
		ll.add("kanika");
		ll.add("anika");
		System.out.println("Linked list :"+ll);
		
	}

}
