/*
Implement Stack using Queues
Difficulty Level : Easy
Last Updated : 19 Aug, 2019
The problem is opposite of this post. We are given a Queue data structure that supports standard operations like enqueue()
and dequeue().
We need to implement a Stack data structure using only instances of Queue and queue operations allowed on the instances.
Stack and Queue with insert and delete operations

Recommended: Please solve it on “PRACTICE” first, before moving on to the solution.


A stack can be implemented using two queues. Let stack to be implemented be ‘s’
and queues used to implement be ‘q1’ and ‘q2’. Stack ‘s’ can be implemented in two ways:

Method 1 (By making push operation costly)
This method makes sure that newly entered element is always at the front of ‘q1’,
so that pop operation just dequeues from ‘q1’. ‘q2’ is used to put every new element at front of ‘q1’.

push(s, x) operation’s step are described below:
Enqueue x to q2
One by one dequeue everything from q1 and enqueue to q2.
Swap the names of q1 and q2
pop(s) operation’s function are described below:
Dequeue an item from q1 and return it.
Below is the implementation of the above approach:



 */


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
        // Removed element : 30

        stack.push(170);
        System.out.println("Removed element : " + stack.pop());
        // Removed element : 170
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