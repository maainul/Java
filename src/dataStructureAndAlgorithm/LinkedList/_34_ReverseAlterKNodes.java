package dataStructureAndAlgorithm.LinkedList;

public class _34_ReverseAlterKNodes {
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

	private void display(ListNode head) {
		ListNode current = head;
		while (current != null) {
			System.out.print(current.data + "->");
			current = current.next;
		}
	}

	private ListNode revAlter(ListNode head, int k) {
		ListNode current = head;
		ListNode next = null, prev = null;
		int count = 0;

		/* 1) reverse first k nodes of the linked list */
		while (current != null && count < k) {
			next = current.next;
			current.next = prev;
			prev = current;
			current = next;
			count++;
		}

		System.out.println("\nHead :" + head.data);
		System.out.println("\ncurent :" + current.data);
		/*
		 * 2) Now head points to the kth node. So change next of head to (k+1)th node
		 */
		if (head != null) {
			head.next = current;
		}

		/*
		 * 3) We do not want to reverse next k nodes. So move the current pointer to
		 * skip next k nodes
		 */
		count = 0;
		while (count < k - 1 && current != null) {
			current = current.next;
			count++;
		}

		/*
		 * 4) Recursively call for the list starting from current->next. And make rest
		 * of the list as next of first node
		 */
		if (current != null) {
			current.next = revAlter(current.next, k);
		}

		/* 5) prev is new head of the input list */
		return prev;
	}

	public static void main(String[] args) {
		_34_ReverseAlterKNodes obj = new _34_ReverseAlterKNodes();
		obj.insertAtLast(1);
		obj.insertAtLast(2);
		obj.insertAtLast(3);
		obj.insertAtLast(4);
		obj.insertAtLast(5);
		obj.insertAtLast(6);
		obj.insertAtLast(7);
		obj.insertAtLast(8);
		obj.insertAtLast(9);
		obj.insertAtLast(10);

		obj.display(obj.head);
		System.out.println();
		System.out.println();
		obj.head = obj.revAlter(obj.head, 3);
		obj.display(obj.head);
	}
}
