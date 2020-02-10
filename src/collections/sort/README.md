
# Java Collections sort()

```
	1.1 Java Collections sort(List list)
	1.2 Java Collections sort(List list, Comparator c)
	1.3 Java Collections.reverseOrder
	1.4 Java Collections reverseOrder() example
	1.5 Java Collections reverseOrder(Comparator cmp) example
```

```
Java Collections class provides us with a very convenient method Collections.sort() 
to sort all List implementations such as LinkedList and ArrayList.

There are two overloaded Collections.sort() methods, which are:

  1.sort(List list): Sorts the elements of the List in ascending order of their natural ordering.
  2.sort(List list, Comparator c): Sorts the elements of the list according to the order 
                                   induced by the comparator.

*** Note that the above methods signature use generics
```
#c Java Collections sort(List list)

Consider an ArrayList of String:

```.java

package collections.sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class _1_CollectionsSortList {

	public static void main(String[] args) {
		
        List<String> fruits = new ArrayList<String>();
			fruits.add("Apple");
			fruits.add("Orange");
			fruits.add("Banana");
			fruits.add("Grape");
		
		// unsorted list
		System.out.println(fruits);
		
		// sorting using collections
		Collections.sort(fruits);
		System.out.println(fruits);
	}

}

 Output :[Apple, Banana, Grape, Orange]
```

# What if we have a list of custom objects? Of course, we can sort them as well.

```.java
Consider a class Fruit:
/**********************************************************************

1. create class Main()
2. create Fruits class
3. assign value to the id, name,test
4. create constructor
5. create toStirng method
6. create object for fruits class (4 object)
7. store that four object in the List collections
8. show the result.

*************************************************************************/
package collections.sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Fruits{
	int id;
	String nameString,testString;
	
	// constructor
	public Fruits(int id, String nameString, String testString) {
		this.id = id;
		this.nameString = nameString;
		this.testString = testString;
	}
	
	@Override
	public String toString() {
		return "Fruits [id=" + id + ", nameString=" + nameString + ", testString=" + testString + "]";
	}
}

public class _2_CollectionsSortListComparator {

	public static void main(String[] args) {
		// create four object
		Fruits object1=new Fruits(1, "Apple", "Sweet");
    	Fruits object2=new Fruits(2, "Orange", "Sour");
    	Fruits object3=new Fruits(4, "Banana", "Sweet");
    	Fruits object4=new Fruits(3, "Grape", "Sweet and Sour");
		//call collections class
		List<Fruits> fruitlist = new ArrayList<Fruits>();
		// add objects to the list
		fruitlist.add(object1);
		fruitlist.add(object2);
		fruitlist.add(object3);
		fruitlist.add(object4);
		// show the result
		System.out.println(fruitlist);
		
		// error line 
// The method sort(List<T>) in the type Collections is not applicable for the arguments (List<Fruits>
		Collections.sort(fruitlist);
		
	}
    // NO OUTPUT
    // ERROR

}
```
```
In order to sort this list, if we directly use the Collections.sort(List list), 
it will give a Compile Time Error because there is no natural ordering defined for the Fruit objects. 
So, it doesn’t know how to sort this list.

*** For objects to have a natural order they must implement the interface java.lang.Comparable.

The Comparable interface has a method compareTo(), which returns a negative, 
0, a positive if the current value is less than, equal to, 
or greater than the value we are comparing with, respectively.

```
# Let’s enhance the Fruit class to implement Comparable interface. 
# We are defining that the natural order of sorting is based on the “id” field of Fruit:

```.java
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
    	// We are defining that the natural order of sorting is based on the “id” field of Fruit:
    	// display value using to string method
    	Collections.sort(fruitlist);
    	fruitlist.forEach(fruit -> {
    		System.out.println(fruit.display());
    	});
    	
	}

}
/****
1 Apple Sweet
2 Orange Sour
4 Banana Sweet
3 Grape Sweet and Sour


1 Apple Sweet
2 Orange Sour
3 Grape Sweet and Sour
4 Banana Sweet

*****/
```
# Java Collections sort(List list, Comparator c)
```
In order to define a custom logic for sorting, which is different from the natural ordering of the elements, 
we can implement the java.util.Comparator interface and pass an instance of it as the second argument of sort().
```
##Let’s consider that we want to define the ordering based on the “name” field of the Fruit. 
We implement the Comparator, and in its compare() method, we need to write the logic for comparison:


```.java

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
/*********
*****Unsorted List objects*****
1 Apple Sweet
2 Orange Sour
4 Banana Sweet
3 Grape Sweet and Sour


*****Sorted by id using class*****
1 Apple Sweet
2 Orange Sour
3 Grape Sweet and Sour
4 Banana Sweet

*****Sorted by name*****
1 Apple Sweet
4 Banana Sweet
3 Grape Sweet and Sour
2 Orange Sour

**********************/
```
# Java Collections.reverseOrder
By default, Collection.sort performs the sorting in ascending order. 
If we want to sort the elements in reverse order we could use following methods:

reverseOrder(): Returns a Comparator that imposes the reverse of natural ordering of elements of the collection.
reverseOrder(Comparator cmp): Returns a Comparator that imposes reverse ordering of the specified comparator.
Here are the examples for both these methods:

Java Collections reverseOrder() example

Collections.sort(fruits, Collections.reverseOrder());
System.out.println(fruits);
It’ll output the fruits in reverse alphabetical order:

[Orange, Grape, Banana, Apple]
Java Collections reverseOrder(Comparator cmp) example

Collections.sort(fruitList, Collections.reverseOrder(new SortByName()));
fruitList.forEach(fruit -> {
    System.out.println(fruit.getId() + " " + fruit.getName() + " " + 
      fruit.getTaste());
});
Output:


2 Orange Sour
3 Grape Sweet and Sour
4 Banana Sweet
1 Apple Sweet
That’s all for Java Collections sort() method and it’s examples.
```
