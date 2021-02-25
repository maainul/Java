package nov11;


public class _5_Problem {
	Node headNode;

	public void insertAtlast(Node newNode) {

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

	public Node addLinkedList(Node l1, Node l2) {
		int val1 = 0, val2 = 0;
		int carry = 0, sum = 0, val = 0;

		Node dummyNode = new Node(0);
		Node dummyheadNode = dummyNode;

		while (l1 != null || l2 != null) {
			if (l1 != null) {
				val1 = l1.data;
				l1 = l1.nextNode;
			} else {
				val1 = 0;
			}

			if (l2 != null) {
				val2 = l2.data;
				l2 = l2.nextNode;
			} else {
				val2 = 0;
			}

			sum = val1 + val2 + carry;
			carry = (sum > 9) ? 1 : 0;

			val = sum % 10;

			dummyheadNode.nextNode = new Node(val);
			dummyheadNode = dummyheadNode.nextNode;

		}

		if (carry == 1) {
			dummyheadNode.nextNode = new Node(1);
		}
		return dummyNode.nextNode;
	}

	public void display() {
		Node tempNode = headNode;
		while (tempNode != null) {
			System.out.print(tempNode.data + "---->");
			tempNode = tempNode.nextNode;
		}
	}
	
	public void display(Node head) {
		Node tempNode = headNode;
		while (tempNode != null) {
			System.out.print(tempNode.data + "---->");
			tempNode = tempNode.nextNode;
		}
	}

	public static void main(String[] args) {

		_5_Problem obj1 = new _5_Problem();
		Node head1 = new Node(5);
		obj1.insertAtlast(head1);
		obj1.insertAtlast(new Node(6));
		obj1.insertAtlast(new Node(3));
		System.out.println("List 1 : ");
		obj1.display();

		Node head2 = new Node(6);

		_5_Problem obj2 = new _5_Problem();
		obj2.insertAtlast(new Node(4));
		obj2.insertAtlast(new Node(4));
		obj2.insertAtlast(new Node(3));
		System.out.println();
		obj2.display();

		_5_Problem obj = new _5_Problem();

		Node resultNode = obj.addLinkedList(head1, head2);
		obj.display(resultNode);
		
	}
}




