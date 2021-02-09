package dataStructureAndAlgorithm.LinkedList;

public class _52_ConvertSinglyToCircularLinkedList {
	ListNode head;

	public static class ListNode {
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

	private static void display(ListNode head) {
		ListNode current = head;
		while (current != null) {
			System.out.print(current.data + " ");
			current = current.next;
		}
	}

	private ListNode circular() {
		ListNode start = head;
		while (head.next != null) {
			head = head.next;
		}
		head.next = start;
		return start;
	}

	private void displayCircular(ListNode head) {
		ListNode start = head;
		while (head.next != start) {
			System.out.print(head.data + " ");
			head = head.next;
		}
		System.out.print(head.data + " ");
	}

	public static void main(String[] args) {
		_52_ConvertSinglyToCircularLinkedList obj = new _52_ConvertSinglyToCircularLinkedList();
		obj.insertAtLast(1);
		obj.insertAtLast(2);
		obj.insertAtLast(3);
		obj.insertAtLast(4);
		obj.insertAtLast(5);
		System.out.println("\nSingly Linked list");
		_52_ConvertSinglyToCircularLinkedList.display(obj.head);

		System.out.println("\nCircular Linked list");
		ListNode head = obj.circular();
		obj.displayCircular(obj.head);
	}
}
