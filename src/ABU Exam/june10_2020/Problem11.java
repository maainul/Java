package june10_2020;

public class Problem11 {
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

	private void display(ListNode head) {
		ListNode cur = head;
		while (cur != null) {
			System.out.print(cur.data + " ");
			cur = cur.next;
		}
		System.out.println("null");
	}

	public static void main(String[] args) {
		Problem11 obj = new Problem11();
		obj.insertAtLast(1);
		obj.insertAtLast(2);
		obj.insertAtLast(3);

		System.out.println("\nLinked list");

		obj.display(obj.head);

	}

}
