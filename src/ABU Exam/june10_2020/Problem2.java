package june10_2020;
// Find Length of a Linked List (Iterative and Recursive) 

public class Problem2 {
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

	private int length() {
		ListNode temp = head;
		int count = 0;
		while (temp != null) {
			count++;
			temp = temp.next;
		}
		return count;
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
		Problem2 obj = new Problem2();
		obj.insertAtLast(1);
		obj.insertAtLast(2);
		obj.insertAtLast(3);
		obj.insertAtLast(3);
		obj.insertAtLast(5);
		System.out.println("\nLinked list");
		obj.display(obj.head);
		System.out.println("\nlength of linked list");
		System.out.println(obj.length());

	}

}
