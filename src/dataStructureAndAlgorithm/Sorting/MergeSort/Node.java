package dataStructureAndAlgorithm.Sorting.MergeSort;

public class Node {
	Node head;
	int data;
	Node next;
	int length = 0;

	Node(int data) {
		this.data = data;
		this.next = null;
	}

	Node() {

	}

	void display(Node head) {
		Node current = head;
		while (current != null) {
			System.out.print(current.data + "-->");
			current = current.next;
		}
		System.out.println(current);
	}

	/*
	 * Node push(int i) { Node newNode = new Node(i); newNode.next = head; head =
	 * newNode; length++; return this; }
	 */
	void insertAtlast(int data) {
		Node node = new Node(data);
		if (head == null) {
			head = node;
		} else {
			Node currentNode = head;
			while (currentNode.next != null) {
				currentNode = currentNode.next;
			}
			currentNode.next = node;
		}

	}

	public int getLength() {
		return length;
	}
}