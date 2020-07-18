package collections.ArrayList;

import java.util.ArrayList;

class Book{
	String booknameString,authornameString,publisherString;
	int bookid,quantity;
	public Book(String booknameString, String authornameString, String publisherString, int bookid, int quantity) {
		this.booknameString = booknameString;
		this.authornameString = authornameString;
		this.publisherString = publisherString;
		this.bookid = bookid;
		this.quantity = quantity;
	}
	
}


public class _8_ArrayListExampleBook {


	public static void main(String[] args) {
		// creating list of book
		ArrayList<Book> list = new ArrayList<Book>();
		// creating books
		Book b1 = new Book("Packet pub","Computer craphics","textemp lee",1,8);
		Book b2 = new Book("mc greehil","Computer fundamentals","lutfar rahman",2,10);
		Book b3 = new Book("Packet pub","Computer craphics","textemp lee",1,8);
		Book b4 = new Book("mc greehil","Computer fundamentals","lutfar rahman",2,10);
		// adding books to list
		list.add(b1);
		list.add(b2);
		list.add(b3);
		list.add(b4);
		// iterate all objects
		for (Book book : list) {
			System.out.println(book.bookid+" "+book.booknameString+" "+book.authornameString+" "+book.quantity);
		}
		
	

	}

}
