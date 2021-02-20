// reference : https://www.tutorialspoint.com/how-can-we-implement-a-queue-using-stack-in-java
package dataStructureAndAlgorithm.Stack.geekforgeekProgram._1_designandImplementation;

import java.util.Stack;

class MyQueue {
    Stack<Integer> s1 = new Stack<>();
    Stack<Integer> s2 = new Stack<>();

    // Add an item to the queue
    public void enqueue(int x) {
        // push item into the first stack
        s1.push(x);
        System.out.println(x + " inserted");
    }

    // Remove an item from the queue
    public void dequeue() {
        if (s2.isEmpty()) {
            while (!s1.isEmpty()) {
                s2.push(s1.pop());
            }
        }
        System.out.println(s2.pop() + " remove");
    }
}


public class _1_QueueUsing2Stack {
    public static void main(String[] args) {
        MyQueue myQueue = new MyQueue();
        myQueue.enqueue(1);
        myQueue.enqueue(2);
        myQueue.enqueue(3);
        myQueue.dequeue();

    }
}
