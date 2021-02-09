/*
Reverse a linked list from position m to n. Do it in one-pass.

Note: 1 ≤ m ≤ n ≤ length of list.

Example:


Input: 1->2->3->4->5->NULL, m = 2, n = 4
Output: 1->4->3->2->5->NULL
 */
package dataStructureAndAlgorithm.LinkedList;

public class _37_ReverseLinkedListII {

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

	private ListNode reverseII(int m, int n) {
		ListNode dummyHead = new ListNode(0);
		ListNode pre = dummyHead;
		dummyHead.next = head;

		int Mcounter = 0;
		while (Mcounter < m - 1) {
			pre = pre.next;
			Mcounter++;

		}
		ListNode current = pre.next;
		int count = 0;

		while (count < n - m) {
			ListNode nxt = current.next;
			current.next = nxt.next;
			nxt.next = pre.next;
			pre.next = nxt;
			count++;
			// 1 2 3 4 5 6 7
			// 1 2 [4 3] 5 6 7
			// 1 2 [5 4 3] 6 7
			// 1 2 [6 5 4 3] 7

		}
		return dummyHead.next;
	}

	public static void main(String[] args) {
		_37_ReverseLinkedListII reverseLinkedList = new _37_ReverseLinkedListII();
		reverseLinkedList.insertAtLast(1);
		reverseLinkedList.insertAtLast(2);
		reverseLinkedList.insertAtLast(3);
		reverseLinkedList.insertAtLast(4);
		reverseLinkedList.insertAtLast(5);
		reverseLinkedList.insertAtLast(6);
		reverseLinkedList.insertAtLast(7);
		System.out.println("\nOriginal");
		reverseLinkedList.display();
		System.out.println("\nAfter Reverse");
		reverseLinkedList.head = reverseLinkedList.reverseII(3, 6);
		reverseLinkedList.display();

	}
}
