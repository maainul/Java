package june10_2020;

/*
 * Remove duplicate from an unsorted linked list
Write a removeDuplicates() function which takes a list and deletes 
any duplicate nodes from
the list. The list is not sorted.

For example if the linked list is 12->11->12->21->41->43->21 

then removeDuplicates() should

convert the list to 12->11->21->41->43.
 */
public class Problem6 {
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

	private void removeDuplicates(ListNode head) {
		ListNode cur = head;
		while (cur != null) {
			ListNode pre = cur;
			while (pre.next != null) {
				if (pre.next.data == cur.data) {
					pre.next = pre.next.next;
				} else {
					pre = pre.next;
				}
			}
			cur = cur.next;

		}

	}

	public static void main(String[] args) {
		Problem6 obj1 = new Problem6();
		obj1.insertAtLast(5);
		obj1.insertAtLast(10);
		obj1.insertAtLast(21);
		obj1.insertAtLast(12);
		obj1.insertAtLast(19);
		obj1.insertAtLast(10);
		obj1.insertAtLast(21);

		System.out.println("Linked list");
		obj1.display(obj1.head);

		System.out.println("\nAfter delete duplicate node ");

		obj1.removeDuplicates(obj1.head);

		obj1.display(obj1.head);

	}

}
