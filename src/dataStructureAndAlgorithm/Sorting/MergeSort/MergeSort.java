package dataStructureAndAlgorithm.Sorting.MergeSort;

public class MergeSort {

	static Node merge(Node left, Node right) {
		if (left == null)
			return right;
		if (right == null)
			return left;

		Node result = null;

		if (left.data <= right.data) {
			result = left;
			result.next = merge(left.next, right);
		} else {
			result = right;
			result.next = merge(left, right.next);
		}
		return result;
	}

	static Node mergeSort(Node head) {
		if (head == null || head.next == null)
			return head;

		Node middle = getMiddle(head);
		Node nextofmiddle = middle.next;
		middle.next = null;
		Node left = mergeSort(head);
		Node right = mergeSort(nextofmiddle);
		Node sortedlist = merge(left, right);
		return sortedlist;
	}

	static Node getMiddle(Node head) {
		if (head == null)
			return head;
		Node fastPtr = head.next;
		Node slowPtr = head;

		while (fastPtr != null && fastPtr.next != null) {
			slowPtr = slowPtr.next;
			fastPtr = fastPtr.next.next;
		}
		return slowPtr;
	}

	public static void main(String[] args) {

		Node list = new Node();
		list.insertAtlast(38);
		list.insertAtlast(27);
		list.insertAtlast(9);
		list.insertAtlast(3);
		list.insertAtlast(82);
		// nodeRef.push(10).push(82).push(9).push(3).push(43).push(27).push(38);

		System.out.print("UNSorted Linked List is: ");
		list.display(list.head);

		list.head = mergeSort(list.head);

		System.out.print("Sorted Linked List is: ");
		list.display(list.head);
	}
}