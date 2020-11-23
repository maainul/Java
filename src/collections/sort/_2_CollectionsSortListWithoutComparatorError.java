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

public class _2_CollectionsSortListWithoutComparatorError {

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
		// if you want to show magic you have to uncomment
		//Collections.sort(fruitlist);
		
		
	}

}