package dataStructureAndAlgorithm.LinkedList;

/*
Write a removeDuplicates() function which takes a list and deletes any duplicate nodes from the list.
The list is not sorted.
For example if the linked list is

12->11->12->21->41->43->21
then removeDuplicates() should convert the list to

12->11->21->41->43.

Linked list before removing duplicates:
 10 12 11 11 12 11 10
Linked list after removing duplicates:
 10 12 11
 */
public class _24_RemoveDuplicateFromUnSortedList {
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

	// https://stackoverflow.com/questions/17643790/remove-duplicates-from-an-unsorted-linked-list
	private void removeDuplicateUnsorted() {
		if (head == null) {
			return;
		}
		ListNode current = head;
		while (current != null) {
			ListNode runner = current;
			while (runner.next != null) {
				if (runner.next.data == current.data) {
					runner.next = runner.next.next;
				} else {
					runner = runner.next;
				}
			}
			current = current.next;
		}
	}

	public static void main(String[] args) {
		_24_RemoveDuplicateFromUnSortedList obj = new _24_RemoveDuplicateFromUnSortedList();

		obj.insertAtLast(3);
		obj.insertAtLast(4);
		obj.insertAtLast(1);
		obj.insertAtLast(2);
		obj.insertAtLast(5);
		obj.insertAtLast(5);
		obj.insertAtLast(6);
		obj.insertAtLast(1);
		obj.insertAtLast(2);
		System.out.println("Original LinkedList: ");
		obj.display();
		System.out.println();
		System.out.println("After Remove duplicate LinkedList:");
		obj.removeDuplicateUnsorted();
		obj.display();

	}
}
