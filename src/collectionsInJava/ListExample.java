package collectionsInJava;

import java.util.ArrayList;
import java.util.List;

public class ListExample {

	public static void main(String[] args) {
		List<String> al = new ArrayList<String>();
		al.add("mubin");
		al.add("jafar");
		al.add("faruk");
		
		al.add(2, "janak");
		
		System.out.println(al);
		
		for (String string : al) {
			System.out.println(string);
		}
	}

}
