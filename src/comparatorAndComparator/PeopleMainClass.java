package comparatorAndComparator;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class PeopleMainClass {

	public static void main(String[] args) {
		ArrayList<People> arrayList = new ArrayList<>();
		arrayList.add(new People("Mainul", 11, "Tangail"));
		arrayList.add(new People("Khairul", 21, "Gangail"));
		arrayList.add(new People("Kamrull", 41, "Jamalpur"));
		arrayList.add(new People("Fakhrul", 4, "Manikjong"));

		System.out.println(arrayList);

		Collections.sort(arrayList);

		System.out.println(arrayList);
		
		
		Collections.sort(arrayList, new AddressWiseSort());
		System.out.println(arrayList);
		
		
		Collections.sort(arrayList, new NameWiseSort());
		System.out.println(arrayList);
		
		
		Iterator<People> iterator = arrayList.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
		for(People people : arrayList) {
			System.out.println(people);
		}
		
		
		
		
		
		
		
	}

}
