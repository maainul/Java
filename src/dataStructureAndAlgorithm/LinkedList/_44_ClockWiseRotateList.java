package dataStructureAndAlgorithm.LinkedList;

/*
Clockwise rotation of Linked List

Given a singly singly linked list and an integer K, 
the task is to rotate the linked list clockwise to the right by K places.

Examples:

Input: 1 -> 2 -> 3 -> 4 -> 5 -> NULL, K = 2
Output: 4 -> 5 -> 1 -> 2 -> 3 -> NULL


Input: 7 -> 9 -> 11 -> 13 -> 3 -> 5 -> NULL, K = 12
Output: 7 -> 9 -> 11 -> 13 -> 3 -> 5 -> NULL

Leet code : 61. Rotate List

Given a linked list, rotate the list to the right by k places, where k is non-negative.

Example 1:

Input: 1->2->3->4->5->NULL, k = 2
Output: 4->5->1->2->3->NULL
Explanation:
rotate 1 steps to the right: 5->1->2->3->4->NULL
rotate 2 steps to the right: 4->5->1->2->3->NULL
Example 2:

Input: 0->1->2->NULL, k = 4
Output: 2->0->1->NULL
Explanation:
rotate 1 steps to the right: 2->0->1->NULL
rotate 2 steps to the right: 1->2->0->NULL
rotate 3 steps to the right: 0->1->2->NULL
rotate 4 steps to the right: 2->0->1->NULL

*/

//Java implementation of the approach 
//Java implementation of the approach 
public class _44_ClockWiseRotateList {
	static Node head;

	/* Link list node */
	static class Node {
		int data;
		Node next;

		public Node(int data) {
			this.data = data;
			this.next = null;
		}

	}

	private void insertAtBeginning(int data) {
		Node newNode = new Node(data);
		newNode.next = head;
		head = newNode;

	}

	/* A utility function to print linked list */
	static void printList(Node head) {
		while (head != null) {
			System.out.print(head.data + " -> ");
			head = head.next;
		}
		System.out.print("null");
	}

	static Node rightRotate(Node head, int k) {
		// If the linked list is empty
		if (head == null)
			return head;

		// len is used to store length of the linked list
		// tmp will point to the last node after this loop
		Node tmp = head;
		int len = 1;
		while (tmp.next != null) {
			tmp = tmp.next;
			len++;
		}

		// If k is greater than the size
		// of the linked list
		if (k > len)
			k = k % len;

		// Subtract from length to convert
		// it into left rotation
		k = len - k;

		// If no rotation needed then
		// return the head node
		if (k == 0)
			return head;

		// current will either point to
		// kth or null after this loop
		Node current = head;
		int cnt = 1;
		while (cnt < k && current != null) {
			current = current.next;
			cnt++;
		}

		// If current is null then k is equal to the
		// count of nodes in the list
		// Don't change the list in this case
		if (current == null)
			return head;

		// current points to the kth node
		Node kthnode = current;

		// Change next of last node to previous head
		tmp.next = head;

		// Change head to (k+1)th node
		head = kthnode.next;

		// Change next of kth node to null
		kthnode.next = null;

		// Return the updated head pointer
		return head;
	}

//Driver code 
	public static void main(String args[]) {

		_44_ClockWiseRotateList obj = new _44_ClockWiseRotateList();

		obj.insertAtBeginning(60);
		obj.insertAtBeginning(50);
		obj.insertAtBeginning(40);
		obj.insertAtBeginning(30);
		obj.insertAtBeginning(20);
		obj.insertAtBeginning(10);

		System.out.println("Given linked list");
		printList(head);
		System.out.println();

		int k = 2;

		Node updated_headNode = rightRotate(head, k);
		System.out.println("\nRotate linked list");

		// Print the rotated linked list
		printList(updated_headNode);

	}
}
/*
 * Given linked list 10 -> 20 -> 30 -> 40 -> 50 -> 60 -> null
 * 
 * k = 2
 * 
 * Rotate linked list 50 -> 60 -> 10 -> 20 -> 30 -> 40 -> null
 */