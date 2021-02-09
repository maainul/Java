package dataStructureAndAlgorithm.Queue.CircularQueue;

public class Queue {
	int queue[] = new int[5];
	int data;
	int front;
	int rear;
	int size;

	public void enqueue(int data) {
		if (isFull()) {
			System.out.println("Queue is full....");
		} else {
			queue[rear] = data;
			rear = (rear + 1) % 5;
			size = size + 1;
		}
	}

	public int dequeue() {
		int data = queue[front];
		if (isEmpty()) {
			System.out.println("Queue is empty");

		} else {
			front = (front + 1) % 5;
			size = size - 1;
		}
		return data;
	}

	public void show() {
		for (int i = 0; i < size; i++) {
			System.out.print(queue[(front + i) % 5] + "---->");
		}
		System.out.println();
	}

	public int getSize() {
		return size;
	}

	public boolean isEmpty() {
		return getSize() == 0;
	}

	public boolean isFull() {
		return getSize() == 5;
	}

}