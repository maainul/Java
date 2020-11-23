package dataStructureAndAlgorithm.LinkedList;

/*
Program for n’th node from the end of a Linked List
Given a Linked List and a number n, write a function
that returns the value at the n’th node from the end of the Linked List.
For example, if the input is below list and n = 3, then output is “B”
 */
public class _11_FindNthNode {
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

	// 11. Write a function to get Nth node in a Linked List
	private void FindNode(int index) {
		ListNode c = head;
		boolean flag = false;
		int position = 1;
		while (c != null) {
			if (position == index) {

				flag = true;
				break;
			}
			position++;
			c = c.next;
		}

		if (flag) {
			System.out.println("Data found  = " + c.data);
		} else {
			System.out.println("Data not Found");
		}

	}

	// 11. Write a function to get Nth node in a Linked List
	private int FindNodeVersion2(int index) {
		ListNode c = head;
		// boolean flag = false;

		int position = 1;
		while (c != null) {
			if (position == index) {
				return c.data;
				// flag = true;
				// break;
			}
			position++;
			c = c.next;
		}
		return 0;
	}

	private void NthNodeOriginal(int index) {
		ListNode current = head;
		int count = 0;
		boolean flag = false;
		while (current != null && count < index) {
			flag = true;
			count++;
			current = current.next;
		}
		if (flag) {
			System.out.println("Data found." + current.data);
		} else {
			System.out.println("Data not found");
		}
	}

	public static void main(String[] args) {
		_11_FindNthNode obj = new _11_FindNthNode();
		obj.insertAtLast(11);
		obj.insertAtLast(22);
		obj.insertAtLast(33);
		obj.insertAtLast(44);
		obj.insertAtLast(55);
		obj.insertAtLast(66);

		obj.display();
		System.out.println();
		obj.FindNode(4);

		// solution : https://coderanch.com/t/687171/java/Nth-node-Linked-List
		System.out.println("\nWrite a function to get Nth node in a Linked List");
		int result = obj.FindNodeVersion2(3);
		if (result == 0) {
			System.out.println("Node is not found");
		} else {
			System.out.println("Node found = " + result);
		}

		System.out.println("\n----Version 3----");

		obj.NthNodeOriginal(4);

	}
}
