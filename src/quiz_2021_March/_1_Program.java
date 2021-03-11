package quiz_2021_March;

public class _1_Program {

	public Node removeFromNthEnd(Node head, int d) {
		if (head == null) {
			return head;
		}
		if (head.next == null && d == 1) {
			return null;
		}
		Node temp = head;
		Node result = head;
		int len = 0;
		while (temp != null) {
			len++;
			temp = temp.next;
		}
		int k = len - d;
		Node cur = head;
		int count = 0;
		Node pre = null;

		while (cur != null && count < k) {
			pre = cur;
			cur = cur.next;
			count++;
		}
		pre.next = cur.next;

		return result;

	}

	public static void main(String[] args) {

		Node list = new Node();
		list.insertAtLast(1);
		list.insertAtLast(2);
		list.insertAtLast(3);
		list.insertAtLast(4);
		list.insertAtLast(5);
		list.insertAtLast(6);
		list.insertAtLast(7);

		System.out.println("Before Delete list");
		Node node = new Node();
		node.display(list.head);

		System.out.println("\nAfter Delete list");
		_1_Program obj = new _1_Program();
		Node newHead = obj.removeFromNthEnd(list.head, 3);
		
		node.display(newHead);

	}

}
