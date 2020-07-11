package dataStructureAndAlgorithms.Queue.LinkedListRepresentation;

public class Main {

	public static void main(String[] args) {
		Queue queue = new Queue();
		queue.enqueue(10);
		queue.enqueue(5);
		queue.enqueue(9);
		queue.show();
		queue.dequeue();
		queue.show();
	}

}
// 10--->5--->9--->null
// 5--->9--->null
