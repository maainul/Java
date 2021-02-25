package june10_2020;

/*
 * 1.
Problem statement

Given a pointer to the head of a linked list, 
write a method to print all the elements in the linked
list. 
The head of the linked list could also be NULL i.e the linked list could also be empty.

Input
Your method will have one arguments - pointer to the head of linked list.

Output
Your method should print each element of the linked list on a single line on console
 */
public class Problem1 {
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
		Problem1 obj = new Problem1();
		obj.insertAtLast(1);
		obj.insertAtLast(2);
		obj.insertAtLast(3);

		System.out.println("\nLinked list");

		obj.display(obj.head);

	}

}
