package collections.sort;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


class Fruit implements Comparable<Object>{
	int id;
	String nameString,testString;
	
	// constructor
	public Fruit(int id, String nameString, String testString) {
		
		this.id = id;
		this.nameString = nameString;
		this.testString = testString;
	}

	@Override
	public String toString() {
		return "Fruitts [id=" + id + ", nameString=" + nameString + ", testString=" + testString + "]";
	}
	
	// use this instead of toString
	public String display() {
		return id+" "+nameString+" "+testString;
	}

	
	public int compareTo(Object o) {
		
		return 0;
	}

		
}
// class for sorting id
class SortById implements Comparator<Fruit> {
    @Override
    public int compare(Fruit a, Fruit b) {
        return a.id - b.id;
    }
}

// class for sort using name
class SortByName implements Comparator<Fruit> {
    @Override
    public int compare(Fruit a, Fruit b) {
        //return a.nameString().compareTo(b.nameString());
        return a.nameString.compareTo(b.nameString);
    }
}

public class _4_CollectionsListSortComparator {

	public static void main(String[] args) {
		Fruit object1=new Fruit(1, "Apple", "Sweet");
		Fruit object3=new Fruit(4, "Banana", "Sweet");
		Fruit object2=new Fruit(2, "Orange", "Sour");
		Fruit object4=new Fruit(3, "Grape", "Sweet and Sour");
		
    	/*
		 * System.out.println(object1.toString());
		 * System.out.println(object2.toString());
		 * System.out.println(object3.toString());
		 * System.out.println(object4.toString());
		 */
    	
    	List<Fruit> fruitlist = new ArrayList<Fruit>();
    	fruitlist.add(object1);
    	fruitlist.add(object2);
    	fruitlist.add(object3);
    	fruitlist.add(object4);
    	
        //System.out.println(fruitlist);
    	System.out.println("*****Unsorted List objects*****");
    	// display value using to string method
    	fruitlist.forEach(fruit -> {
    		System.out.println(fruit.display());
    	});

    	
    	System.out.println("\n");
    	// We are defining that the natural order of sorting is based on the “id” field of Fruit:
    	// display value using to string method
    	// sorted by id
    	System.out.println("*****Sorted by id using class*****");
    	Collections.sort(fruitlist, new SortById());
    	
    	fruitlist.forEach(fruit -> {
    		System.out.println(fruit.display());
    	});
    	
    
    	// call the class
    	Collections.sort(fruitlist, new SortByName());
    	// sorted by name
    	System.out.println("\n*****Sorted by name*****");
    	fruitlist.forEach(fruit -> {
    		System.out.println(fruit.display());
    	});
    		
	}

}
