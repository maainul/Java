package collectionsInJava;

import java.util.ArrayList;

public class ArrayListExampleofisEmptyMethod {

	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<String>();
		al.add("mainul");
		al.add("hasan");
		al.add("anik");
		
		System.out.println("After insertion");
		System.out.println("Is arraylist empty :"+al.isEmpty());

	}

}
