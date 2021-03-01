# Stack Data Structure
Stack is a linear data structure which follows a particular order in which the operations are performed. 
The order may be LIFO(Last In First Out) or FILO(First In Last Out)

# Basic Operations

Stack operations may involve initializing the stack, using it and then de-initializing it. 

Apart from these basic stuffs, a stack is used for the following two primary operations −

**push() − Pushing (storing) an element on the stack.**

**pop() − Removing (accessing) an element from the stack.**

When data is PUSHed onto stack.

To use a stack efficiently, we need to check the status of stack as well. For the same purpose, the following functionality is added to stacks −

**peek() − get the top data element of the stack, without removing it.**

**isFull() − check if stack is full.**

**isEmpty() − check if stack is empty.**



<img width="407" alt="stack" src="https://user-images.githubusercontent.com/37740006/109570828-e7981c00-7b14-11eb-8a75-b505788b125b.png">

# LinkedList Implementation of Stack

```java
package dataStructureAndAlgorithm.Stack.LinkedListImplementation;

class Node {
	int data;
	Node nextNode;

	public Node(int data) {
		this.data = data;
	}

}
```
```java
package dataStructureAndAlgorithm.Stack.LinkedListImplementation;

class Stack {
	Node topNode;
	int length;

	public Stack() {
		topNode = null;
		length = 0;
	}

	public void push(int data) {
		Node node = new Node(data);
		node.nextNode = topNode;
		topNode = node;
		length++;
	}

	public int pop() {
		if (isEmpty()) {
			System.out.println("Stack is empty..");
		}

		int data = topNode.data;
		topNode = topNode.nextNode;
		length--;
		return data;

	}

	public int peek() {
		if (isEmpty()) {
			System.out.println("Stack is empty..");
		}

		return topNode.data;
	}

	public void show() {
		Node currentNode = topNode;
		while (currentNode != null) {
			System.out.print(currentNode.data + " ");
			currentNode = currentNode.nextNode;
		}
		System.out.println();
	}

	public int length() {
		return length;
	}

	public boolean isEmpty() {
		return length == 0;
	}
  }
  ```
  ```java
package dataStructureAndAlgorithm.Stack.LinkedListImplementation;


public class Main {

	public static void main(String args[]) {
		Stack stack = new Stack();
		System.out.println("Stack implementation using LinkedList..\n");
		System.out.println("Length of the stack is: " + stack.isEmpty());
		stack.push(8); // 0
		stack.push(6); // 1
		stack.push(7); // 2
		stack.show();
		System.out.println("Length of the stack is: " + stack.length());

		System.out.println("Pop element is : " + stack.pop());
		stack.show();
		System.out.println("Length of the stack is: " + stack.length());

		System.out.println("Pop element is : " + stack.pop());
		stack.show();
		System.out.println("Length of the stack is: " + stack.length());

		System.out.println("peek element is : " + stack.peek());

	}

}
/*
 * Output: Stack implementation using LinkedList..
 * 
 * Length of the stack is: true 7 6 8 Length of the stack is: 3 Pop element is :
 * 7 6 8 Length of the stack is: 2 Pop element is : 6 8 Length of the stack is:
 * 1 peek element is : 8
 */
 ```
