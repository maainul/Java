package dataStructureAndAlgorithm.LinkedList;

/*
Reverse a Linked List

Example:

        Input: 1->2->3->NULL,
        Output: 3-2-1-Null


 */
public class _33_NormalReverseLinkedList {
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

	private ListNode reverseWithGroup(ListNode head) {
		ListNode cur = head;
		ListNode pre = null;
		ListNode next = null;
		while (cur != null) {
			next = cur.next;
			cur.next = pre;
			pre = cur;
			cur = next;
		}
		return pre;
	}

	public static void main(String[] args) {
		_33_NormalReverseLinkedList reverseLinkedList = new _33_NormalReverseLinkedList();
		reverseLinkedList.insertAtLast(1);
		reverseLinkedList.insertAtLast(2);
		reverseLinkedList.insertAtLast(3);
		reverseLinkedList.insertAtLast(4);
		reverseLinkedList.insertAtLast(5);
		System.out.println("\nOriginal");
		reverseLinkedList.display();
		System.out.println("\nAfter Reverse");
		reverseLinkedList.head = reverseLinkedList.reverseWithGroup(reverseLinkedList.head);
		reverseLinkedList.display();

	}
}
