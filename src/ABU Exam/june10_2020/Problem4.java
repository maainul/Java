package june10_2020;

/*
Merge two sorted linked lists

Write a SortedMerge() function that takes two lists, 
each of which is sorted in increasing order,

and merges the two together into one list which is in increasing order. 
SortedMerge() should return the new list. 

The new list should be made by splicing together the nodes of the first two lists.

For example if the first linked list a is 5->10->15 and the other linked list b is 2->3->20,
then SortedMerge() should return a pointer to  

the head node of the merged list 2->3->5->10->15->20.
 */
public class Problem4 {

	ListNode head;

	class ListNode {
		int data;
		ListNode next;

		public ListNode(int data) {
			this.data = data;
			this.next = null;
		}
	}

	private void insertAtLast(int data) {
		ListNode newNode = new ListNode(data);
		ListNode c = head;
		if (c == null) {
			head = newNode;
		} else {
			while (c.next != null) {
				c = c.next;
			}
			c.next = newNode;
		}
	}

	public void display() {
		ListNode cur = head;
		while (cur != null) {
			System.out.print(cur.data + "-->");
			cur = cur.next;
		}
	}

	private ListNode mergeSort(ListNode head) {
		if (head == null || head.next == null) {
			return head;
		}
		ListNode middle = getMiddle(head);
		ListNode nextOfMiddle = middle.next;
		middle.next = null;
		ListNode left = mergeSort(head);
		ListNode right = mergeSort(nextOfMiddle);
		ListNode sortedlist = merge(left, right);
		return sortedlist;
	}

	// it will return middle value
	private ListNode getMiddle(ListNode head) {
		if (head == null) {
			return head;
		}
		ListNode first = head.next;
		ListNode slow = head;
		while (first != null && first.next != null) {
			slow = slow.next;
			first = first.next.next;
		}
		return slow;
	}

	private ListNode merge(ListNode left, ListNode right) {
		if (left == null) {
			return right;
		}
		if (right == null) {
			return left;
		}
		ListNode result = null;

		if (left.data <= right.data) {
			result = left;
			result.next = merge(left.next, right);
		} else {
			result = right;
			result.next = merge(left, right.next);
		}
		return result;
	}

	public static void main(String[] args) {
		Problem4 obj = new Problem4();
		obj.insertAtLast(5);
		obj.insertAtLast(9);
		obj.insertAtLast(19);
		obj.insertAtLast(3);
		obj.insertAtLast(15);
		obj.insertAtLast(12);

		System.out.println("\nBefore Merge sort");
		obj.display();

		System.out.println("\nAfter Merge sort");

		obj.mergeSort(obj.head);

		obj.display();
	}
}