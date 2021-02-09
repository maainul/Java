package dataStructureAndAlgorithm.LinkedList;

public class _20_PalindromeLinkedList {
	ListNode head;

	public class ListNode {
		int data;
		ListNode next;

		ListNode(int data) {
			this.data = data;
			this.next = null;
		}
	}

	private void insertAtLast(int data) {
		ListNode newNode = new ListNode(data);
		ListNode current = head;
		if (head == null) {
			head = newNode;
		} else {
			while (current.next != null) {
				current = current.next;
			}
			current.next = newNode;
		}
	}

	private void display() {
		ListNode current = head;
		while (current != null) {
			System.out.print(current.data + "->");
			current = current.next;
		}
	}

	private boolean palindrome(ListNode head) {
		ListNode slow = head;
		ListNode fast = head;
		ListNode revhead = null;
		if (head == null || head.next == null) {
			return true;
		}
		while (fast != null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;
		}
		revhead = reverse(slow);
		return compare(head, revhead);
	}

	private ListNode reverse(ListNode head) {
		ListNode current = head;
		ListNode previous = null;
		ListNode next = null;
		while (current != null) {
			next = current.next;
			current.next = previous;
			previous = current;
			current = next;
		}
		return previous;
	}

	private boolean compare(ListNode l1, ListNode l2) {
		while (l1 != null && l2 != null) {
			if (l1.data != l2.data) {
				return false;
			} else {
				l1 = l1.next;
				l2 = l2.next;
			}
		}
		return (l1 == null && l2 == null);
	}

	public static void main(String[] args) {
		_20_PalindromeLinkedList obj = new _20_PalindromeLinkedList();
		obj.insertAtLast(1);
		obj.insertAtLast(2);
		obj.insertAtLast(1);

		obj.display();
		System.out.println();

		System.out.println("\npalindrome number ");
		obj.display();
		boolean res = obj.palindrome(obj.head);
		if (res) {
			System.out.println("\nPalindrom LinkedList");
		} else {
			System.out.println("\nNot Palindrom LinkedList");
		}

	}

}
