package dataStructureAndAlgorithm.LinkedList.basicTheory.Circular;

public class CircularLinkList {
	Node lastNode;
	int length;

	public CircularLinkList() {
		this.lastNode = null;
		this.length = 0;
	}

	public int length() {
		return length;
	}

	public boolean isEmpty() {
		return length == 0;
	}

	public void insertAtBeginning(int data) {
		Node node = new Node(data);
		// it will insert first node.. if there is no node available
		if (lastNode == null) {
			lastNode = node;
			// lastNode.nextNode = lastNode; // no need // dileo vhul hobena
			// because last node refer as a last node in first time.. but it will not
			// support in the next time
			// next time we have to give the last.next = node;
		} else {
			node.nextNode = lastNode.nextNode;
		}
		lastNode.nextNode = node;
		length++;

	}

	public void insertAtLast(int data) {
		Node node = new Node(data);
		if (lastNode == null) {
			lastNode = node;
			lastNode.nextNode = lastNode;
		} else {
			node.nextNode = lastNode.nextNode;
			lastNode.nextNode = node;
			lastNode = node;
		}
		// lastNode.nextNode = node; // no need
		length++;

	}

	public void display() {
		if (lastNode == null) {
			return;
		}
		Node firstNode = lastNode.nextNode;
		while (firstNode != lastNode) {
			System.out.print(firstNode.data + " ");
			firstNode = firstNode.nextNode;
		}
		System.out.println(firstNode.data);
	}

}
