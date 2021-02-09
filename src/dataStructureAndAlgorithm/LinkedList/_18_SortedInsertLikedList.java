package dataStructureAndAlgorithm.LinkedList;

/*
Given a linked list which is sorted, how will you insert in sorted way
Given a sorted linked list and a value to insert, write a function to insert the value in a sorted way.

Initial Linked List
    0 3 5 18 20
SortedLinked List
    0 3 5 18 20
Linked List after insertion of 9
    0 3 5 9 18 20
UpdatedSortedLinked List
 
 */
public class _18_SortedInsertLikedList {
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

	private void sortedInsert(int data) {
		ListNode newNode = new ListNode(data);
		ListNode current = head;
		ListNode previous = null;
		if (head == null || head.data >= newNode.data) {
			newNode.next = head;
			head = newNode;
		} else {
			while (current != null && current.data <= newNode.data) {
				previous = current;
				current = current.next;
			}
			previous.next = newNode;
			newNode.next = current;
		}
	}

	public static void main(String[] args) {
		_18_SortedInsertLikedList obj = new _18_SortedInsertLikedList();
		obj.insertAtLast(1);
		obj.insertAtLast(2);
		obj.insertAtLast(3);
		obj.insertAtLast(5);
		obj.insertAtLast(7);
		System.out.println("\nOriginal Linked List ");
		obj.display();
		obj.sortedInsert(0);
		obj.sortedInsert(-1);
		// obj.sortedInsert(6);
		System.out.println("\nSorted Inserted");
		obj.display();
	}
}
