package collections.List;

import java.util.ArrayList;
import java.util.List;

public class _2_PositionalAccess {

	public static void main(String[] args) {
		// creating a list
		List<Integer> ll = new ArrayList<Integer>();
		ll.add(0,1); // add 1 at index 0
		ll.add(1,2); // add 2 at index 1
		
		System.out.println(ll); // [0,1]
		
		List<Integer> l2 = new ArrayList<Integer>(); 
	    l2.add(1); 
	    l2.add(2); 
	    l2.add(3); 
	    
	    // will add list l2 from 1 index
	    ll.addAll(1,l2);
	    System.out.println(ll);

	    // Removes elemet form index 1
	    ll.remove(1);
	    System.out.println(ll);
	    
	    // Prints element at index 3 
        System.out.println(ll.get(3)); 
  
        // Replace 0th element with 5 
        ll.set(0, 5); 
        System.out.println(ll); 
	
	}

}
/*
[1, 2]
[1, 1, 2, 3, 2]
[1, 2, 3, 2]
2
[5, 2, 3, 2]
 
 */
