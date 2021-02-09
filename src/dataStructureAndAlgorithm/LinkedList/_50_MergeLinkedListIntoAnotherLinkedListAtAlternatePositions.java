package dataStructureAndAlgorithm.LinkedList;

public class _50_MergeLinkedListIntoAnotherLinkedListAtAlternatePositions {
	Node head;

	class Node {
		public int data;
		public Node next;

		public Node(int data) {
			this.data = data;
			this.next = null;
		}
	}

	public void alterMerge(Node a, Node b) {
		Node temp = a;// it will be needed to get the head of the new list
		while (a != null && b != null) {
			Node a1 = a.next;
			Node b1 = b.next;
			a.next = b;
			b.next = a1;
			a = a1;
			b = b1;
		}
		System.out.println("\nAlternate Merged List");
		display(temp);
		System.out.println("\nRemaining Second List");
		display(b);// b will be pointing to the ahead of the remaining list

	}

	public void display(Node head) {
		Node currNode = head;
		while (currNode != null) {
			System.out.print(currNode.data + " ");
			currNode = currNode.next;
		}
	}

	private void insertAtLast(int data) {
		Node newNode = new Node(data);
		Node current = head;

		if (head == null) {
			head = newNode;
		} else {
			while (current.next != null) {
				current = current.next;
			}
			current.next = newNode;
		}
	}

	public static void main(String[] args) throws java.lang.Exception {
		_50_MergeLinkedListIntoAnotherLinkedListAtAlternatePositions obj1 = new _50_MergeLinkedListIntoAnotherLinkedListAtAlternatePositions();
		_50_MergeLinkedListIntoAnotherLinkedListAtAlternatePositions obj2 = new _50_MergeLinkedListIntoAnotherLinkedListAtAlternatePositions();

		obj1.insertAtLast(5);
		obj1.insertAtLast(10);
		obj1.insertAtLast(105);
		obj1.insertAtLast(200);
		obj1.insertAtLast(215);

		obj2.insertAtLast(15);
		obj2.insertAtLast(110);
		obj2.insertAtLast(106);
		obj2.insertAtLast(201);
		obj2.insertAtLast(205);
		obj2.insertAtLast(205);
		obj2.insertAtLast(205);
		obj2.insertAtLast(205);
		obj2.insertAtLast(125);

		_50_MergeLinkedListIntoAnotherLinkedListAtAlternatePositions i = new _50_MergeLinkedListIntoAnotherLinkedListAtAlternatePositions();

		i.display(obj1.head);
		System.out.println("");

		i.display(obj2.head);
		i.alterMerge(obj1.head, obj2.head);
	}
}
