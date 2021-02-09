package dataStructureAndAlgorithm.LinkedList;
/*
Insert Node at beginning
1--->2--->4-->null

Want to add 5 in front..

5-->1-->2---4-->null

 */

public class _2_InsertAtBeginning {
	ListNode head;

	public class ListNode {
		int data;
		ListNode next;

		ListNode(int data) {
			this.data = data;
			this.next = null;
		}
	}

	private void display() {
		ListNode current = head;
		while (current != null) {
			System.out.print(current.data + "->");
			current = current.next;
		}
	}

	private void insertAtBeginning(int val) {
		ListNode newNode = new ListNode(val);
		newNode.next = head;
		head = newNode;
	}

	public static void main(String[] args) {
		_2_InsertAtBeginning obj = new _2_InsertAtBeginning();
		obj.insertAtBeginning(1);
		obj.insertAtBeginning(2);
		obj.display();
		System.out.println();

	}
}
