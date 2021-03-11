package quiz_2021_March;

public class Node {
	Node head;
	int data;
	Node next;
	char cdata;

	Node(int data) {
		this.data = data;
		this.next = null;
	}

	Node() {

	}

	Node(char cdata){
		this.cdata = cdata;
		this.next = null;
	}
	
	
	public void display(Node head) {
		Node cur = head;
		while (cur != null) {
			System.out.print(cur.data + " ");
			cur = cur.next;
		}
	}

	public void insertAtLast(int data) {
		Node newNode = new Node(data);
		if (head == null) {
			head = newNode;
		} else {
			Node cur = head;
			while (cur.next != null) {
				cur = cur.next;
			}
			cur.next = newNode;
		}
	}
	
	
	public void insertAtLast(char data) {
		Node newNode = new Node(data);
		if (head == null) {
			head = newNode;
		} else {
			Node cur = head;
			while (cur.next != null) {
				cur = cur.next;
			}
			cur.next = newNode;
		}
	}
	
	
	
	

}
