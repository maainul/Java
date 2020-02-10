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
package collections.Class.HashSet;

import java.util.HashSet;

class Book{
	int id;
	String nameString,authorString,publisherString;
	int quantity;
	
	public Book(int id, String nameString, String authorString, String publisherString, int quantity) {
		this.id = id;
		this.nameString = nameString;
		this.authorString = authorString;
		this.publisherString = publisherString;
		this.quantity = quantity;
	}
}

public class _5_HashSetExampleBook {

	public static void main(String[] args) {
		 HashSet<Book> set=new HashSet<Book>();  
		 //Creating Books  
		 Book b1=new Book(101,"Let us C","Yashwant Kanetkar","BPB",8);  
		 Book b2=new Book(102,"Data Communications & Networking","Forouzan","Mc Graw Hill",4);  
		 Book b3=new Book(103,"Operating System","Galvin","Wiley",6);  	
		 
		 // adding nooks to hashset
		 
		 set.add(b1);
		 set.add(b2);
		 set.add(b3);
		 
		 for (Book b : set) {
			 System.out.println(b.id+" "+b.nameString+" "+b.authorString+" "+b.publisherString+" "+b.quantity);  
		}
	
	
	}

}
