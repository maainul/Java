// https://github.com/maainul/Java/blob/master/src/linkedList/images/56.1.png

// https://github.com/maainul/Java/blob/master/src/linkedList/images/56.2.png

package dataStructureAndAlgorithm.LinkedList;

public class _56_MakeaLoopAtkthPosition {

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

	private static void printLoop(ListNode head, int total_nodes) {
		ListNode cur = head;
		int count = 0;
		while (count < total_nodes) {
			System.out.print(cur.data + " ");
			count++;
			cur = cur.next;
		}
	}

	private ListNode makeLoop(ListNode head, int i) {

		// traverse the linked list until loop
		// point not found
		ListNode temp = head;
		int count = 1;
		while (count < i) {
			temp = temp.next;
			count++;
		}
		// backup the joint point
		ListNode joint_node = temp;
		while (temp.next != null) {
			temp = temp.next;
		}
		// joint the last node to k-th element
		temp.next = joint_node;
		return head;
	}

	private static int countNodes(ListNode head) {
		int count = 0;
		while (head != null) {
			head = head.next;
			count++;
		}
		return count;
	}

	public static void main(String[] args) {
		_56_MakeaLoopAtkthPosition obj1 = new _56_MakeaLoopAtkthPosition();
		obj1.insertAtLast(7);
		obj1.insertAtLast(8);
		obj1.insertAtLast(3);
		obj1.insertAtLast(5);
		obj1.insertAtLast(17);

		int total_nodes = countNodes(obj1.head);
		System.out.println("Original Linked list");
		printLoop(obj1.head, total_nodes);

		System.out.println("\nAfter making loop");
		obj1.makeLoop(obj1.head, 4);

		printLoop(obj1.head, total_nodes);

	}

}
