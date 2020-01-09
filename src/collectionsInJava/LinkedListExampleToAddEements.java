package collectionsInJava;

import java.util.LinkedList;

public class LinkedListExampleToAddEements {
	public static void main(String[] args) {
		LinkedList<String> al = new LinkedList<String>();
		al.add("Anik");
		al.add("manik");
		al.add("sonik");
		System.out.println("After invoking add(E e):"+al);
		// add elemt at specific position
		al.add(1, "batabui");
		System.out.println("After invoking add(index, E e):"+al);
		
		// add second list to first list
		LinkedList<String> ll = new LinkedList<String>();
		ll.add("jamal");
		ll.add("Kamal");
		ll.add("marbel");
		al.addAll(ll);
		System.out.println("After add second list to first list"+al);
		
		  //Adding second list elements to the first list at specific position  
		LinkedList<String> ll3 = new LinkedList<String>();
		ll.add("malek");
		ll.add("khalek");
		ll.addAll(1,ll3);
		System.out.println("Adding second list elements to the first list "+ll);
		
		// add first
		ll.addFirst("mim");
		System.out.println("After add first :"+ll);
		// add last
		ll.addLast("mamun");
		System.out.println("After add last :"+ll);
		
	
	
	}

}
