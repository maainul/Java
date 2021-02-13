package dataStructureAndAlgorithm.LinkedList.GeekForGeeksAllExamples._29_ReverseaLinkedListInGroupsOfGivenSize;

/*
 * Reverse a Linked List in groups of given size | Set 1
Difficulty Level : Medium
 Last Updated : 05 Feb, 2021
Given a linked list, write a function to reverse every k nodes (where k is an input to the function). 

Example: 

Input: 1->2->3->4->5->6->7->8->NULL, K = 3 
Output: 3->2->1->6->5->4->8->7->NULL 
Input: 1->2->3->4->5->6->7->8->NULL, K = 5 
Output: 5->4->3->2->1->8->7->6->NULL 

Recommended: Please solve it on “PRACTICE” first, before moving on to the solution.
Algorithm: reverse(head, k) 

Reverse the first sub-list of size k. 

While reversing keep track of the next node and previous node. 

Let the pointer to the next node be next and pointer to the previous node be prev. See this post for reversing a linked list.

head->next = reverse(next, k) ( Recursively call for rest of the list and link the two sub-lists )

Return prev ( prev becomes the new head of the list (see the diagrams of iterative method of this post) )

Below is image shows how the reverse function works: 


Below is the implementation of the above approach:


 */
public class _29_ReverseLinkedListGroup {
	Node head; // head of list

	/* Linked list Node */
	class Node {
		int data;
		Node next;

		Node(int d) {
			data = d;
			next = null;
		}
	}
	/* Utility functions */

	/* Inserts a new Node at front of the list. */
	public void push(int new_data) {
		/*
		 * 1 & 2: Allocate the Node & Put in the data
		 */
		Node new_node = new Node(new_data);

		/* 3. Make next of new Node as head */
		new_node.next = head;

		/* 4. Move the head to point to new Node */
		head = new_node;
	}

	/* Function to print linked list */
	void printList() {
		Node temp = head;
		while (temp != null) {
			System.out.print(temp.data + " ");
			temp = temp.next;
		}
		System.out.println();
	}

	private Node reverse(Node head, int k) {

		if (head == null) {
			return null;
		}

		Node currentNode = head;
		Node nextNode = null;
		Node prevNode = null;

		int count = 0;
		while (count < k && currentNode != null) {
			nextNode = currentNode.next;
			currentNode.next = prevNode;
			prevNode = currentNode;
			currentNode = nextNode;
			count++;

		}

		/*
		 * next is now a pointer to (k+1)th node Recursively call for the list starting
		 * from current. And make rest of the list as next of first node
		 */
		if (nextNode != null) {
			head.next = reverse(nextNode, k);
		}

		return prevNode;
	}

	/* Driver program to test above functions */
	public static void main(String[] args) {

		_29_ReverseLinkedListGroup llist = new _29_ReverseLinkedListGroup();
		/*
		 * Constructed Linked List is 1->2->3->4->5->6-> 7->8->8->9->null
		 */
		llist.push(9);
		llist.push(8);
		llist.push(7);
		llist.push(6);
		llist.push(5);
		llist.push(4);
		llist.push(3);
		llist.push(2);
		llist.push(1);

		System.out.println("Given Linked List");
		llist.printList();

		llist.head = llist.reverse(llist.head, 3);

		System.out.println("Reversed list");
		llist.printList();

	}

}
