package collections.ArrayList;

import java.util.ArrayList;

public class _6_ArrayListExampleToRemoveElements {

	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<String>();
		al.add("amik");
		al.add("jamil");
		al.add("masum");
		System.out.println("An initial list of element : "+al );
		
		// remove specific element from arraylist
		al.remove("amik");
		System.out.println("After remove method : "+al);
		
		// removing element on the basis of the specific position
		al.remove(0);
		System.out.println("After remove(index) method : "+al);
		
		// adding new arraylist
		ArrayList<String> al2 = new ArrayList<String>();
		al2.add("rabiul");
		al2.add("humayun");
		
		// adding new element to arraylist
		al.addAll(al2);
		System.out.println("Update list :"+al);
		
		// remove all the new element from arraylist
		al.removeAll(al2);
		System.out.println("After invoking removeALL :"+al);
		
		//removing elemet on the basis of the condiiton
		al.removeIf(str->str.contains("masum"));
		System.out.println("After invoking removeIF() method :"+al);
		
		// removing all the elements avaiable in the list
		al.clear();
		System.out.println("After invoking clear() method:"+al);
			
	}

}