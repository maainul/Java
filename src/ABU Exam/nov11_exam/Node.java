package nov11;

public class Node {
	Node headNode;

	public int data;
	public Node nextNode;

	public Node() {

	}

	public Node(int data) {
		this.data = data;
		this.nextNode = null;

	}

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

	public void display() {
		Node tempNode = headNode;
		while (tempNode != null) {
			System.out.print(tempNode.data + "---->");
			tempNode = tempNode.nextNode;
		}
	}

}
