package dataStructureAndAlgorithm.LinkedList.GeekForGeeksAllExamples._28_MergeTwoSortedLinkedListsSuchThatMergedlistIsInReverseOrder;

public class _28_MergeReverse {

	Node head;

	public void push(int data) {
		Node newNode = new Node(data);
		newNode.next = head;
		head = newNode;
	}

	public void addToTheLast(Node node) {

		if (head == null) {
			head = node;
			return;
		}
		Node curNode = head;
		while (curNode.next != null) {
			curNode = curNode.next;
		}
		curNode.next = node;
	}

	public void printList() {

		Node curNode = head;
		while (curNode != null) {
			System.out.print(curNode.data + " ");
			curNode = curNode.next;
		}
	}

	public void printNode(Node head) {

		Node curNode = head;
		while (curNode != null) {
			System.out.print(curNode.data + " ");
			curNode = curNode.next;
		}
	}

	public Node reverseLinkedList(Node head) {
		Node curNode = head;
		Node prevNode = null;

		while (curNode != null) {
			Node nextNode = curNode.next;
			curNode.next = prevNode;
			prevNode = curNode;
			curNode = nextNode;
		}
		return prevNode;

	}

	public static void main(String[] args) {
		_28_MergeReverse llist1 = new _28_MergeReverse();
		_28_MergeReverse llist2 = new _28_MergeReverse();

		// Node head1 = new Node(5);
		llist1.addToTheLast(new Node(5));
		llist1.addToTheLast(new Node(10));
		llist1.addToTheLast(new Node(15));

		// Node head2 = new Node(2);
		llist2.addToTheLast(new Node(2));
		llist2.addToTheLast(new Node(3));
		llist2.addToTheLast(new Node(20));

		llist1.head = new _28_MergeReverse().sortedMerge(llist1.head, llist2.head);
		llist1.printList();
		System.out.println();

	}

	private Node sortedMerge(Node headA, Node headB) {
		Node dummyNode = new Node(0);
		Node head = dummyNode;

		Node l1 = headA;
		Node l2 = headB;

		while (l1 != null || l2 != null) {
			if (l1 == null) {
				head.next = l2;
				l2 = l2.next;
			} else if (l2 == null) {
				head.next = l1;
				head = head.next;
			} else if (l1.data <= l2.data) {
				head.next = l1;
				l1 = l1.next;
			} else {
				head.next = l2;
				l2 = l2.next;
			}
			head = head.next;

		}

		return dummyNode.next;

	}

}
