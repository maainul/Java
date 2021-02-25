package nov11;

public class _2_Problem {
	Node headNode;

	public void insertAtlast(int data) {
		Node newNode = new Node(data);
		if (headNode == null) {
			headNode = newNode;
		} else {
			Node currentNode = headNode;
			while (currentNode.nextNode != null) {
				currentNode = currentNode.nextNode;
			}
			currentNode.nextNode = newNode;
		}
	}

	public boolean palindrome() {
		Node firstNode = headNode;
		Node slowNode = headNode;
		Node revHeadNode = null;

		while (firstNode != null && firstNode.nextNode != null) {
			slowNode = slowNode.nextNode;
			firstNode = firstNode.nextNode.nextNode;

		}

		revHeadNode = reverse(slowNode.nextNode);

		return compare(revHeadNode, headNode);

	}

	private boolean compare(Node revHeadNode, Node headNode) {
		Node l1 = revHeadNode;
		Node l2 = headNode;

		while (l1 != null && l2 != null) {
			if (l1.data != l2.data) {
				return false;
			}
			l1 = l1.nextNode;
			l2 = l2.nextNode;

		}
		return true;

	}

	private Node reverse(Node headNode) {
		Node currentNode = headNode;
		Node previousNode = null;
		Node next = null;
		while (currentNode != null) {
			next = currentNode.nextNode;
			currentNode.nextNode = previousNode;
			previousNode = currentNode;
			currentNode = next;

		}
		return previousNode;

	}

	public void display() {
		Node tempNode = headNode;
		while (tempNode != null) {
			System.out.print(tempNode.data + "---->");
			tempNode = tempNode.nextNode;
		}
	}

	public void display(Node resultNode) {
		Node tempNode = headNode;
		while (tempNode != null) {
			System.out.print(tempNode.data + "---->");
			tempNode = tempNode.nextNode;
		}
	}

	public static void main(String[] args) {

		_2_Problem palindrome = new _2_Problem();
		palindrome.insertAtlast(1);
		palindrome.insertAtlast(1);
		palindrome.insertAtlast(0);
		palindrome.insertAtlast(0);
		palindrome.insertAtlast(1);
		palindrome.insertAtlast(1);
		palindrome.insertAtlast(1);
		palindrome.insertAtlast(0);

		System.out.println("\nIs it Palindrome");

		System.out.println(palindrome.palindrome());

	}

}
