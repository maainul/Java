package dataStructureAndAlgorithm.LinkedList;

/*

Given a ‘key’, delete the first occurrence of this key in linked list.
To delete a node from linked list, 

we need to do following steps.	
	1) Find previous node of the node to be deleted.
	2) Change the next of previous node.
	3) Free memory for the node to be deleted.
 */
public class _47_DeleteANode {
	ListNode head;

	class ListNode {
		int data;
		ListNode next;

		public ListNode(int data) {
			this.data = data;
			this.next = null;
		}
	}

	private void display(ListNode head) {
		while (head != null) {
			System.out.print(head.data + " ");
			head = head.next;
		}
	}

	private void insertAtLast(int data) {
		ListNode newNode = new ListNode(data);
		if (head == null) {
			head = newNode;
		} else {
			ListNode current = head;
			while (current.next != null) {
				current = current.next;
			}
			current.next = newNode;
		}
	}

	private void deleteNode(ListNode head, int key) {
		ListNode current = head;
		ListNode previous = null;
		while (current != null && current.data != key) {
			previous = current;
			current = current.next;
		}
		if (current == null) {
			return;
		}
		previous.next = current.next;
	}

	public static void main(String args[]) {
		_47_DeleteANode obj = new _47_DeleteANode();

		obj.insertAtLast(1);
		obj.insertAtLast(2);
		obj.insertAtLast(3);
		obj.insertAtLast(4);
		obj.insertAtLast(5);

		System.out.println("Before Delete list : ");
		obj.display(obj.head);

		obj.deleteNode(obj.head, 3);

		System.out.printf("\n\nAfter deletion :\n");
		obj.display(obj.head);
	}

}
/*
Before Delete list : 
1 2 3 4 5 

Delete =  3 

After deletion :
1 2 4 5 
*/