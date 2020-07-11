package dataStructureAndAlgorithms.LinkedList.Doubly;

public class DoublyLinkList {
	Node headNode; // instance variable this refer the first node head..
	Node tailNode; // instance variable this refer the last node..../..
	int length = 0;

	public DoublyLinkList() {
		this.headNode = null;
		this.tailNode = null;
		this.length = 0;
	}

	public int Length() {
		return length;
	}

	// insert at the beginning
	public void insertBeginning(int data) {
		Node node = new Node(data);
		if (headNode == null) {
			tailNode = node;
		} else {
			headNode.previousNode = node;

		}
		node.nextNode = headNode;
		headNode = node;
		length++;

	}

	public void insertAtLast(int data) {
		Node node = new Node(data);

		if (headNode == null) {
			headNode = node;
		} else {
			tailNode.nextNode = node;
			node.previousNode = tailNode;
		}
		tailNode = node;
		length++;
	}

	// insert with index number
	public void insertAt(int position, int data) {
		Node node = new Node(data);
		Node headTemp = headNode;
		int count = 1;
		if (position == 0) {
			insertBeginning(data);
		} else {
			while (count < position - 1) {
				headTemp = headTemp.nextNode;
				count++;
			}
			// 10-->8-->5--->9
			Node current = headTemp.nextNode;
			node.nextNode = current;
			current.previousNode = node;
			headTemp.nextNode = node;
			node.previousNode = headTemp;
			length++;
		}

	}

	public void deletebyPosition(int position) {
		Node tempheadNode = headNode;
		int count = 1;
		if (position == 0) {
			System.out.println("delete not posible");
		} else {
			while (count < position - 1) {
				tempheadNode = tempheadNode.nextNode;
				count++;
			}
			Node currentNode = tempheadNode.nextNode;
			tempheadNode.nextNode = currentNode.nextNode;
			currentNode.nextNode = null;
			currentNode.previousNode = tempheadNode;
			length--;
		}

	}

	// delete from last
	public void deleteLast() {
		if (isEmpty()) {
			System.out.println("No element");
		}
		Node tempNode = tailNode;
		if (headNode == tailNode) {
			headNode = null;
		} else {
			tailNode.previousNode.nextNode = null;
		}
		tailNode = tailNode.previousNode;
		tempNode.previousNode = null;
		length--;
	}

	// delete first node
	// 1. create temp variable store head data
	// 2. head note next = 2nd node & previous = 1st = null
	// 3. shift head
	// 4. temp node is null
	public void deleteFirst() {
		if (isEmpty()) {
			System.out.println("No element");
		}
		Node tempNode = headNode;
		if (headNode == tailNode) {
			tailNode = null;
		} else {
			headNode.nextNode.previousNode = null;
		}
		headNode = headNode.nextNode;
		tempNode.nextNode = null;
		length--;
	}

	private boolean isEmpty() {

		return length == 0;
	}

	// searcing value using while loop
	public void search(int SearchValue) {
		boolean flag = false;
		int count = 1;
		Node tempNode = headNode;
		while (tempNode != null) {
			if (tempNode.data == SearchValue) {
				flag = true;
				break;
			}
			count++;
			tempNode = tempNode.nextNode;

		}
		if (flag) {
			System.out.println("Data found in position: " + count);
		} else {
			System.out.println("data not found");
		}
	}

	public void displayForward() {
		if (headNode == null) {
			return;
		}

		Node n = headNode;
		while (n != null) {
			System.out.print(n.data + "-->");
			n = n.nextNode;
		}
		System.out.println("null");
	}

	public void displaybackward() {
		if (tailNode == null) {
			return;
		}

		Node n = tailNode;
		while (n != null) {
			System.out.print(n.data + "-->");
			n = n.previousNode;
		}
		System.out.println("null");
	}

}
