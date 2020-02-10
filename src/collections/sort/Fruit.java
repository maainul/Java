package collections.sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class Fruit implements Comparable<Object>{
	    private int id;
	    private String name;
	    private String taste;

	    Fruit(int id, String name, String taste){
	        this.id=id;
	        this.name=name;
	        this.taste=taste;
	    }

	    public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getTaste() {
			return taste;
		}
		public void setTaste(String taste) {
			this.taste = taste;
		}
	    
		
	    @Override 
	    public int compareTo(Object o) {
	        Fruit f = (Fruit) o; 
	        return this.id - f.id ;
	    }
    
    public static void main(String args[]) {
    	 List<Fruit> fruitList=new ArrayList<Fruit>();
    	 Fruit apple=new Fruit(1, "Apple", "Sweet");
    	 Fruit orange=new Fruit(2, "Orange", "Sour");
    	 Fruit banana=new Fruit(4, "Banana", "Sweet");
    	 Fruit grape=new Fruit(3, "Grape", "Sweet and Sour");

    	    fruitList.add(apple);
    	    fruitList.add(orange);
    	    fruitList.add(banana);
    	    fruitList.add(grape);
    	    
    	    
    	    Collections.sort(fruitList);
    	    fruitList.forEach(fruit -> {
    	        System.out.println(fruit.getId() + " " + fruit.getName() + " " + 
    	          fruit.getTaste());
    	    });
    }
	
	
    
   
}