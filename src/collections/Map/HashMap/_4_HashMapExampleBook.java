package collections.Map.HashMap;

import java.util.HashMap;
import java.util.Map;

class Book {
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

public class _4_HashMapExampleBook {

	public static void main(String[] args) {
		Map<Integer, Book> map = new HashMap<Integer, Book>();
		    Book b1=new Book(101,"Let us C","Yashwant Kanetkar","BPB",8);    
		    Book b2=new Book(102,"Data Communications & Networking","Forouzan","Mc Graw Hill",4);    
		    Book b3=new Book(103,"Operating System","Galvin","Wiley",6);    
		    map.put(1, b1);
		    map.put(2, b2);
		    map.put(3,b3);
		    //traversing map
		    for (Map.Entry<Integer, Book> entry:map.entrySet()) {
				int key = entry.getKey();
				Book b = entry.getValue();
				System.out.println(key+"details");
				System.out.println(b.id+" "+b.nameString+" "+b.authorString);
			}
	}

}
