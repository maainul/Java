package interviewQuestions.leetcode;

public class LinkedListNode {
	Node head;

	class Node {
		int data;
		Node nextNode;

		public Node(int data) {
			this.data = data;
			this.nextNode = null;
		}
	}

	public void insertAtFirst(int data) {
		Node newNode = new Node(data);
		newNode.nextNode = head;
		head = newNode;
	}

	public void insertAtLast(int data) {
		Node newNode = new Node(data);
		if (head == null) {
			head = newNode;
		} else {
			Node currentNode = head;
			while (currentNode.nextNode != null) {
				currentNode = currentNode.nextNode;
			}
			currentNode.nextNode = newNode;
		}
	}

	public void deleteFromLast() {
		Node currentNode = head;
		Node previousNode = null;
		while (currentNode.nextNode != null) {
			previousNode = currentNode;
			currentNode = currentNode.nextNode;
		}
		previousNode.nextNode = null;
	}

	public void deleteFromFirst() {
		Node currentNode = head;
		head = currentNode.nextNode;
		currentNode.nextNode = null;
	}

	public void insertAt(int pos, int data) {
		Node newNode = new Node(data);
		int count = 1;
		Node previousNode = head;
		while (count < pos) {
			previousNode = previousNode.nextNode;
			count++;
		}
		Node currentNode = previousNode.nextNode;
		newNode.nextNode = currentNode;
		previousNode.nextNode = newNode;

	}

	public void deleteAt(int pos) {
		int count = 1;
		Node previousNode = head;
		while (count < pos - 1) {
			previousNode = previousNode.nextNode;
			count++;
		}
		Node currentNode = previousNode.nextNode;
		previousNode.nextNode = currentNode.nextNode;
		currentNode.nextNode = null;

	}

	public Node reverseList(Node head) {
		Node current = head;
		Node previous = null;
		Node next = null;
		while (current != null) {
			next = current.nextNode;
			current.nextNode = previous;
			previous = current;
			current = next;
		}
		return previous;
	}

	public void display() {
		Node currentNode = head;
		if (head == null) {
			System.out.println("List is empty.");
			return;
		}
		while (currentNode != null) {
			System.out.print(currentNode.data + "--->");
			currentNode = currentNode.nextNode;
		}
	}

	// 1--2---3
	public Node reverselist(Node head) {
		Node currentNode = head;
		Node previousNode = null;
		Node nextNode = null;
		while (currentNode != null) {
			nextNode = currentNode.nextNode;
			currentNode.nextNode = previousNode;
			previousNode = currentNode;
			currentNode = nextNode;
		}
		return previousNode;

	}

	public Node rotateRight(Node head, int k) {
		// corner case
		if (head == null || k == 0) {
			return null;
		}
		// length of linkedlist
		Node p = head; // 1 //5
		int length = 1;
		while (p.nextNode != null) {

			p = p.nextNode;
			length++; // 5//5
		}
		p.nextNode = head; // 2 // 2
		k %= length; // 2 // 2

		// loop through for break list
		for (int i = 0; i < length - k; i++) {
			p = p.nextNode;
		}
		// 1 2 3 4 5
		// head = 4 //
		head = p.nextNode; // 5--1 ----2--3 --4---->null;
		p.nextNode = null;// 4--->null
		return head;

	}

	public static void main(String[] args) {
		LinkedListNode obj = new LinkedListNode();
		obj.insertAtFirst(1);
		obj.insertAtFirst(2);
		obj.insertAtFirst(3);
		obj.insertAtFirst(4);
		obj.insertAtFirst(6);
		obj.insertAtLast(4);
		// obj.deleteFromLast();
		// obj.deleteFromLast();
		obj.deleteAt(2);
		obj.insertAt(4, 10);
		obj.deleteFromFirst();

		obj.deleteAt(3);
		obj.display();

		obj.rotateRight(obj.head, 2);
		obj.display();
	}

}
