package leetcode;

//Linked list operations in Java

public class SinglyLinkedList {
	Node head;

// Create a node
	class Node {
		int data;
		Node next;

		Node(int d) {
			data = d;
			next = null;
		}
	}

	public void insertAtBeginning(int new_data) {
		// insert the data
		Node new_node = new Node(new_data);
		new_node.next = head;
		head = new_node;
	}

	public void insertAfter(Node prev_node, int new_data) {
		if (prev_node == null) {
			System.out.println("The given previous node cannot be null");
			return;
		}
		Node new_node = new Node(new_data);
		new_node.next = prev_node.next;
		prev_node.next = new_node;
	}

	public void insertAtEnd(int new_data) {
		Node new_node = new Node(new_data);

		if (head == null) {
			head = new Node(new_data);
			return;
		}

		new_node.next = null;

		Node last = head;
		while (last.next != null)
			last = last.next;

		last.next = new_node;
		return;
	}

	void deleteNode(int position) {
		Node previous = head;
		int count = 1;
		if (position == 0) {
			System.out.println("delete not posible");
		} else {
			while (count < position - 1) {
				previous = previous.next;
				count++;
			}
			Node current = previous.next;
			previous.next = current.next;
			current.next = null;
		}
	}

	Node deleteNode2(int position) {
		Node revHeadNode = reverseList(head);
		Node revHedNodeCopy = revHeadNode;// 5-> 4-> 3-> 2-> 1
		Node previousNode = revHeadNode;
		int count = 1;
		if (position == 0) {
			return null;
		} else {
			while (count < position - 1) {
				previousNode = previousNode.next;
				count++;
			}
			Node currentNode = previousNode.next;
			previousNode.next = currentNode.next;
			currentNode.next = null;
		}

		return reverseList(revHedNodeCopy);

	}

	public Node reverseList(Node head) {
		Node current = head;
		Node previous = null;
		Node next = null;
		while (current != null) {
			next = current.next;
			current.next = previous;
			previous = current;
			current = next;
		}
		return previous;
	}

	public void printList() {
		Node tnode = head;
		while (tnode != null) {
			System.out.print(tnode.data + " ");
			tnode = tnode.next;
		}
	}

	public static void main(String[] args) {
		SinglyLinkedList llist = new SinglyLinkedList();

		llist.insertAtEnd(1);
		llist.insertAtBeginning(2);
		llist.insertAtBeginning(3);
		llist.insertAtEnd(4);
		llist.insertAfter(llist.head.next, 5);

		System.out.println("Linked list: ");
		llist.printList();

		System.out.println("\nAfter deleting an element: ");
		llist.deleteNode(3);
		llist.printList();

		System.out.println("\nAfter deleting an element:(reverse) ---- 2");
		llist.deleteNode2(2);
		llist.printList();
	}
}
