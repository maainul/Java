/*********************************************
# Java HashSet

# Java HashSet class hierarchy

	Java HashSet class is used to create a collection that uses a hash table for storage. 
	It inherits the AbstractSet class and implements Set interface.

# The important points about Java HashSet class are:

	1.HashSet stores the elements by using a mechanism called hashing.
	2.HashSet contains unique elements only.
	3.HashSet allows null value.
	4.HashSet class is non synchronized.
	5.HashSet doesn't maintain the insertion order. Here, 
	elements are inserted on the basis of their hashcode.
	6.HashSet is the best approach for search operations.
	7.The initial default capacity of HashSet is 16, and the load factor is 0.75.
	
# Difference between List and Set

A list can contain duplicate elements whereas Set contains unique elements only.


**********************************************************************************/
package collections.Set.HashSet;

import java.util.HashSet;

public class _6_HashSetExampleStoreElement {
	public static void main(String args[]) {
		System.out.println("136. Single Number (Easy)");
		
		int[] nums = {25,2,5,1,7,8,1};
		setValue(nums);	
	}
	
	private static void setValue(int[] nums) {
		HashSet<Integer> set = new HashSet<Integer>();
			for (int i = 0; i < nums.length; i++) {
				//if(set.contains(nums[i])) {
					//System.out.println(nums[i]);
				//}
				set.add(nums[i]);
			}			
			System.out.println(set);
	}
}