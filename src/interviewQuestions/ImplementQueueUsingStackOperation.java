package interviewQuestions;

import java.util.Stack;

class MyQueue {

    private Stack<Integer> s1 = new Stack<>();
    private Stack<Integer> s2 = new Stack<>();
    private int front;

    /**
     * Initialize your data structure here.
     */
    public MyQueue() {

    }

    /**
     * Push element x to the back of queue.
     */
    public void push(int x) {
        if (s1.isEmpty()) {
            front = x;
        }
        s1.push(x);

    }

    /**
     * Removes the element from in front of queue and returns that element.
     */
    public int pop() {
        if (s2.isEmpty()) {
            while (!s1.isEmpty()) {
                s2.push(s1.pop());
            }
        }
        return s2.pop();

    }

    /**
     * Get the front element.
     */
    public int peek() {
        if (!s2.isEmpty()) {
            return s2.peek();
        }
        return front;

    }

    /**
     * Returns whether the queue is empty.
     */
    public boolean empty() {
        return s1.isEmpty() && s2.isEmpty();
    }
}


public class ImplementQueueUsingStackOperation {
    public static void main(String[] args) {

        MyQueue obj = new MyQueue();

        obj.push(10);
        obj.push(20);
        obj.push(30);
        obj.push(40);
        int param_2 = obj.pop();
        System.out.println("Popped element = " + param_2);
        int param_3 = obj.peek();

        System.out.println("Peeked element = " + param_3);
        boolean param_4 = obj.empty();
        System.out.println("Queue empty or not = " + param_4);
    }
}

