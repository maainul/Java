package dataStructureAndAlgorithm.LinkedList.GeekForGeeksAllExamples._101_MakeMiddleNodeHeadInaLinkedList;

public class LinkedList {
	static Node head;

	class Node {

		int data;
		Node next;

		Node(int d) {
			data = d;
			next = null;
		}
	}

	void printList(Node node) {
		while (node != null) {
			System.out.print(node.data + " ");
			node = node.next;
		}
	}

	void push(int newdata) {
		Node mynode = new Node(newdata);
		mynode.next = head;
		head = mynode;
	}

	Node middle() {
		Node fastNode = head;
		Node slowNode = head;
		Node preNode = null;
		while (fastNode != null && fastNode.next != null) {
			preNode = slowNode;
			slowNode = slowNode.next;
			fastNode = fastNode.next.next;
		}
		// 1 2 3 4 5
		preNode.next = preNode.next.next;
		slowNode.next = head;
		head = slowNode;
		return head;

	}

	public static void main(String[] args) {
		LinkedList list = new LinkedList();

		// Creating the linkedlist
		for (int i = 5; i > 0; i--) {
			list.push(i);
		}
		System.out.println("Given Linked List :");
		list.printList(head);
		System.out.println();
		head = list.middle();
		list.printList(head);

	}

}
