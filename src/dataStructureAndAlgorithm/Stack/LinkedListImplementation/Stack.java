package dataStructureAndAlgorithm.Stack.LinkedListImplementation;

class Stack {
	Node topNode;
	int length;

	public Stack() {
		topNode = null;
		length = 0;
	}

	public void push(int data) {
		Node node = new Node(data);
		node.nextNode = topNode;
		topNode = node;
		length++;
	}

	public int pop() {
		if (isEmpty()) {
			System.out.println("Stack is empty..");
		}

		int data = topNode.data;
		topNode = topNode.nextNode;
		length--;
		return data;

	}

	public int peek() {
		if (isEmpty()) {
			System.out.println("Stack is empty..");
		}

		return topNode.data;
	}

	public void show() {
		Node currentNode = topNode;
		while (currentNode != null) {
			System.out.print(currentNode.data + " ");
			currentNode = currentNode.nextNode;
		}
		System.out.println();
	}

	public int length() {
		return length;
	}

	public boolean isEmpty() {
		return length == 0;
	}
}
