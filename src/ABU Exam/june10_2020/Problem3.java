package june10_2020;

/*
Write a function that counts the number of times a given 
int occurs in a Linked List

Given a singly linked list and a key, 
count number of occurrences of given key in linked list. 
For example,
 
if given linked list is 1->2->1->2->1->3->1 and given key is 1, 

then output should be 4.
 */
public class Problem3 {
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

	private int occursLinkedlist(ListNode head, int k) {
		ListNode cur = head;
		int count = 0;
		while (cur != null) {
			if (cur.data == k) {
				count++;
			}
			cur = cur.next;
		}
		return count;
	}

	public static void main(String[] args) {
		Problem3 obj = new Problem3();
		obj.insertAtLast(1);
		obj.insertAtLast(2);
		obj.insertAtLast(3);
		obj.insertAtLast(1);
		obj.insertAtLast(5);
		obj.insertAtLast(1);
		obj.insertAtLast(1);

		System.out.println("Linked list");
		obj.display(obj.head);

		System.out.println("\nOccurs linked list");
		int result = obj.occursLinkedlist(obj.head, 1);
		System.out.println(result);
	}
}
