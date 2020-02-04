package collections.Set.HashSet;

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
