package dataStructureAndAlgorithm.LinkedList;

/*
Reverse a Linked List in groups of given size | Set 1
Given a linked list, write a function to reverse every k nodes
(where k is an input to the function).

Example:

        Input: 1->2->3->4->5->6->7->8->NULL, K = 3
        Output: 3->2->1->6->5->4->8->7->NULL

        Input: 1->2->3->4->5->6->7->8->NULL, K = 5
        Output: 5->4->3->2->1->8->7->6->NULL

 */
public class _33_ReverseLinkedList {
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

	private ListNode reverseWithGroup(ListNode head, int k) {
		ListNode current = head;
		ListNode previous = null;
		ListNode next = null;
		int count = 0;
		while (count < k && current != null) {
			next = current.next;
			current.next = previous;
			previous = current;
			current = next;
			count++;
		}
		if (next != null) {
			head.next = reverseWithGroup(next, k);
		}
		return previous;
	}

	// Leetcode code
	// With corner case
	public ListNode reverseKGroup(ListNode head, int k) {
		ListNode temp = head;
		int length = 0;
		while (temp != null) {
			length++;
			temp = temp.next;
		}
		if (k > length) {
			return head;
		}

		ListNode current = head;
		ListNode previous = null;
		int count = 0;
		while (count < k) {
			ListNode nxt = current.next;
			current.next = previous;
			previous = current;
			current = nxt;
			count++;
		}
		head.next = reverseKGroup(current, k);
		return previous;

	}

	public static void main(String[] args) {
		_33_ReverseLinkedList reverseLinkedList = new _33_ReverseLinkedList();
		reverseLinkedList.insertAtLast(1);
		reverseLinkedList.insertAtLast(2);
		reverseLinkedList.insertAtLast(3);
		reverseLinkedList.insertAtLast(4);
		reverseLinkedList.insertAtLast(5);
		System.out.println("\nOriginal");
		reverseLinkedList.display();
		System.out.println("\nAfter Reverse");
		reverseLinkedList.head = reverseLinkedList.reverseWithGroup(reverseLinkedList.head, 2);
		reverseLinkedList.display();

	}
}
