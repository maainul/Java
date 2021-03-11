package quiz_2021_March;

public class _2_PalindromLinkedList {
	public static void main(String[] args) {
		Node node1 = new Node();
		node1.insertAtLast('C');
		node1.insertAtLast('A');
		node1.insertAtLast('C');
		node1.insertAtLast('A');

		_2_PalindromLinkedList obj = new _2_PalindromLinkedList();
		boolean res = obj.checkPalindrome(node1.head);
		if (res == true) {
			System.out.println("Character is palindrome");
		} else {
			System.out.println("Not palindrome");
		}
	}

	private boolean checkPalindrome(Node head) {
		if (head == null) {
			return false;
		}
		Node middleNode = getMiddle(head);

		Node revheadNode = reverse(middleNode);

		return compare(head, revheadNode);
	}

	private Node reverse(Node middleNode) {
		Node preNode = null;
		Node curNode = middleNode;
		while (curNode != null) {
			Node nxtNode = curNode.next;
			curNode.next = preNode;
			preNode = curNode;
			curNode = nxtNode;

		}
		return preNode;
	}

	private boolean compare(Node head1, Node head2) {
		while (head1 != null && head2 != null) {
			if (head1.cdata != head2.cdata) {

				return false;
			} else {
				head1 = head1.next;
				head2 = head2.next;
			}
		}

		return true;
	}

	private Node getMiddle(Node head) {
		Node slowNode = head;
		Node fastNode = head;
		while (fastNode != null && fastNode.next != null) {
			fastNode = fastNode.next.next;
			slowNode = slowNode.next;
		}
		return slowNode;
	}

}
