package collections.sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


class Fruitts implements Comparable<Object>{
	int id;
	String nameString,testString;
	
	// constructor
	public Fruitts(int id, String nameString, String testString) {
		
		this.id = id;
		this.nameString = nameString;
		this.testString = testString;
	}

	@Override
	public String toString() {
		return "Fruitts [id=" + id + ", nameString=" + nameString + ", testString=" + testString + "]";
	}
	
	@Override 
    public int compareTo(Object o) {
        Fruitts f = (Fruitts) o; 
        return this.id - f.id;
    }

	public String display() {
		return id+" "+nameString+" "+testString;
	}
	
	
}


public class _3_CollectionsSortListUsingComparator {

	public static void main(String[] args) {
		Fruitts object1=new Fruitts(1, "Apple", "Sweet");
    	Fruitts object3=new Fruitts(4, "Banana", "Sweet");
    	Fruitts object2=new Fruitts(2, "Orange", "Sour");
    	Fruitts object4=new Fruitts(3, "Grape", "Sweet and Sour");
		
    	/*
		 * System.out.println(object1.toString());
		 * System.out.println(object2.toString());
		 * System.out.println(object3.toString());
		 * System.out.println(object4.toString());
		 */
    	
    	List<Fruitts> fruitlist = new ArrayList<Fruitts>();
    	fruitlist.add(object1);
    	fruitlist.add(object2);
    	fruitlist.add(object3);
    	fruitlist.add(object4);
    	
        //System.out.println(fruitlist);
    	
    	// display value using to string method
    	fruitlist.forEach(fruit -> {
    		System.out.println(fruit.display());
    	});
    	
    	
    	System.out.println("\n");
    	// We are defining that the natural order of sorting is based on the �id� field of Fruit:
    	// display value using to string method
    	Collections.sort(fruitlist);
    	fruitlist.forEach(fruit -> {
    		System.out.println(fruit.display());
    	});
    	
	}

}
