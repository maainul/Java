package collections.TreeSet;

import java.util.*;  

public class _3_TreeSetExampleRetriveHighestAndLowestValue {
	
	 public static void main(String args[]){  
	  //Creating and adding elements  
	  TreeSet<Integer> al=new TreeSet<Integer>();  
	  al.add(12);
	  al.add(45);
	  al.add(8);
	  al.add(8);
	  //Traversing elements 
	  Iterator<Integer> itr = al.iterator();
	  while(itr.hasNext()) {
		  System.out.println(itr.next());
	  }
	  
	  System.out.println("Lowest value: "+ al.pollFirst());
	  
	  Iterator<Integer> i = al.iterator();
	  while(i.hasNext()) {
		  System.out.println(i.next());
	  }
	  
	  System.out.println("Higest value: "+ al.pollLast());
	  
	  Iterator<Integer> ii = al.iterator();
	  while(ii.hasNext()) {
		  System.out.println(ii.next());
	  }
	  
	  
	 }
}
