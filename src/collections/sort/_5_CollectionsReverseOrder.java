package collections.sort;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


class Frruit implements Comparable<Object>{
	int id;
	String nameString,testString;
	
	// constructor
	public Frruit(int id, String nameString, String testString) {
		
		this.id = id;
		this.nameString = nameString;
		this.testString = testString;
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
class SortByIdd implements Comparator<Frruit> {
    @Override
    public int compare(Frruit a, Frruit b) {
        return a.id - b.id;
    }
}

// class for sort using name
class SortByNamee implements Comparator<Frruit> {
    @Override
    public int compare(Frruit a, Frruit b) {
        //return a.nameString().compareTo(b.nameString());
        return a.nameString.compareTo(b.nameString);
    }
}

public class _5_CollectionsReverseOrder {

	public static void main(String[] args) {
		Frruit object1=new Frruit(1, "Apple", "Sweet");
		Frruit object3=new Frruit(4, "Banana", "Sweet");
		Frruit object2=new Frruit(2, "Orange", "Sour");
		Frruit object4=new Frruit(3, "Grape", "Sweet and Sour");

    	List<Frruit> fruitlist = new ArrayList<Frruit>();
    	fruitlist.add(object1);
    	fruitlist.add(object2);
    	fruitlist.add(object3);
    	fruitlist.add(object4);
    	
    	   	
    	System.out.println("*****Unsorted List objects*****");
    	// display value using to string method
    	fruitlist.forEach(fruit -> {
    		System.out.println(fruit.display());
    	});

    	
    	System.out.println("\n");
    	// We are defining that the natural order of sorting is based on the �id� field of Fruit:
    	// display value using to string method
    	// sorted by id
    	System.out.println("*****Sorted by id using class*****");
    	Collections.sort(fruitlist, new SortByIdd());
    	
    	fruitlist.forEach(fruit -> {
    		System.out.println(fruit.display());
    	});
    	
    
    	System.out.println("\n*****Sorted by id (REVERSE ORDER)*****");
    	Collections.sort(fruitlist, Collections.reverseOrder(new SortByIdd()));
    	fruitlist.forEach(fruit -> {
    		System.out.println(fruit.display());
    	});
    	
    	
    	// call the class
    	Collections.sort(fruitlist, new SortByNamee());
    	// sorted by name
    	System.out.println("\n*****Sorted by name*****");
    	fruitlist.forEach(fruit -> {
    		System.out.println(fruit.display());
    	});
    	
    	
    	
    	System.out.println("\n*****Sorted by name REVERSE ORDER*****");
    	Collections.sort(fruitlist, Collections.reverseOrder(new SortByNamee()));
    	fruitlist.forEach(fruit -> {
    		System.out.println(fruit.display());
    	});
    		
	}

}
