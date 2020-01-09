package collectionsInJava;

import java.util.LinkedList;

public class LinkedListExampletoRemoveElements {

	public static void main(String[] args) {
		LinkedList<String> al = new LinkedList<String>();
		al.add("Anik");
		al.add("manik");
		al.add("sonik");
		al.add("jamal");
		al.add("Kamal");
		al.add("marbel");
		System.out.println("Initial value of linked list: "+al);
		// remove by specific element
		al.remove("manik");
		System.out.println("After remove by specific element:"+al);
		// remove by specific index
		al.remove(3);
		System.out.println("After remove by specific index:"+al);
			
		LinkedList<String> al2 = new LinkedList<String>();
		al2.add("Anik");
		al2.add("manik");
		al2.add("sonik");
		al2.add("jamal");
		al2.add("Kamal");
	
	    System.out.println("initial value :"+al2);
	    al2.removeAll(al2);
	    System.out.println(al2);
	    // remove first 
	    al.removeFirst();
	    System.out.println("remove first :"+al);
	    // remove last 
	    al.removeLast();
	    System.out.println("remove Last :"+al);
	    
	    al.clear();
	    System.out.println(al);
	}

}
