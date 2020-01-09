package collectionsInJava;

import java.util.ArrayList;
import java.util.List;

class Boook{
	String booknameString,authornameString,publisherString;
	int bookid,quantity;
	public Boook(String booknameString, String authornameString, String publisherString, int bookid, int quantity) {
		this.booknameString = booknameString;
		this.authornameString = authornameString;
		this.publisherString = publisherString;
		this.bookid = bookid;
		this.quantity = quantity;
	}
	
}




public class ListIteratorInterfaceBook {

	public static void main(String[] args) {
		
		List<Boook> list = new ArrayList<Boook>();
		
		Boook b1 = new Boook("Packet pub","Computer craphics","textemp lee",1,8);
		Boook b2 = new Boook("mc greehil","Computer fundamentals","lutfar rahman",2,10);
		Boook b3 = new Boook("Packet pub","Computer craphics","textemp lee",1,8);
		Boook b4 = new Boook("mc greehil","Computer fundamentals","lutfar rahman",2,10);
		list.add(b1);
		list.add(b2);
		list.add(b3);
		
		
		for (Boook book : list) {
			System.out.println(book.bookid+" "+book.booknameString+" "+book.authornameString+" "+book.quantity);
		}
	
	
	}

}
