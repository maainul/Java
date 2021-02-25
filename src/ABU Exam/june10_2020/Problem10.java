package june10_2020;

public class Problem10 {
	ListNode head;

	class ListNode {
		int data;
		ListNode next;

		public ListNode(int data) {
			this.data = data;
			this.next = null;
		}
	}

	private void push(int data) {
		ListNode newNode = new ListNode(data);
		newNode.next = head;
		head = newNode;
	}

	private void display(ListNode head) {
		ListNode cur = head;
		while (cur != null) {
			System.out.print(cur.data + " ");
			cur = cur.next;
		}
		System.out.println("null");
	}

	private ListNode detectAndRemoveLoop(ListNode head) {
		ListNode p = head;
		ListNode q = head;
		while (q != null && q.next != null) {
			p = p.next;
			q = q.next.next;

			if (p == q) {
				System.out.println("Loop found...");
				removeLoop(head, p);
			}
		}
		return head;
	}

	private void removeLoop(ListNode head, ListNode p) {
		ListNode t = head;
		while (t != p.next) {
			t = t.next;
			p = p.next;
		}
		p.next = null;

	}

	public static void main(String[] args) {
		Problem10 obj = new Problem10();

		obj.push(5);
		obj.push(4);
		obj.push(3);
		obj.push(2);
		obj.push(1);

		obj.display(obj.head);

		obj.head.next.next.next.next = obj.head;

		obj.detectAndRemoveLoop(obj.head);

		obj.display(obj.head);

	}

}
