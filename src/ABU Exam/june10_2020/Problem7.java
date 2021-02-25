package june10_2020;

// Merge sort
public class Problem7 {

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
		if (head == null) {
			head = newNode;
		} else {
			ListNode cur = head;
			while (cur.next != null) {
				cur = cur.next;
			}
			cur.next = newNode;
		}
	}

	private void display() {
		ListNode cur = head;
		while (cur != null) {
			System.out.print(cur.data + " ");
			cur = cur.next;
		}
		System.out.println("null");
	}

	private ListNode mergeSort(ListNode head) {
		if (head == null || head.next == null) {
			return head;
		}
		ListNode middle = getMiddle(head);
		ListNode nextMiddle = middle.next;

		middle.next = null;

		ListNode left = mergeSort(head);
		ListNode right = mergeSort(nextMiddle);
		ListNode sortedList = merge(left, right);

		return sortedList;
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

	private ListNode getMiddle(ListNode head) {
		if (head == null) {
			return head;
		}
		ListNode slow = head;
		ListNode fast = head.next;
		while (fast != null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;
		}
		return slow;
	}

	public static void main(String[] args) {
		Problem7 obj = new Problem7();
		obj.insertAtLast(4);
		obj.insertAtLast(2);
		obj.insertAtLast(6);
		obj.insertAtLast(1);
		obj.insertAtLast(5);
		obj.insertAtLast(3);

		System.out.println("Linked list");
		obj.display();

		System.out.println("\nAfter merge sort");
		obj.mergeSort(obj.head);
		obj.display();

	}

}
