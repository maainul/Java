# Java List Interface

```
The Java.util.List is a child interface of Collection. 
It is an ordered collection of objects in which duplicate values can be stored. 
Since List preserves the insertion order, it allows positional access and insertion of elements. 
List Interface is implemented by the classes of ArrayList, LinkedList, Vector and Stack.
```
# Creating List Objects:

List is an interface, and the instances of List can be created by implementing various classes in the following ways:

```
	List a = new ArrayList();
	List b = new LinkedList();
	List c = new Vector(); 
	List d = new Stack(); 
	
```
# Operations on List:

```
List Interface extends Collection, 
hence it supports all the operations of Collection Interface, along with following additional operations:
```

# Positional Access:
```
List allows add, remove, get and set operations based on numerical positions of elements in List. 
```

# List provides following methods for these operations:

```
void add(int index, Object O): This method adds given element at specified index.

boolean addAll(int index, Collection c): This method adds all elements from specified collection to list. 
	First element gets inserted at given index. If there is already an element at that position, 
	that element and other subsequent elements(if any) are shifted to the right by increasing their index.

Object remove(int index): This method removes an element from the specified index. 
	It shifts subsequent elements(if any) to left and decreases their indexes by 1.

Object get(int index): This method returns element at the specified index.

Object set(int index, Object new): This method replaces element at given index with new element. 
	This function returns the element which was just replaced by new element.
```
# Search:
```
List provides methods to search element and returns its numeric position. 

Following two methods are supported by List for this operation:

int indexOf(Object o): This method returns first occurrence of given element or -1 
					   if element is not present in list.

int lastIndexOf(Object o): This method returns the last occurrence of given element 
	                       or -1 if element is not present in list.
```

# Iteration:
```
ListIterator(extends Iterator) is used to iterate over List element.
 
List iterator is bidirectional iterator. 

For more details about ListIterator refer Iterators in Java.
```
# Range-view:
```
List Interface provides a method to get the List view of the portion 
of given List between two indices. 
Following is the method supported by List for range view operation.

List subList(int fromIndex, int toIndex):This method returns List view of specified List between fromIndex(inclusive) and toIndex(exclusive).
```












