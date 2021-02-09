package dataStructureAndAlgorithm.LinkedList;

/*
1->2->3->4->

1->2->10->3->4->


 */
public class CompareTwoLinkedList {
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

	private void insertNode(ListNode head, int k, int data) {

	}

	public static void main(String[] args) {
		CompareTwoLinkedList obj = new CompareTwoLinkedList();
		obj.insertAtLast(1);
		obj.insertAtLast(2);
		obj.insertAtLast(3);
		obj.insertAtLast(4);

		CompareTwoLinkedList obj2 = new CompareTwoLinkedList();
		obj2.insertAtLast(1);
		obj2.insertAtLast(2);
		obj2.insertAtLast(3);

		obj.display();
		System.out.println();

		System.out.println(obj.compareLinkedList(obj.head, obj2.head));

	}

	private boolean compareLinkedList(ListNode head1, ListNode head2) {
		ListNode temp1 = head1;
		int fCount = 0;
		while (temp1 != null) {
			fCount++;
			temp1 = temp1.next;
		}

		ListNode temp2 = head2;
		int sCount = 0;
		while (temp2 != null) {
			sCount++;
			temp2 = temp2.next;
		}

		if (fCount != sCount) {
			return false;
		}

		ListNode l1 = head1;
		ListNode l2 = head2;
		while (l1 != null && l2 != null) {

			if (l1.data != l2.data) {
				return false;
			}
			l1 = l1.next;
			l2 = l2.next;
		}

		return true;
	}

}
