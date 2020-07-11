package dataStructureAndAlgorithms.Queue.LinkedListRepresentation;

public class Queue {
	Node frontNode;
	Node rearNode;
	int length;
	
	public Queue() {
		
		this.frontNode = null;
		this.rearNode = null;
		this.length = 0;
	}
	
	public int length() {
		return length;
	}
	
	public boolean isEmpty() {
		return length == 0;
	}
	
	// inserting the value to the rear
	public void enqueue(int data) {
		Node node = new Node(data);
		if(isEmpty()) {
			frontNode = node;
		}
		else {
			rearNode.nexNode = node;
		}
		rearNode = node;
		length++;
		
	}
	
	// dequeue / delete the value from the queue ..
	public int dequeue() {
		if (isEmpty()) {
			System.out.println("No valuee in the list..");
		}
		int result = frontNode.data;
		frontNode = frontNode.nexNode;
		if(frontNode == null) {
			rearNode = null;
		}
		length --;
		return result;
	}
	
	// display the value..
	public void show() {
		Node currentNode = frontNode;
		while(currentNode != null) {
			System.out.print(currentNode.data+"--->");
			currentNode = currentNode.nexNode;
		}
		System.out.println(currentNode);
		
	}

}
