# Queue Data Structure

A Queue is a linear structure which follows a particular order in which the operations are performed. The order is 

## First In First Out (FIFO).

# Basic Operations

Queue operations may involve initializing or defining the queue, utilizing it, and then completely erasing it from the memory. 

Here we shall try to understand the basic operations associated with queues −

**enqueue() − add (store) an item to the queue.**

**dequeue() − remove (access) an item from the queue.**

Few more functions are required to make the above-mentioned queue operation efficient. These are −

**peek() − Gets the element at the front of the queue without removing it.**

**isfull() − Checks if the queue is full.**

**isempty() − Checks if the queue is empty**

![0_TRbfsq86lqDoqW6b](https://user-images.githubusercontent.com/37740006/109572435-61c9a000-7b17-11eb-8a8e-a2dd2bc3bbe2.png)

# LinkedList Implementation
## Node.java
``java
package dataStructureAndAlgorithm.Queue.LinkedListRepresentation;

public class Node {
	int data;
	Node nexNode;

	public Node(int data) {
		this.data = data;
		this.nexNode = null;
	}

}
```
## Queue.java
```java
package dataStructureAndAlgorithm.Queue.LinkedListRepresentation;

public class Queue {
	Node frontNode;
	Node rearNode;
	int length;

	public Queue() {

		this.frontNode = null;
		this.rearNode = null;
		this.length = 0;
	}

	public int length() {
		return length;
	}

	public boolean isEmpty() {
		return length == 0;
	}

	// inserting the value to the rear
	public void enqueue(int data) {
		Node node = new Node(data);
		if (isEmpty()) {
			frontNode = node;
		} else {
			rearNode.nexNode = node;
		}
		rearNode = node;
		length++;

	}

	// dequeue / delete the value from the queue ..
	public int dequeue() {
		if (isEmpty()) {
			System.out.println("No valuee in the list..");
		}
		int result = frontNode.data;
		frontNode = frontNode.nexNode;
		if (frontNode == null) {
			rearNode = null;
		}
		length--;
		return result;
	}

	// display the value..
	public void show() {
		Node currentNode = frontNode;
		while (currentNode != null) {
			System.out.print(currentNode.data + "--->");
			currentNode = currentNode.nexNode;
		}
		System.out.println(currentNode);

	}

}
```
## Main.java
```java
package dataStructureAndAlgorithm.Queue.LinkedListRepresentation;

public class Main {

	public static void main(String[] args) {
		Queue queue = new Queue();
		queue.enqueue(10);
		queue.enqueue(5);
		queue.enqueue(9);
		queue.show();
		queue.dequeue();
		queue.show();
	}

}
// 10--->5--->9--->null
// 5--->9--->null
```
