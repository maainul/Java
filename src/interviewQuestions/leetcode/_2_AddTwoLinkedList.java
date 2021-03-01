package interviewQuestions.leetcode;

public class _2_AddTwoLinkedList {

	private static Node head;

	private static class Node {
		private int value;
		private Node next;

		Node(int value) {
			this.value = value;

		}
	}

	public void addToTheLast(Node node) {

		if (head == null) {
			head = node;
		} else {
			Node temp = head;
			while (temp.next != null)
				temp = temp.next;

			temp.next = node;
		}
	}

	public void printList(Node printNode) {
		Node temp = printNode;
		while (temp != null) {
			System.out.format("%d ", temp.value);
			temp = temp.next;
		}
		System.out.println();
	}

	public static Node reverseLinkedList(Node node) {
		if (node == null || node.next == null) {
			return node;
		}

		Node remaining = reverseLinkedList(node.next);
		node.next.next = node;
		node.next = null;
		return remaining;
	}

	// This function will do sum of numbers represented by linked list
	public Node findSumOfNumbers(Node first, Node second) {
		Node res = null; // res is head node of the resultant list
		Node prev = null;
		Node temp = null;
		int carry = 0, sum;

		while (first != null || second != null) // while both lists exist
		{
			// Calculate value of next digit in resultant list.
			// The next digit is sum of following things
			// (i) Carry
			// (ii) Next digit of first list (if there is a next digit)
			// (ii) Next digit of second list (if there is a next digit)
			sum = carry + (first != null ? first.value : 0) + (second != null ? second.value : 0);

			// update carry for next calulation
			carry = (sum >= 10) ? 1 : 0;

			// update sum if it is greater than 10
			sum = sum % 10;

			// Create a new node with sum as data
			temp = new Node(sum);

			// if this is the first node then set it as head of
			// the resultant list
			if (res == null) {
				res = temp;
			} else // If this is not the first node then connect it to the rest.
			{
				prev.next = temp;
			}

			// Set prev for next insertion
			prev = temp;

			// Move first and second pointers to next nodes
			if (first != null) {
				first = first.next;
			}
			if (second != null) {
				second = second.next;
			}
		}

		if (carry > 0) {
			temp.next = new Node(carry);
		}

		// return head of the resultant list
		return res;
	}

	public static void main(String[] args) {
		_2_AddTwoLinkedList list = new _2_AddTwoLinkedList();
		// Creating a linked list
		Node head1 = new Node(5);
		list.addToTheLast(head1);
		list.addToTheLast(new Node(6));
		list.addToTheLast(new Node(7));
		list.addToTheLast(new Node(1));
		list.addToTheLast(new Node(2));
		System.out.print("Number 1:  ");
		list.printList(head1);
		head = null;
		Node head2 = new Node(6);
		list.addToTheLast(head2);
		list.addToTheLast(new Node(3));
		list.addToTheLast(new Node(5));
		list.addToTheLast(new Node(9));

		System.out.print("Number 2:  ");
		list.printList(head2);
		// Reversing first linkedList
		head1 = reverseLinkedList(head1);

		// Reversing second linkedList
		head2 = reverseLinkedList(head2);

		// function to find sum of two linkedlist represent by number
		Node result = list.findSumOfNumbers(head1, head2);
		// Reverse the above linkedlist to get actual sum
		result = reverseLinkedList(result);
		System.out.print("Sum:  ");
		list.printList(result);
	}
}
/*
 * When you run above program , you will get following output:
 * 
 * 1 2 3 4 5
 * 
 * Number 1: 5 6 7 1 2 Number 2: 6 3 5 9 Sum: 6 3 0 7 1
 */