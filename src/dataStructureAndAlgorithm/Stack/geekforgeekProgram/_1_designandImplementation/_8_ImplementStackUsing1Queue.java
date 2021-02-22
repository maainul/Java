package dataStructureAndAlgorithm.Stack.geekforgeekProgram._1_designandImplementation;
/*
Implement a stack using single queue
Difficulty Level : Easy
Last Updated : 12 Feb, 2019
We are given queue data structure, the task is to implement stack using only given queue data structure.

We have discussed a solution that uses two queues. In this article,
a new solution is discussed that uses only one queue.
This solution assumes that we can find size of queue at any point.
The idea is to keep newly inserted element always at rear of queue,
keeping order of previous elements same. Below are complete steps.

// x is the element to be pushed and s is stack
push(s, x)
  1) Let size of q be s.
  1) Enqueue x to q
  2) One by one Dequeue s items from queue and enqueue them.

// Removes an item from stack
pop(s)
  1) Dequeue an item from q

 */

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

class MyStack {
    Queue<Integer> queue = new LinkedList<>();

    // push operation
    void push(int val) {
        // get size of the queue
        int size = queue.size();
        // add current element
        queue.add(val);

        // pop (or Dequeue) all previous elements
        // and put the after current element
        for (int i = 0; i < size; i++) {
            // this will add front element into rear of queue
            int x = queue.remove();
            queue.add(x);
        }
    }

    int pop() {
        if (queue.isEmpty()) {
            System.out.println("No element Found");
            return -1;
        }
        return queue.remove();
    }

}


public class _8_ImplementStackUsing1Queue {
    public static void main(String[] args) {
        MyStack stack = new MyStack();
        stack.push(10);
        stack.push(40);
        stack.push(70);
        stack.push(50);
        System.out.println(stack.pop());

    }
}
