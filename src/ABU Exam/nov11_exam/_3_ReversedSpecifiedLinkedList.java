/*
package nov11;

public class _3_ReversedSpecifiedLinkedList {
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

	private Node reverseSpecificPortion(int start, int end) {
		Node head = headNode;
		Node currentNode = headNode;
		int count = 1;
		while (count < start - 1) {
			count++;
			currentNode = currentNode.nextNode;
		}

		Node firstConnectorNode = currentNode;

		Node revHeadNode = currentNode.nextNode;

		Node tempNode = revHeadNode;
		while (count < end - 1) {
			count++;
			tempNode = tempNode.nextNode;
		}

		Node secondConnector = tempNode.nextNode;
		tempNode.nextNode = null;

		Node revNode = reverse(revHeadNode);

		firstConnectorNode.nextNode = revNode;
		revHeadNode.nextNode = secondConnector;

		// revNode.nextNode = secondConnector;
		// firstConnectorNode.nextNode = revNode;

		return head;
	}

	private Node reverse(Node revHeadNode) {
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
		_3_ReversedSpecifiedLinkedList obj1 = new _3_ReversedSpecifiedLinkedList();
		obj1.insertAtlast(5);
		obj1.insertAtlast(6);
		obj1.insertAtlast(3);
		obj1.insertAtlast(7);
		obj1.insertAtlast(9);
		obj1.insertAtlast(4);
		obj1.display();

		System.out.println("\nReverse Specific Portion");
		Node oNode = obj1.reverseSpecificPortion(2, 4);
		obj1.display(oNode);

	}

}
*/