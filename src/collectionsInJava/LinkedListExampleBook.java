package collectionsInJava;

import java.util.LinkedList;

class Bok{
	int id;  
	String name,author,publisher;  
	int quantity;
	public Bok(String publisher, String name, String author, int id, int quantity) {
		super();
		this.id = id;
		this.name = name;
		this.author = author;
		this.publisher = publisher;
		this.quantity = quantity;
	} 
	
	
}



public class LinkedListExampleBook {

	public static void main(String[] args) {
		// create list of book.
		LinkedList<Bok> list = new LinkedList<Bok>();
		
		// creating books
		
		Bok b1 = new Bok("Packet pub","Computer craphics","textemp lee",1,8);
		Bok b2 = new Bok("mc greehil","Computer fundamentals","lutfar rahman",2,10);
		Bok b3 = new Bok("Packet pub","Computer craphics","textemp lee",1,8);
		Bok b4 = new Bok("mc greehil","Computer fundamentals","lutfar rahman",2,10);
		
		list.add(b1);
		list.add(b2);
		list.add(b3);
		list.add(b4);
		
		for (Bok b : list) {
			 System.out.println(b.id+" "+b.name+" "+b.author+" "+b.publisher+" "+b.quantity); 
		}

	}

}
