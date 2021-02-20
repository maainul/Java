

package dataStructureAndAlgorithm.Stack.geekforgeekProgram._1_designandImplementation;

// https://java2blog.com/implement-stack-using-two-queues-in-java/

/*
Implement Stack using two Queues in java


There are two most important operations of Stack:
Lets say you have two queues : queue1 , queue2

Push :
If queue1 is empty, add elements to queue1
If queue1 is not empty, add all elements of queue1 to queue2 , add current element to queue1 and copy all elements of queue2 to queue1.
Pop : Simply remove element from queue1.
 */

import java.util.LinkedList;
import java.util.Queue;

class MyQueueDS {

    Queue<Integer> queue1;
    Queue<Integer> queue2;

    MyQueueDS() {
        queue1 = new LinkedList<Integer>();
        queue2 = new LinkedList<Integer>();
    }

    // version one -----
    public void pushv1(int value) {

        if (queue1.size() == 0) {
            queue1.add(value);
        } else {
            int sizeOfQueue1 = queue1.size();
            //copy element of q1 to q2
            for (int i = 0; i < sizeOfQueue1; i++) {
                queue2.add(queue1.remove());
            }
            queue1.add(value);
            // Copy elements for Queue2 to Queue1
            for (int k = 0; k < sizeOfQueue1; k++)
                queue1.add(queue2.remove());
        }
    }

    // Original short code version
    public void push(int value) {

        if (queue1.size() == 0) {
            queue1.add(value);
        } else {
            int sizeOfQueue1 = queue1.size();
            //copy element of q1 to q2
            for (int i = 0; i < sizeOfQueue1; i++) {
                queue2.add(queue1.remove());
            }
            queue1.add(value);
            // Copy elements for Queue2 to Queue1
            for (int k = 0; k < sizeOfQueue1; k++)
                queue1.add(queue2.remove());
        }


        while (!queue1.isEmpty()) {
            queue2.add(queue1.remove());
        }
        queue1.add(value);

        while (!queue2.isEmpty()) {
            queue1.add(queue2.remove());
        }

    }

    public int pop() {
        if (queue1.isEmpty()) {
            throw new QueueEmptyException("UnderFlow Exception");
        }
        return queue1.remove();
    }
}

public class _4_StackUsingQueue {
    public static void main(String[] args) {
        MyQueueDS stack = new MyQueueDS();
        stack.push(20);
        stack.push(40);
        stack.push(70);
        stack.push(50);
        stack.push(90);
        stack.push(110);
        stack.push(30);
        System.out.println("Removed element : " + stack.pop());
        stack.push(170);
        System.out.println("Removed element : " + stack.pop());

    }
}

class QueueEmptyException extends RuntimeException {
    public QueueEmptyException() {
        super();
    }

    public QueueEmptyException(String message) {
        super(message);
    }
}