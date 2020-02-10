package collections.sort;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class Fruit implements Comparable<Object>{
	int id;
	String nameString;
	String testString;
	
	public Fruit(int id, String nameString, String testString) {
		
		this.id = id;
		this.nameString = nameString;
		this.testString = testString;
	}

	@Override
	public String toString() {
		return "Fruit [rollno=" + id + ", nameString=" + nameString + ", testString=" + testString + "]";
	}
	
	@Override 
    public int compareTo(Object o) {
        Fruit f = (Fruit) o; 
        return this.id - f.id ;
    }
	

	
	
}


public class _2_CollectionsSortListComparator {

	public static void main(String[] args) {
		List<Fruit> fruitlist = new ArrayList<Fruit>();
		Fruit apple = new Fruit(1,"Apple","Sweet");
		Fruit orange = new Fruit(2,"Orange","sour");
		Fruit banana=new Fruit(4, "Banana", "Sweet");
		Fruit grape=new Fruit(3, "Grape", "Sweet and Sour");
		
		fruitlist.add(apple);
		fruitlist.add(orange);
		fruitlist.add(banana);
		fruitlist.add(grape);
		
		Collections.sort(fruitlist);
		fruitlist.forEach(fruit -> {
		    System.out.println(fruit.getid() + " " + fruit.getnameString() + " " + 
		      fruit.gettestString());
		});
			
			
		};
		
		
	}

}