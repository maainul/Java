package collections.LinkedList;

import java.util.Iterator;
import java.util.LinkedList;

class Book {
	int id;
	String nameString, authorString, publisherString;
	int quantity;

	// constructor
	public Book(int id, String nameString, String authorString, String publisherString, int quantity) {

		this.id = id;
		this.nameString = nameString;
		this.authorString = authorString;
		this.publisherString = publisherString;
		this.quantity = quantity;
	}

	@Override
	public String toString() {
		return "Book [id=" + id + ", nameString=" + nameString + ", authorString=" + authorString + ", publisherString="
				+ publisherString + ", quantity=" + quantity + "]";
	}

	public String display() {
		return id + " " + nameString + " " + authorString + " " + publisherString + " " + quantity;
	}

}

public class _4_LinkedListExampleBook {

	public static void main(String[] args) {
		Book book1 = new Book(1, "c programming", "E balaguruswamy", "MCGrwhill", 10);
		Book book2 = new Book(3, "java programming", " M S sultan", "Packet pub", 101);
		Book book3 = new Book(2, "python programming", "K Rajib Uddin", "Onno", 5);
		Book book4 = new Book(4, "Golang programming", "P C Dash", "Jononi", 25);

		LinkedList<Book> ll = new LinkedList<Book>();
		ll.add(book1);
		ll.add(book2);
		ll.add(book3);
		ll.add(book4);

		for (Book book : ll) {
			System.out.println(book.display());
		}
		System.out.println("\n");

		for (Iterator<Book> iterator = ll.iterator(); iterator.hasNext();) {
			Book book = iterator.next();
			System.out.println(book.display());

		}

	}

}
