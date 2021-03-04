package nov25._1_MergeReverseOfTwoLinkedList;

public class MergeSortedList {
	ListNode head;

	public class ListNode {
		int data;
		ListNode next;

		ListNode(int data) {
			this.data = data;
			this.next = null;
		}
	}

	private void insertAtLast(int data) {
		ListNode newNode = new ListNode(data);
		ListNode current = head;
		if (head == null) {
			head = newNode;
		} else {
			while (current.next != null) {
				current = current.next;
			}
			current.next = newNode;
		}
	}

	private void display() {
		ListNode current = head;
		while (current != null) {
			System.out.print(current.data + "->");
			current = current.next;
		}
	}

	private ListNode mergeTwoSortedLinkedList(ListNode l1, ListNode l2) {
		ListNode head = null;
		ListNode result = null;

		while (l1 != null || l2 != null) {
			int value;
			if (l1 == null) {
				value = l2.data;
				l2 = l2.next;
			} else if (l2 == null) {
				value = l1.data;
				l1 = l1.next;
			} else if (l1.data <= l2.data) {
				value = l1.data;
				l1 = l1.next;
			} else {
				value = l2.data;
				l2 = l2.next;
			}

			if (result == null) {
				result = new ListNode(value);
				head = result;
			} else {
				result.next = new ListNode(value);
				result = result.next;
			}

		}
		return reverse(head);
	}

	private ListNode reverse(ListNode head) {
		ListNode current = head;
		ListNode previous = null;
		ListNode next = null;
		while (current != null) {
			next = current.next;
			current.next = previous;
			previous = current;
			current = next;
		}
		return previous;
	}

	public static void main(String[] args) {
		MergeSortedList l1 = new MergeSortedList();
		MergeSortedList l2 = new MergeSortedList();

		// Node head1 = new Node(5);
		l1.insertAtLast(5);
		l1.insertAtLast(10);
		l1.insertAtLast(15);
		l1.display();
		System.out.println();
		// Node head2 = new Node(2);
		l2.insertAtLast(2);
		l2.insertAtLast(3);
		l2.insertAtLast(20);
		l2.display();

		l1.head = new MergeSortedList().mergeTwoSortedLinkedList(l1.head, l2.head);

		System.out.println("\n Merge two sorted linked lists");
		l1.display();

	}
}

/*
 * 5->10->15-> 2->3->20-> 16. Merge two sorted linked lists
 * 2->3->5->10->15->20->
 */