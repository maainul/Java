package collections.Class.ArrayList;

import java.util.ArrayList;

public class _4_ArrayListExampleOfSetAndGetMethod {

	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<String>();
		al.add("mainul");
		al.add("hasan");
		al.add("anik");
		
		System.out.println("Before updata the value :"+al.get(1));
		
		// updating an element at specific positon
		al.set(1, "mohammad");
		System.out.println("After update value : "+al.get(1));

	}

}
