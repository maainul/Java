# Java Collections sort()

``
Java Collections class provides us with a very convenient method Collections.sort() 
to sort all List implementations such as LinkedList and ArrayList.

There are two overloaded Collections.sort() methods, which are:

sort(List list): Sorts the elements of the List in ascending order of their natural ordering.
sort(List list, Comparator c): Sorts the elements of the list according to the order induced by the comparator.
Note that the above methods signature use generics but I have removed them here for simplicity in reading. Let us one by one dig into how and when we can use both these methods.

Java Collections sort(List list)
Consider an ArrayList of String:


List<String> fruits = new ArrayList<String>();
fruits.add("Apple");
fruits.add("Orange");
fruits.add("Banana");
fruits.add("Grape");
Now, we will sort it using Collections.sort():


Collections.sort(fruits);
// Print the sorted list
System.out.println(fruits);
The output of this program will be:

[Apple, Banana, Grape, Orange]
Hence, we can see that Collections.sort() has sorted the list of String in Lexical order. And it does not return anything.

What if we have a list of custom objects? Of course, we can sort them as well.
Consider a class Fruit:


package com.journaldev.collections;
public class Fruit{
    private int id;
    private String name;
    private String taste;

    Fruit(int id, String name, String taste){
        this.id=id;
        this.name=name;
        this.taste=taste;
    }
}
Let’s create a list of Fruits:


List<Fruit> fruitList=new ArrayList<Fruit>();
Fruit apple=new Fruit(1, "Apple", "Sweet");
Fruit orange=new Fruit(2, "Orange", "Sour");
Fruit banana=new Fruit(4, "Banana", "Sweet");
Fruit grape=new Fruit(3, "Grape", "Sweet and Sour");

fruitList.add(apple);
fruitList.add(orange);
fruitList.add(banana);
fruitList.add(grape);
In order to sort this list, if we directly use the Collections.sort(List list), it will give a Compile Time Error because there is no natural ordering defined for the Fruit objects. So, it doesn’t know how to sort this list.

java collections sort, Java Collections.sort() method

For objects to have a natural order they must implement the interface java.lang.Comparable.

The Comparable interface has a method compareTo(), which returns a negative, 0, a positive if the current value is less than, equal to, or greater than the value we are comparing with, respectively.

Let’s enhance the Fruit class to implement Comparable interface. We are defining that the natural order of sorting is based on the “id” field of Fruit:


package com.journaldev.collections;
public class Fruit implements Comparable<Object>{
    private int id;
    private String name;
    private String taste;

    Fruit(int id, String name, String taste){
        this.id=id;
        this.name=name;
        this.taste=taste;
    }
    @Override 
    public int compareTo(Object o) {
        Fruit f = (Fruit) o; 
        return this.id - f.id ;
    }
}
Now that we have implemented Comparable, we can sort the list without any errors:


Collections.sort(fruitList);
fruitList.forEach(fruit -> {
    System.out.println(fruit.getId() + " " + fruit.getName() + " " + 
      fruit.getTaste());
});
The output will be as below:


1 Apple Sweet
2 Orange Sour
3 Grape Sweet and Sour
4 Banana Sweet
Java Collections sort(List list, Comparator c)
In order to define a custom logic for sorting, which is different from the natural ordering of the elements, we can implement the java.util.Comparator interface and pass an instance of it as the second argument of sort().

Let’s consider that we want to define the ordering based on the “name” field of the Fruit. We implement the Comparator, and in its compare() method, we need to write the logic for comparison:


package com.journaldev.collections;

class SortByName implements Comparator<Fruit> {
    @Override
    public int compare(Fruit a, Fruit b) {
        return a.getName().compareTo(b.getName());
    }
}
Now, we can sort it using this comparator:


Collections.sort(fruitList, new SortByName());
The output will be as below:


1 Apple Sweet
4 Banana Sweet
3 Grape Sweet and Sour
2 Orange Sour
Instead of writing new class for Comparator, using lambda function, we can provide sorting logic at runtime as well:


Collections.sort(fruitList, (a, b) -> {
    return a.getName().compareTo(b.getName());
});
Java Collections.reverseOrder
By default, Collection.sort performs the sorting in ascending order. If we want to sort the elements in reverse order we could use following methods:

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