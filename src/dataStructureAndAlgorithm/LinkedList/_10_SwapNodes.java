package dataStructureAndAlgorithm.LinkedList;
/*
Swap nodes in a linked list without swapping data
Given a linked list and two keys in it, swap nodes for two given keys.
Nodes should be swapped by changing links.
Swapping data of nodes may be expensive in many situations when data contains many fields.
It may be assumed that all keys in linked list are distinct.

Examples:

Input:  10->15->12->13->20->14,  x = 12, y = 20
Output: 10->15->20->13->12->14

Input:  10->15->12->13->20->14,  x = 10, y = 20
Output: 20->15->12->13->10->14

Input:  10->15->12->13->20->14,  x = 12, y = 13
Output: 10->15->13->12->20->14
 */

public class _10_SwapNodes {

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

	@SuppressWarnings("unused")
	private ListNode reverseII(int m, int n) {
		ListNode dummyHead = new ListNode(0);
		ListNode pre = dummyHead;
		dummyHead.next = head;
		for (int i = 0; i < m - 1; i++) {
			pre = pre.next;
		}
		ListNode previous = null;
		ListNode current = pre.next;
		for (int j = 0; j < n - m; j++) {
			ListNode nxt = current.next;
			current.next = nxt.next;
			nxt.next = pre.next;
			pre.next = nxt;

			// 1 2 3 4 5 6 7
			// 1 2 [4 3] 5 6 7
			// 1 2 [5 4 3] 6 7
			// 1 2 [6 5 4 3] 7
		}
		return dummyHead.next;
	}

	public void swapNodes(int x, int y) {
		// Nothing to do if x and y are same
		if (x == y)
			return;

		// Search for x (keep track of prevX and CurrX)
		ListNode prevX = null, currX = head;
		while (currX != null && currX.data != x) {
			prevX = currX;
			currX = currX.next;
		}

		// Search for y (keep track of prevY and currY)
		ListNode prevY = null, currY = head;
		while (currY != null && currY.data != y) {
			prevY = currY;
			currY = currY.next;
		}

		// If either x or y is not present, nothing to do
		if (currX == null || currY == null)
			return;

		// Swap next pointers
		ListNode temp = currY.next;
		currY.next = currX.next;
		currX.next = temp;

		// If x is not head of linked list
		if (prevX != null)
			prevX.next = currY;
		else // make y the new head
			head = currY;

		// If y is not head of linked list
		if (prevY != null)
			prevY.next = currX;
		else // make x the new head
			head = currX;
	}

	public static void main(String[] args) {
		_10_SwapNodes obj = new _10_SwapNodes();
		obj.insertAtLast(1);
		obj.insertAtLast(2);
		obj.insertAtLast(3);
		obj.insertAtLast(4);
		obj.insertAtLast(5);
		obj.insertAtLast(6);
		obj.insertAtLast(7);
		System.out.println("\nOriginal");
		obj.display();
		System.out.println("\nAfter Reverse");
		/*
		 * obj.head = obj.reverseII(3,6); obj.display();
		 */
		obj.swapNodes(4, 6);
		obj.display();

	}
}
