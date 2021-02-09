package dataStructureAndAlgorithm.Queue.ArrayRepresentation;

public class Main {
	public static void main(String args[]) {
		Queue queue = new Queue();
		queue.enqueue(8);
		queue.enqueue(6);
		queue.enqueue(18);
		queue.enqueue(61);

		queue.show();
		System.out.println("\nSize of the queue is: " + queue.getSize());
		System.out.println("\nQueue is Empty : " + queue.isEmpty());
		queue.dequeue();
		queue.show();
		System.out.println();
		queue.dequeue();
		queue.show();
		System.out.println();
		queue.dequeue();
		queue.show();
		System.out.println();
		queue.dequeue();
		queue.show();

		System.out.println();
		queue.dequeue();
		queue.show();

	}
}
