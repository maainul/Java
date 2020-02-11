package collections.Class.TreeSet;

import java.util.*;  

public class _2_TreeSetExampleDescendingOrder {
	
	 public static void main(String args[]){  
	  //Creating and adding elements  
	  TreeSet<String> al=new TreeSet<String>();  
	  al.add("Ravi");  
	  al.add("Vijay");  
	  al.add("Ravi");  
	  al.add("Ajay");  
	  //Traversing elements 
	  Iterator<String> itr = al.descendingIterator();
	  while(itr.hasNext()) {
		  System.out.println(itr.next());
	  }
	 }
}
