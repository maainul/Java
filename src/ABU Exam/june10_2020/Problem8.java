package june10_2020;

public class Problem8 {
	ListNode head;

	static class ListNode {
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

	private static void display(ListNode head) {
		ListNode cur = head;
		while (cur != null) {
			System.out.print(cur.data + " ");
			cur = cur.next;
		}
		System.out.println("null");
	}

	private static ListNode sumOfTwoList(ListNode l1, ListNode l2) {
		ListNode temp = null;
		ListNode result = null;
		ListNode pre = null;
		int sum = 0;
		int carry = 0;
		int p1, p2;
		while (l1 != null || l2 != null) {
			if (l1 != null) {
				p1 = l1.data;
				l1 = l1.next;
			} else {
				p1 = 0;
			}

			if (l2 != null) {
				p2 = l2.data;
				l2 = l2.next;
			} else {
				p2 = 0;
			}
			sum = p1 + p2 + carry;

			carry = (sum > 9) ? 1 : 0;

			sum = sum % 10;

			temp = new ListNode(sum);

			if (result == null) {
				result = temp;
			} else {
				pre.next = temp;
			}
			pre = temp;

			if (carry > 0) {
				temp.next = new ListNode(carry);
			}
		}

		return result;

	}

	public static void main(String[] args) {
		Problem8 obj1 = new Problem8();
		obj1.insertAtLast(5);
		obj1.insertAtLast(6);
		obj1.insertAtLast(3);

		System.out.println("Linked list");
		display(obj1.head);

		Problem8 obj2 = new Problem8();

		obj2.insertAtLast(8);
		obj2.insertAtLast(4);
		obj2.insertAtLast(2);

		System.out.println("\nLinked list");
		display(obj2.head);

		System.out.println("\nAfter Addition ");
		ListNode sumListNode = sumOfTwoList(obj1.head, obj2.head);

		display(sumListNode);
	}
}
