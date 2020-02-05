package collections.List.ArrayList;


import java.util.ArrayList;

public class _5_ArrayListExampleToAddElements {

	public static void main(String[] args) {
		
		ArrayList<String> al = new ArrayList<String>();
		System.out.println("Initial List of elemtnts :"+al);
		
		// add element end of the list
		al.add("anik");
		al.add("mim");
		al.add("mamun");
		System.out.println("After Invoking add(E e) method :"+al);
		
		// add an element at the specific position
		al.add(1,"Fakhrul");
		al.add(3,"Mithu");
		System.out.println("After invoking add(int index, E element) method:"+al);
	
		ArrayList<String> al2 = new ArrayList<String>();
		al2.add("jakir");
		al2.add("Manik");
		al.addAll(al2);
		System.out.println("After invoking addAll(Collection <? extends E> c) method :"+al);
	
		ArrayList<String> al3 = new ArrayList<String>();
		al.addAll(1, al3);
		System.out.println("After invoking addAll(int index, collection<? extends E> c) method :"+al); 
	}
}
